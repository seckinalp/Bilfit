package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SeeYourProgram extends AppCompatActivity {
    ImageView back;
    TextView start,exercise1,exercise2,exercise3,exercise4,exercise5,exercise6,set1,set2,set3,set4,set5,set6,rep1,rep2,rep3,rep4,rep5,rep6;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_your_program);

        start = findViewById(R.id.start);
        back = findViewById(R.id.backarrow);
        exercise1 = findViewById(R.id.exercise11);
        exercise2 = findViewById(R.id.exercise22);
        exercise3 = findViewById(R.id.exercise33);
        exercise4 = findViewById(R.id.exercise44);
        exercise5 = findViewById(R.id.exercise55);
        exercise6 = findViewById(R.id.exercise66);
        set1 = findViewById(R.id.set1);
        set2 = findViewById(R.id.set2);
        set3 = findViewById(R.id.set3);
        set4 = findViewById(R.id.set4);
        set5 = findViewById(R.id.set5);
        set6 = findViewById(R.id.set6);
        rep1 = findViewById(R.id.rep1);
        rep2 = findViewById(R.id.rep2);
        rep3 = findViewById(R.id.rep3);
        rep4 = findViewById(R.id.rep4);
        rep5 = findViewById(R.id.rep5);
        rep6 = findViewById(R.id.rep6);
        program program1 = new program();
        ArrayList<exercise> userProgram1 = program1.programx;

        exercise1.setText(userProgram1.get(0).name);
        exercise2.setText(userProgram1.get(1).name);
        exercise3.setText(userProgram1.get(2).name);
        exercise4.setText(userProgram1.get(3).name);
        exercise5.setText(userProgram1.get(4).name);
        exercise6.setText(userProgram1.get(5).name);
        set1.setText(String.valueOf(userProgram1.get(0).set));
        set2.setText(String.valueOf(userProgram1.get(1).set));
        set3.setText(String.valueOf(userProgram1.get(2).set));
        set4.setText(String.valueOf(userProgram1.get(3).set));
        set5.setText(String.valueOf(userProgram1.get(4).set));
        set6.setText(String.valueOf(userProgram1.get(5).set));
        rep1.setText(String.valueOf(userProgram1.get(0).rep));
        rep2.setText(String.valueOf(userProgram1.get(1).rep));
        rep3.setText(String.valueOf(userProgram1.get(2).rep));
        rep4.setText(String.valueOf(userProgram1.get(3).rep));
        rep5.setText(String.valueOf(userProgram1.get(4).rep));
        rep6.setText(String.valueOf(userProgram1.get(5).rep));

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(SeeYourProgram.this,HomePage.class);
                startActivity(intent);
            }
        });

        start.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(SeeYourProgram.this,Workout.class);
                startActivity(intent);
            }
        });
    }

}
