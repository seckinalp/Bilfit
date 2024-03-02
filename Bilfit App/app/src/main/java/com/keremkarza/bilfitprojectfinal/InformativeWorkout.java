package com.keremkarza.bilfitprojectfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InformativeWorkout extends AppCompatActivity {
    ImageView back;
    ArrayList<String> information;
    int que;
    TextView word, quetxt;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informative_workout);
        back = findViewById(R.id.backarrow11);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(InformativeWorkout.this,InformativePage.class);
                startActivity(intent);
            }
        });
        information = new ArrayList<>();
        createinformation();
        que=0;
        quetxt=(TextView) findViewById(R.id.textView18);

        word=(TextView) findViewById(R.id.textView17);
        getnext();

        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getnext();
            }
        });
    }
    protected void createinformation(){
        information.add("“If you just do cardio, you’re sabotaging yourself,” says Jacob Wilson, Ph.D., certified strength and conditioning specialist and associate editor of the Journal of Strength and Conditioning Research. “Your metabolism will actually go down, making weight loss more difficult. Resistance training, however, builds muscle to increase your metabolic rate.” That explains why, in one Harvard School of Public Health study of 10,500 adults, those who spent 20 minutes a day weight training gained less abdominal fat over the course of 12 years (compared to those who spent the same amount of time performing cardio).");
        information.add("Do not stretch in vain. In one Austin State University study, people who warmed up with light leg extensions and squats were able to squat with 8.36% more weight during their workout than if they had performed typical “bend and hold” stretches. Their lower bodies were also 22.7% more stable. “Think of a rubber band,” says Wilson. “If you stretch it around a lot and then pull it back to shoot it, it’s not going to go as far. The same thing happens with your muscles and tendons.” However, dynamic bodyweight moves—ones that mimic the workout you’re about to perform—increase blood flow and improve your range of motion without compromising your muscles’ and tendons’ elastic properties.");
        information.add("You might think of carbo-loading as something you do to run a better marathon. But eating carbs before your workout can also help you during those intervals, according to 2013 research published in Sports Medicine. “Carbs are your body’s primary fuel for any high-intensity workout, and when your body is fueled, your body is going to put forth a better effort and get a better value, both in terms of caloric expenditure and muscle growth, than it would if you were in fasted state,” says Wilson. So even if you like your morning workouts, make sure to eat some toast or oatmeal before you head out of the door.");
        information.add("Minute per minute, high-intensity intervals—periods of all-out effort interspersed with short, low-intensity “breaks”—come with more cardiovascular and fat-loss benefits than any other work-out, says Wall. For instance, in one study from Human Performance Laboratory at the University of Wisconsin-La Crosse, people who performed a 20-minute interval work-out with exercises including pushups, burpees, squats and lunges burned an average of 15 calories per minute—nearly twice as many as during long runs. To burn similar calories, follow the workout’s protocol: Perform as many reps as possible for 20 seconds, rest for 10 seconds and repeat for a total of four minutes. Rest one minute, then repeat for a total of four rounds.");
        information.add("Exercise can help prevent excess weight gain or help maintain weight loss. When you engage in physical activity, you burn calories. The more intense the activity, the more calories you burn. ");
        information.add("No matter what your current weight is, being active boosts high-density lipoprotein (HDL) cholesterol, the \"good\" cholesterol, and it decreases unhealthy triglycerides. This one-two punch keeps your blood flowing smoothly, which decreases your risk of cardiovascular diseases.");
        information.add("Regular physical activity can improve your muscle strength and boost your endurance. Exercise delivers oxygen and nutrients to your tissues and helps your cardiovascular system work more efficiently. And when your heart and lung health improve, you have more energy to tackle daily chores.");
        information.add("Endorphins are hormones that reduce pain and boost pleasure, creating a general feeling of well-being and positivity. So before you roll your eyes at your enthusiastic fitness instructor, consider how a steady state of endorphins does the body good. Endorphins also act as a natural painkiller and can help ease long-term aches. Regular exercise can strengthen muscles, lessening chronic pain and your risk of injury.");
    }
    protected void getnext(){
        word.setText(information.get(que));
        quetxt.setText(que+1 + "/" + information.size());
        que++;
        if (que>=information.size()){
            que=0;
        }

    }
}
