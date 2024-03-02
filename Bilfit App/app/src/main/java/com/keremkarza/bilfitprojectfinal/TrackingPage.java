package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TrackingPage extends AppCompatActivity {
    private TextView t1,t2,t3,t4,t5;
    private Button b1,b2,b3,b4,b5;
    private ArrayList<String> values;
    private ArrayList<TextView> textViews;
    private ArrayList<Button> buttons;

    FirebaseFirestore db;
    FirebaseUser wUser;
    FirebaseAuth wAuth;
    Map<String, Object> weight;
    String weight1;
    ImageView back;
    private Map<String, Object> receivedTracking;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);

        values = new ArrayList<String>();

        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        /*
        textViews.add(t1);
        textViews.add(t2);
        textViews.add(t3);
        textViews.add(t4);
        textViews.add(t5);
        */
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);



        db = FirebaseFirestore.getInstance();
        wAuth = FirebaseAuth.getInstance();
        wUser = wAuth.getCurrentUser();


        receivedTracking = new HashMap<>();

        getTracking();

        //DocumentReference documentReference = db.collection("tracking").document(date);

        //db.collection("tracking").document(date).get();

    }

    public HashMap getTracking(){
        HashMap temp = new HashMap<>();

        DocumentReference docRef = db.collection("tracking").document(wUser.getUid());
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        //Toast.makeText(TrackingPage.this,document.getData().toString(),Toast.LENGTH_SHORT).show();
                        int value = 26;
                        if (document.getData().containsKey("1") ) {
                            value = Integer.parseInt(document.getData().get("1").toString());
                            b1.setText( convertNumberToString( value ) );
                            t1.setText( String.valueOf(convertScaleToWeight(value)) + "kg  " );

                        }
                        if (document.getData().containsKey("2") ) {
                            value = Integer.parseInt(document.getData().get("2").toString());
                            b2.setText( convertNumberToString( value ) );
                            t2.setText( String.valueOf(convertScaleToWeight(value)) + "kg  " );

                        }
                        if (document.getData().containsKey("3") ) {
                            value = Integer.parseInt(document.getData().get("3").toString());
                            b3.setText( convertNumberToString( value ) );
                            t3.setText( String.valueOf(convertScaleToWeight(value)) + "kg" );

                        }
                        if (document.getData().containsKey("4") ) {
                            value = Integer.parseInt(document.getData().get("4").toString());
                            b4.setText( convertNumberToString( value ) );
                            t4.setText( String.valueOf(convertScaleToWeight(value)) + "kg  " );

                        }
                        if (document.getData().containsKey("5") ) {
                            value = Integer.parseInt(document.getData().get("5").toString());
                            b5.setText( convertNumberToString( value ) );
                            t5.setText( String.valueOf(convertScaleToWeight(value)) + "kg" );

                        }



                        //t1.setText(document.getData());
                    } else {
                        Toast.makeText(TrackingPage.this,"No Such Document",Toast.LENGTH_SHORT).show();

                    }
                } else {
                    Toast.makeText(TrackingPage.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                }

            }
        });


        return temp;
    }

    public String convertNumberToString(int number){
        String s = "";
        for (int i = 0; i < number; i++) {
            s += 1;

        }
        return s;
    }
    // 40 - 75 - 110 - 160
    // 6  - 11 - 18  - 26
    public int convertScaleToWeight(int scale){
        int weight = 50;
        int cWeight = 5*(scale - 6);

        return weight+cWeight;
    }
}
