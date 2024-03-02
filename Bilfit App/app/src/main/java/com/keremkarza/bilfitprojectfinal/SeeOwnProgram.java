package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SeeOwnProgram extends AppCompatActivity {
    ImageView back;
    TextView start,exprogram;
    String exercises;
    ArrayList<exercise> ownprogram = new ArrayList<>();;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_see_own_program);
        back = findViewById(R.id.backarrow12);
        start = findViewById(R.id.start4);
        exprogram = findViewById(R.id.textView34);
        ownprogram = CreateYourProgram.ownprogram;
        exercises = CreateYourProgram.exercises;
        exprogram.setText(exercises);

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(SeeOwnProgram.this,HomePage.class);
                startActivity(intent);
            }
        });
        start.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(exercises == "")
                {

                }
                else

                {
                    Intent intent = new Intent(SeeOwnProgram.this,HomeWorkout.class);
                    startActivity(intent);
                }

            }
        });



    }


}
