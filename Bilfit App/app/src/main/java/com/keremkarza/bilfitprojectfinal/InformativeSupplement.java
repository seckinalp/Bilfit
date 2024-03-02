package com.keremkarza.bilfitprojectfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InformativeSupplement extends AppCompatActivity {
    ImageView back;
    ArrayList<String> information;
    int que;
    TextView word, quetxt;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informative_supplement);
        back = findViewById(R.id.backarrow10);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(InformativeSupplement.this,InformativePage.class);
                startActivity(intent);
            }
        });
        information = new ArrayList<>();
        createinformation();
        que=0;
        quetxt=(TextView) findViewById(R.id.textView16);

        word=(TextView) findViewById(R.id.textView19);
        getnext();

        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getnext();
            }
        });
    }
    protected void createinformation(){
        information.add("Powdered protein can come from a variety of sources, including eggs, milk (e.g., casein, whey), and plants (e.g., soybeans, peas, hemp). Some protein powders contain protein from multiple sources; for instance, a vegan option might include protein derived from peas, pumpkin seeds, sunflower seeds, and alfalfa");
        information.add("The hormone testosterone plays an important role in how your body stores fat and creates muscle mass. Testosterone boosters stimulate your body’s production of testosterone to support muscle growth.");
        information.add("Pre-workout supplements are composed of a variety of stimulants that provide additional energy for high-intensity exercise. These stimulants can include caffeine, creatine, beta-alanine, B vitamins. Short-term side effects of pre-workout supplements can consist of cramps, headaches, anxiety, high blood pressure, and chest pain.");
        information.add("Creatine is a naturally occurring compound found in skeletal muscle that is synthesized in the body from amino acids and can be obtained from red meat and seafood. In the body, it helps produce adenosine triphosphate (ATP), which provides energy for muscles. Creatine is a popular workout supplement marketed to increase athletic performance, especially for weight training. ");
        information.add("Caffeine is a stimulant that is often included in pre-workout supplements, as it has been shown to benefit athletic performance for short-term high intensity exercise and endurance-based activities.");
        information.add("L-citrulline is a substance called a non-essential amino acid. Your kidneys change L-citrulline into another amino acid called L-arginine and a chemical called nitric oxide. These compounds are important to your heart and blood vessel health. They may also boost your immune system.");
        information.add("Most people do not get enough vitamin D. While these widespread vitamin D inadequacies are not imminently harmful, maintaining adequate vitamin D levels can help to optimize your health by improving bone strength, reducing symptoms of depression, strengthening your immune system, and lowering your risk for cancer.");
        information.add("Fish is a great source of high-quality protein and healthy fat. This is particularly true of fatty fish, such as salmon, which is loaded with anti-inflammatory omega-3 fatty acids and various other nutrients. Studies show that people who eat fish regularly have a lower risk for several conditions, including heart disease, dementia, and inflammatory bowel disease.");
    }
    protected void getnext() {
        word.setText(information.get(que));
        quetxt.setText(que + 1 + "/" + information.size());
        que++;
        if (que >= information.size()) {
            que = 0;
        }
    }
}
