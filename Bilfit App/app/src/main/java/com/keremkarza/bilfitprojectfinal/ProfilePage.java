package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ProfilePage extends AppCompatActivity {
    DecimalFormat df = new DecimalFormat("0.00");
    ImageView back;
    TextView update;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;
    String weights,heights,chests,waists,hips,necks,ages;
    TextView weight,height, chest, waist, hip, neck,age;
    Double weightd,heightd,chestd,waistd,hipd,neckd,aged;
    TextView BMI, fatneed,carbneed,calorieneed,fatratio,proteinneed,waterneed, sleeptime;
    Double BMId, fatneedd,carbneedd, calorieneedd, fatratiod,proteinneedd,waterneedd;
    static Double muscle;
    String sleepTime, gender, activity, goal;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        back = findViewById(R.id.backarrow6);
        update = findViewById(R.id.updatee);
        weight = findViewById(R.id.userweight);
        height = findViewById(R.id.userheight);
        chest = findViewById(R.id.profilechest);
        waist = findViewById(R.id.profilewaist);
        hip = findViewById(R.id.profilehip);
        neck = findViewById(R.id.profileneck);


        BMI = findViewById(R.id.BMI);

        fatneed = findViewById(R.id.fatneed);
        carbneed = findViewById(R.id.carbneed);
        calorieneed = findViewById(R.id.calorieneed);
        fatratio = findViewById(R.id.fatratio);
        proteinneed = findViewById(R.id.proteinneed);
        waterneed = findViewById(R.id.waterneed);
        sleeptime = findViewById(R.id.sleeptime);


        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ProfilePage.this,HomePage.class);
                startActivity(intent);
            }
        });
        update.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ProfilePage.this,updatevalues.class);
                startActivity(intent);
            }
        });

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        userID = fAuth.getCurrentUser().getUid();

        DocumentReference documentReference = fStore.collection("information").document(userID);
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

                weight.setText(weights);
                height.setText(heights);
                waist.setText(waists);
                chest.setText(chests);
                hip.setText(hips);
                neck.setText(necks);

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
                    fatratiod = 495 / (1.0324 - 0.19077 * Math.log10(waistd - neckd) + 0.15456 * Math.log10(heightd)) - 450;
                    proteinneedd = (weightd - weightd * fatratiod) * 2.75;
                    if (aged >= 4 && aged <= 18) {
                        fatneedd = calorieneedd * (3 / 90);
                    }
                    if (aged > 18) {
                        fatneedd = calorieneedd * (1 / 36);
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
                    fatratiod = 495 / (1.29579 - 0.35004 * Math.log10(waistd + hipd - neckd) + 0.22100 * Math.log10(heightd)) - 450;
                    proteinneedd = (weightd - weightd * fatratiod) * 2.75;
                    if (aged >= 4 && aged <= 18) {
                        fatneedd = calorieneedd * (3 / 90);
                    }
                    if (aged > 18) {
                        fatneedd = calorieneedd * (1 / 36);
                    }
                    carbneedd = (calorieneedd - fatneedd * 9 - proteinneedd * 4) / 4;

                }

                muscle=weightd-(weightd*fatratiod);

                BMI.setText(df.format(BMId));
                carbneed.setText(df.format(carbneedd));
                fatneed.setText(df.format(fatneedd));
                proteinneed.setText(df.format(proteinneedd));
                calorieneed.setText(df.format(calorieneedd));
                fatratio.setText(df.format(fatratiod));
                waterneed.setText(df.format(waterneedd));
                sleeptime.setText(sleepTime);

    }
});}}
