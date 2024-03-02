package com.keremkarza.bilfitprojectfinal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class RegisterInfo extends AppCompatActivity {
    FirebaseFirestore db;
    Map<String, Object> loginInfo;
    private EditText editWeight,editHeight,editChest,editNest,editHip,editWaist,editAge;
    private String txtWeight,txtHeight,txtChest,txtNest,txtHip,txtWaist,txtAge;
    private String txtGoal,txtActivity,txtGender;
    static String firstweight;
    private RadioGroup goal,activity,gender;
    private RadioButton goalB,activityB,genderB;

    private Map<String, String> tracking;


    private FirebaseUser mUser;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_info);
        db = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();

        editWeight = (EditText) findViewById(R.id.weight);
        editHeight = (EditText) findViewById(R.id.height);
        editChest = (EditText) findViewById(R.id.chest);
        editNest = (EditText) findViewById(R.id.nest);
        editHip = (EditText) findViewById(R.id.hip);
        editWaist = (EditText) findViewById(R.id.waist);
        editAge = (EditText) findViewById(R.id.age);

        goal = (RadioGroup) findViewById(R.id.goal);
        activity = (RadioGroup) findViewById(R.id.activity);
        gender = (RadioGroup) findViewById(R.id.gender);

        int selectedActivityId = activity.getCheckedRadioButtonId();
        int selectedGenderId = gender.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        activityB = (RadioButton) findViewById(selectedActivityId);
        genderB = (RadioButton) findViewById(selectedGenderId);



    }
    public void enter(View view) {
        Toast.makeText(this,"entered!",Toast.LENGTH_SHORT).show();
        txtWeight = editWeight.getText().toString();
        txtHeight = editHeight.getText().toString();
        txtChest = editChest.getText().toString();
        txtNest = editNest.getText().toString();
        txtHip = editHip.getText().toString();
        txtWaist = editWaist.getText().toString();
        txtAge = editAge.getText().toString();

        int selectedGoalId = goal.getCheckedRadioButtonId();
        goalB = (RadioButton) findViewById(selectedGoalId);
        int selectedActivityId = activity.getCheckedRadioButtonId();
        activityB = (RadioButton) findViewById(selectedActivityId);
        int selectedGenderId = gender.getCheckedRadioButtonId();
        genderB = (RadioButton) findViewById(selectedGenderId);

        txtGoal = (String) goalB.getText();
        txtActivity = (String) activityB.getText();
        txtGender = (String) genderB.getText();

        loginInfo = new HashMap<>();
        loginInfo.put("weight", txtWeight);
        loginInfo.put("height", txtHeight);
        loginInfo.put("chest", txtChest);
        loginInfo.put("nest", txtNest);
        loginInfo.put("hip", txtHip);
        loginInfo.put("waist", txtWaist);
        loginInfo.put("age", txtAge);

        loginInfo.put("goal", txtGoal);
        loginInfo.put("activity", txtActivity);
        loginInfo.put("gender", txtGender);

        firstweight = txtWeight;
        mUser = mAuth.getCurrentUser();
        db.collection("information").document(mUser.getUid())
                .set(loginInfo).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(RegisterInfo.this,"success!",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(RegisterInfo.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                        }

                    }
                });

        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = dateObj.format(formatter);
        Toast.makeText(RegisterInfo.this,date,Toast.LENGTH_LONG).show();

        tracking = new HashMap<>();
        tracking.put("1", String.valueOf(convertDataToLenght(txtWeight)) );
        tracking.put("2", "0");
        tracking.put("3", "0");
        tracking.put("4", "0");
        tracking.put("5", "0");
        tracking.put("6", date);
        tracking.put("7", "2");
        tracking.put("8", "2");
        tracking.put("9", "2");
        tracking.put("10", "2");

        DocumentReference documentReference = db.collection("tracking").document(date);

        db.collection("tracking").document(mUser.getUid())
                .set(tracking).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(RegisterInfo.this,"success!",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(RegisterInfo.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                        }

                    }
                });



        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                //dormitory.setText(value.getString("dormitory"));
                //main.setText(value.getString("main"));
            }
        });

        Intent intent = new Intent(RegisterInfo.this,HomePage.class);
        startActivity(intent);

    }


    public int convertDataToLenght(String weight){
        int length = 6;
        int scale = 0;
        int data = Integer.parseInt(weight);
        if(data > 150){
            length = 26;
        }else if(data < 50){
            length = 6;
        }
        else{
            data = data - 50;
            scale = data / 5;
            length += scale;
        }
        return length;

    }

    public void checkButtonGoal(View view){
        int selectedGoalId = goal.getCheckedRadioButtonId();
        goalB = (RadioButton) findViewById(selectedGoalId);

        Toast.makeText(this,"Selected Goal : "+ goalB.getText(),Toast.LENGTH_SHORT).show();

    }
    public void checkButtonActivity(View view){
        int selectedActivityId = activity.getCheckedRadioButtonId();
        activityB = (RadioButton) findViewById(selectedActivityId);

        Toast.makeText(this,"Selected Activity : "+ activityB.getText(),Toast.LENGTH_SHORT).show();

    }
    public void checkButtonGender(View view){
        int selectedGenderId = gender.getCheckedRadioButtonId();
        genderB = (RadioButton) findViewById(selectedGenderId);

        Toast.makeText(this,"Selected Gender : "+ genderB.getText(),Toast.LENGTH_SHORT).show();

    }

}