package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import org.checkerframework.checker.units.qual.A;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    static boolean switchgymhome = false;
     SwitchCompat key;
    TextView text;
    TextView dormitory,main,seeprogram;
    String a = "Home";
    String aa = "Your Program is Ready!";
    String bb = "Gym";
    Button motivation, createprogram,smart;
    ImageView  tracking,informative,profile;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String  userID,userIDa;
    ArrayList<String> quotes;
    DecimalFormat df = new DecimalFormat("0.00");
    Double weightd,heightd,chestd,waistd,hipd,neckd,aged;
    String weights,heights,chests,waists,hips,necks,ages;
    String sleepTime, gender, activity, goal;
    Double BMId, fatneedd,carbneedd, calorieneedd, fatratiod,proteinneedd,waterneedd;

    static Double muscle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        key = findViewById(R.id.switch2);
        key.setChecked(switchgymhome);
        text = findViewById(R.id.textView2);
        if(switchgymhome)
        {
            text.setText(a);
        }
        else
        {
            text.setText(bb);
        }

        quotes = new ArrayList<>();
        motivation = findViewById(R.id.motivation);
        seeprogram = findViewById(R.id.seeyourprogram);
        createprogram = findViewById(R.id.createown);
        smart = findViewById(R.id.smart);
        profile = findViewById(R.id.homeprofile);
        tracking = findViewById(R.id.hometrack);
        informative = findViewById(R.id.homeinfo);
        dormitory = findViewById(R.id.dormitory1);
        main = findViewById(R.id.main1);

        smart.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent = new Intent(HomePage.this,SeeOwnProgram.class);
                startActivity(intent);
            }
        });
        key.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    switchgymhome = true;
                    text.setText(a);
                    key.setChecked(true);

                } else {
                    switchgymhome = false;
                    text.setText(bb);
                    key.setChecked(false);
                }
            }
        });
        createquotes();
        motivation.setText(randomquote());
        motivation.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
            Intent intent = new Intent(HomePage.this,MotivationPage.class);
            startActivity(intent);
            }
        });

        seeprogram.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(HomePage.this,SeeYourProgram.class);
                startActivity(intent);
            }
        });

        createprogram.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(HomePage.this,CreateYourProgram.class);
                startActivity(intent);
            }
        });



        profile.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(HomePage.this,ProfilePage.class);
                startActivity(intent);
            }
        });

        tracking.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(HomePage.this,TrackingPage.class);
                startActivity(intent);
            }
        });

        informative.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(HomePage.this,InformativePage.class);
                startActivity(intent);
            }
        });

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        userID = "M7NcLzt5KIuUJPnv0uO7";

        DocumentReference documentReference = fStore.collection("occupancy").document(userID);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                dormitory.setText(value.getString("dormitory"));
                main.setText(value.getString("main"));
            }
        });
        userIDa = FirebaseAuth.getInstance().getUid();
        documentReference = fStore.collection("information").document(userIDa);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                weights = value.getString("weight");
                heights = value.getString("height");
                waists = value.getString("waist");
                chests = value.getString("chest");
                hips = value.getString("hip");
                necks = value.getString("nest");
                ages = value.getString("age");

                gender = value.getString("gender");
                activity = value.getString("activity");
                goal = value.getString("goal");

                weightd=Double.parseDouble(weights);
                heightd=Double.parseDouble(heights);
                waistd=Double.parseDouble(waists);
                chestd=Double.parseDouble(chests);
                hipd=Double.parseDouble(hips);
                neckd=Double.parseDouble(necks);
                aged=Double.parseDouble(ages);

                df.setRoundingMode(RoundingMode.DOWN);

                BMId = weightd / (Math.pow(heightd / 100, 2));
                waterneedd = weightd * 0.035;

                if (aged <= 13 && aged >= 6) {
                    sleepTime = "9-11 hours";
                }
                else if (aged >= 14 && aged <= 17) {
                    sleepTime = "8-10";
                }
                else{
                    sleepTime = "7-9";
                }
                if (gender.equalsIgnoreCase("male")) {
                    double BMS = 66.5 + (13.75 * weightd) + (5.03 * heightd) - (6.75 * aged);
                    if (activity.equalsIgnoreCase("None - Bazal")) {
                        calorieneedd = BMS * 1.2;
                    }
                    if (activity.equalsIgnoreCase("Light - (1-2 Week)")) {
                        calorieneedd = BMS * 1.375;
                    }
                    if (activity.equalsIgnoreCase("Moderate (3-4)")) {
                        calorieneedd = BMS * 1.55;
                    }
                    if (activity.equalsIgnoreCase("Active (5-6)")) {
                        calorieneedd = BMS * 1.9;
                    }
                    fatratiod = (Math.abs(495 / (1.0324 - 0.19077 * Math.log10(waistd - neckd) + 0.15456 * Math.log10(heightd))) - 450);
                    proteinneedd = calorieneedd / 20;
                    if (aged >= 4 && aged <= 18) {
                        fatneedd = calorieneedd / 30;
                    }
                    if (aged > 18) {
                        fatneedd = calorieneedd / 36;
                    }
                    carbneedd = (calorieneedd - fatneedd * 9 - proteinneedd * 4) / 4;

                }

                if (gender.equalsIgnoreCase("female")) {
                    double BMS = 665.1 + (9.56 * weightd) + (1.85 * heightd) - (4.67 * aged);
                    if (activity.equalsIgnoreCase("None - Bazal")) {
                        calorieneedd = BMS * 1.2;
                    }
                    if (activity.equalsIgnoreCase("Light - (1-2 Week)")) {
                        calorieneedd = BMS * 1.375;
                    }
                    if (activity.equalsIgnoreCase("Moderate (3-4)")) {
                        calorieneedd = BMS * 1.55;
                    }
                    if (activity.equalsIgnoreCase("Active (5-6)")) {
                        calorieneedd = BMS * 1.9;
                    }
                    fatratiod = (Math.abs(495 / (1.29579 - 0.35004 * Math.log10(waistd + hipd - neckd) + 0.22100 * Math.log10(heightd)) - 450));
                    proteinneedd = calorieneedd / 20;
                    if (aged >= 4 && aged <= 18) {
                        fatneedd = calorieneedd / 30;
                    }
                    if (aged > 18) {
                        fatneedd = calorieneedd / 36;
                    }
                    carbneedd = (calorieneedd - fatneedd * 9 - proteinneedd * 4) / 4;

                }

                muscle = weightd - (weightd*(fatratiod/100));
            }});
    }
    protected void createquotes(){
        quotes.add("\"Exercise is king, nutrition is Queen, put them together, and you've got a kingdom.\" ");
        quotes.add("\"Our food should be our medicine, and our medicine should be our food. \"");
        quotes.add("\"Most people don't have a problem going on a diet. The problem is being consistent on their diet.\"");
        quotes.add("\"Until you get your nutrition right, nothing will change.\"");
        quotes.add("\"It's never too late or never too early to work towards being the healthiest you.\"");
    }
    protected String randomquote(){
        return quotes.get((int)(Math.random()*quotes.size()));
    }

}
