package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Workout extends AppCompatActivity {
    ImageView back,workoutimage;
    TextView name,description,set,rep,category;
    TextView nextExercise;
    ArrayList<exercise> userprogram = new ArrayList<>();
    static int i = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        back = findViewById(R.id.backarrow40);

        workoutimage = findViewById(R.id.workoutimage1);
        name = findViewById(R.id.workoutname1);
        description = findViewById(R.id.workoutdescription1);
        set = findViewById(R.id.workoutset131);
        rep = findViewById(R.id.workoutrep131);
        category = findViewById(R.id.workoutcat1);
        nextExercise = findViewById(R.id.nextexercise1);

        if(i == 5)
        {
            nextExercise.setText("Finish Workout!");
        }
        else

        {
            nextExercise.setText("Next Exercise!");
        }
       program program = new program();
       userprogram = program.programx;

            workoutimage.setImageResource(userprogram.get(i).image);
            description.setText(userprogram.get(i).description);
            set.setText(String.valueOf(userprogram.get(i).set));
            rep.setText(String.valueOf(userprogram.get(i).getRep()));
            category.setText(String.valueOf(userprogram.get(i).category));
            name.setText(userprogram.get(i).name);



        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                i = 0;
                Intent intent = new Intent(Workout.this,SeeYourProgram.class);
                startActivity(intent);
            }
        });
        nextExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i == 6)
                {
                    Toast.makeText(Workout.this,"Your Exercises Are Done!",Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Workout.this,HomePage.class);
                    startActivity(intent);
                    i = 0;
                }
                else
                {
                    Intent intent = new Intent(Workout.this,Workout.class);
                    startActivity(intent);
                }
            }
        });

    }
}
