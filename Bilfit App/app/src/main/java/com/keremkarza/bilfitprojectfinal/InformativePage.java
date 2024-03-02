package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InformativePage extends AppCompatActivity {
    ImageView back;
    TextView supplement, workout, nutrition;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informative);
        back = findViewById(R.id.backarrow8);
        supplement = findViewById(R.id.supplement);
        nutrition = findViewById(R.id.nutrition);
        workout = findViewById(R.id.workout);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(InformativePage.this,HomePage.class);
                startActivity(intent);
            }
        });
        supplement.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(InformativePage.this,InformativeSupplement.class);
                startActivity(intent);
            }
        });
        workout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(InformativePage.this,InformativeWorkout.class);
                startActivity(intent);
            }
        });
        nutrition.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(InformativePage.this,InformativeNutrition.class);
                startActivity(intent);
            }
        });
    }
}
