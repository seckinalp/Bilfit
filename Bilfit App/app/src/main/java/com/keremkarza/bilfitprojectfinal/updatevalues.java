
package com.keremkarza.bilfitprojectfinal;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.auth.FirebaseUser;
        import com.google.firebase.firestore.FirebaseFirestore;

        import java.util.HashMap;
        import java.util.Map;

public class updatevalues extends AppCompatActivity {
    FirebaseFirestore db;
    Map<String, Object> loginInfo;

    private EditText editWeight,editHeight,editChest,editNest,editHip,editWaist,editAge;
    private String txtWeight,txtHeight,txtChest,txtNest,txtHip,txtWaist,txtAge;
    private String txtGoal,txtActivity,txtGender;

    private RadioGroup goal,activity,gender;
    private RadioButton goalB,activityB,genderB;

    private FirebaseUser mUser;
    private FirebaseAuth mAuth;


    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_values);
        back = findViewById(R.id.backarrow7);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(updatevalues.this,ProfilePage.class);
                startActivity(intent);
            }
        });
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


        mUser = mAuth.getCurrentUser();
        db.collection("information").document(mUser.getUid())
                .set(loginInfo).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(updatevalues.this,"success!",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(updatevalues.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                        }

                    }
                });

        Intent intent = new Intent(updatevalues.this,ProfilePage.class);
        startActivity(intent);

    }

    public void checkButtonGoal(View view){
        int selectedGoalId = goal.getCheckedRadioButtonId();
        goalB = (RadioButton) findViewById(selectedGoalId);


    }
    public void checkButtonActivity(View view){
        int selectedActivityId = activity.getCheckedRadioButtonId();
        activityB = (RadioButton) findViewById(selectedActivityId);



    }
    public void checkButtonGender(View view){
        int selectedGenderId = gender.getCheckedRadioButtonId();
        genderB = (RadioButton) findViewById(selectedGenderId);



    }

}