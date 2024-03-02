package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomeWorkout extends AppCompatActivity {
    ImageView back,workoutimage;
    TextView name,description,set,rep,category,size;
    TextView nextExercise;
    ArrayList<exercise> userprogram = new ArrayList<>();
    static int i = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_workout);
        back = findViewById(R.id.backarrow40);
        workoutimage = findViewById(R.id.workoutimage1);
        name = findViewById(R.id.workoutname1);
        description = findViewById(R.id.workoutdescription1);
        set = findViewById(R.id.workoutset131);
        rep = findViewById(R.id.workoutrep131);
        category = findViewById(R.id.workoutcat1);
        nextExercise = findViewById(R.id.nextexercise1);
        size = findViewById(R.id.size);

        userprogram = CreateYourProgram.ownprogram;

        if(i == userprogram.size() -1)
        {
            nextExercise.setText("Finish Workout!");
        }
        else
        {
            nextExercise.setText("Next Exercise!");
        }
        name.setText(userprogram.get(i).name);
        description.setText(userprogram.get(i).description);
        workoutimage.setImageResource(userprogram.get(i).image);
        set.setText(String.valueOf(userprogram.get(0).set));
        rep.setText(String.valueOf(userprogram.get(0).rep));
        category.setText(String.valueOf(i + 1));
        size.setText(String.valueOf(userprogram.size()));
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(HomeWorkout.this,SeeOwnProgram.class);
                startActivity(intent);
                i=0;
            }
        });

        nextExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i == userprogram.size())
                {
                    Toast.makeText(HomeWorkout.this,"Your Exercises Are Done!",Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(HomeWorkout.this,SeeOwnProgram.class);
                    startActivity(intent);
                    i = 0;
                }
                else
                {
                    Intent intent = new Intent(HomeWorkout.this,HomeWorkout.class);
                    startActivity(intent);
                }
            }
        });
    }
}
