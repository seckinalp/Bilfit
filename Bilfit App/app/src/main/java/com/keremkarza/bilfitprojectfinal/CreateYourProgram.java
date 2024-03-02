package com.keremkarza.bilfitprojectfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CreateYourProgram extends AppCompatActivity {
    ImageView back;
    static Boolean check = false;
    static  Boolean check2 = false;
    static Boolean check3= false,check4= false,check5= false,check6= false,check7= false,check8= false,check9= false,check10= false,check11= false,check12= false,check13= false,check14= false,check15= false,check16= false,check17= false,check18= false,check19= false,check20= false,check21= false,check22= false,check23= false,check24= false,check25= false,check26= false,check27= false,check28= false,check29= false;

    static ArrayList<exercise> ownprogram;
    static String exercises = "";
    ArrayList<exercise> allexercises;
    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_your_program);
        back = findViewById(R.id.backarrow2);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                exercises = "";
                ownprogram.clear();
                if(check)
                {
                    ownprogram.add(allexercises.get(0));
                }
                if(check2)
                {
                    ownprogram.add(allexercises.get(1));
                }
                if(check3)
                {
                    ownprogram.add(allexercises.get(2));
                }
                if(check4)
                {
                    ownprogram.add(allexercises.get(3));
                }
                if(check5)
                {
                    ownprogram.add(allexercises.get(4));
                }
                if(check6)
                {
                    ownprogram.add(allexercises.get(5));
                }
                if(check7)
                {
                    ownprogram.add(allexercises.get(6));
                }
                if(check8)
                {
                    ownprogram.add(allexercises.get(7));
                }
                if(check9)
                {
                    ownprogram.add(allexercises.get(8));
                }
                if(check10)
                {
                    ownprogram.add(allexercises.get(9));
                }
                if(check11)
                {
                    ownprogram.add(allexercises.get(10));
                }
                if(check12)
                {
                    ownprogram.add(allexercises.get(11));
                }
                if(check13)
                {
                    ownprogram.add(allexercises.get(12));
                }
                if(check14)
                {
                    ownprogram.add(allexercises.get(13));
                }
                if(check15)
                {
                    ownprogram.add(allexercises.get(14));
                }
                if(check16)
                {
                    ownprogram.add(allexercises.get(15));
                }
                if(check17)
                {
                    ownprogram.add(allexercises.get(16));
                }
                if(check18)
                {
                    ownprogram.add(allexercises.get(17));
                }
                if(check19)
                {
                    ownprogram.add(allexercises.get(18));
                }
                if(check20)
                {
                    ownprogram.add(allexercises.get(19));
                }
                if(check21)
                {
                    ownprogram.add(allexercises.get(20));
                }
                if(check22)
                {
                    ownprogram.add(allexercises.get(21));
                }
                if(check23)
                {
                    ownprogram.add(allexercises.get(22));
                }
                if(check24)
                {
                    ownprogram.add(allexercises.get(23));
                }
                if(check25)
                {
                    ownprogram.add(allexercises.get(24));
                }
                if(check26)
                {
                    ownprogram.add(allexercises.get(25));
                }                if(check27)
                {
                    ownprogram.add(allexercises.get(26));
                }
                if(check28)
                {
                    ownprogram.add(allexercises.get(27));
                }
                if(check29)
                {
                    ownprogram.add(allexercises.get(28));
                }



                for(int i = 0; i < ownprogram.size(); i++)
                {
                    exercises = exercises + "\n" + ownprogram.get(i).name;
                }
                Toast.makeText(CreateYourProgram.this,"Done!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreateYourProgram.this,HomePage.class);
                startActivity(intent);

            }
        });

        ownprogram = new ArrayList<>();
        allexercises = new ArrayList<>();
        b = findViewById(R.id.button);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);
        b12=findViewById(R.id.button12);
        b13=findViewById(R.id.button13);
        b14=findViewById(R.id.button14);
        b15=findViewById(R.id.button15);
        b16=findViewById(R.id.button16);
        b17=findViewById(R.id.button17);
        b18=findViewById(R.id.button18);
        b19=findViewById(R.id.button19);
        b20=findViewById(R.id.button20);
        b21=findViewById(R.id.button21);
        b22=findViewById(R.id.button22);
        b23=findViewById(R.id.button23);
        b24=findViewById(R.id.button24);
        b25=findViewById(R.id.button25);
        b26=findViewById(R.id.button26);
        b27=findViewById(R.id.button27);
        b28=findViewById(R.id.button28);
        b29=findViewById(R.id.button29);


        allexercises = new ArrayList<exercise>();
        allexercises.add(new exercise("Dumbbell Bench Press","Step 1: Lie flat on back on a flat bench and hold one dumbbell in each hand with thumbs just outside of nipples.\n\n" +
                "Step 2: Press dumbbells straight up into the air and lock arms out at a full extended position and with the dumbbells touching at the peak of the movement.\n\n" +
                "Step 3: Lower dumbbells to complete the repetition.\n",2,8, R.drawable.dumbbellbenchpress,1));
        allexercises.add(new exercise("Bench Press","Step 1: Lie on your back on a flat bench. Lift the bar off the rack and hold it straight over you, keeping your arms locked. This is the starting position.\n\n" +
                "Step 2: Next, inhale and bring the barbell down in a slow and controlled manner until it reaches your mid-chest.\n\n" +
                "Step 3: Pause briefly before raising the barbell back to your starting position as you exhale. Your focus should be on using your chest muscles to move the bar. Lock your arms at the top of the movement and squeeze your chest before slowly bringing the barbell down again. This step should take twice as long raising the weight to get the maximum benefit.\n\n" +
                "Step 4: Repeat the movement for the desired number of repetitions.\n\n" +
                "Step 5: The final step in the exercise is to place the barbell on the rack.\n\n",3,10,R.drawable.barbellbenchpress,1));
        allexercises.add(new exercise("Dumbbell Fly","Step 1: Pick up the dumbbells off the floor using a neutral grip (palms facing in). Position the ends of the dumbbells in your hip crease, and sit down on the bench.\n" +
                "\n" +
                "Step 2: To get into position, lay back and keep the weights close to your chest. Once you are in position, take a deep breath, then press the dumbbells to lockout at the top.\n" +
                "\n" +
                "Step 3: Slightly retract your shoulder blades, unlock your elbows, and slowly lower the dumbbells laterally while maintaining the angle at your elbow.\n" +
                "\n" +
                "Step 4: Once the dumbbells reach chest level, reverse the movement by squeezing your pecs together and bringing the dumbbells back to their starting position.\n" +
                "\n" +
                "Step 5: Without allowing the dumbbells to touch, start the next repetition, and continue until the set is completed.\n",5,12,R.drawable.dumbbellfly,1));

        allexercises.add(new exercise("Barbell Curl","Step 1: Stand up straight while holding a barbell in a shoulder-width grip.\n\n" +
                "Step 2: Contract your biceps to curl the weight forward. Your upper arms should remain stationary during this process.\n\n" +
                "Step 3: Continue moving the barbell until the biceps are fully contracted and the bar is at shoulder height. Hold this position for a second and then squeeze your biceps.\n\n" +
                "Step 4: Bring the barbell back to the starting position. Repeat for the desired number of reps.\n",2,8,R.drawable.barbellcurl,4));
        allexercises.add(new exercise("Reverse Barbell Curl","Step 1: With your arms extended downward in front of you, grasp a barbell so that your hands are shoulder width apart and your palms facing in towards your body. (The back of your hands should be facing forward.) Stand upright with your feet shoulder width apart. This is your starting position.\n\n" +
                "Step 2: Exhaling, use only your forearms to raise the barbell to your chest, should level high.\n\n" +
                "Step 3: Hold the contraction for a moment and then inhale as you lower the barbell until your arms are extended and the barbell is back in the starting position.\n\n" +
                "Step 4: Repeat for a full set.\n",3,10,R.drawable.reversebarbellcurl,4));
        allexercises.add(new exercise("Hammer Curl","Step 1: Stand up straight with your torso upright. Hold a dumbbell in each hand at arms-length. Your elbows should be close to your torso.\n\n" +
                "Step 2: The palms of your hands should be facing your torso. This is the starting position for the exercise.\n\n" +
                "Step 3: Curl the weight forward while contracting your biceps. Your upper arm should remain stationary. Continue to lift the weight until your biceps are fully contracted and the dumbbell is at shoulder level. Hold the contraction for a moment as you squeeze your biceps.\n\n" +
                "Step 4: Inhale and slowly start to bring the dumbbells back to the starting position.\n" +
                "Step 5: Repeat for the desired number of reps.\n",5,12,R.drawable.hammerxurl,4));

        allexercises.add(new exercise("Triceps Pressdown","Step 1: Start by bracing your abdominals.\n\n" +
                "Step 2: Tuck your elbows in at your sides and position your feet slightly apart.1\n\n" +
                "Step 3: Inhale. Push down until your elbows are fully extended but not yet in the straight, locked position. Keep your elbows close to your body and bend your knees slightly on the pushdown. Resist bending forward. Try to keep your back as straight as possible as you push down.\n\n" +
                "Step 4: As you exhale, return to the starting point using a controlled movement. Try not to crash the weights.\n\n",2,8,R.drawable.tricepspressdown,5));
        allexercises.add(new exercise("Bench Dips","Step 1: Place the chairs facing each other, about 3 feet apart.\n\n" +
                "Step 2: Sit on the edge of one chair and grip the edge with your hands.\n\n" +
                "Step 3: Place your heels on the edge of the other chair and hold yourself up using your triceps.\n\n" +
                "Step 4: Slide forward just far enough that your behind clears the edge of the chair, then lower yourself until your elbows are bent between 45 and 90 degrees.\n\n" +
                "Step 5: Push yourself back up to the start position and repeat. Go slowly and control the movement throughout the range of motion.\n\n",3,10,R.drawable.benchdips,5));
        allexercises.add(new exercise("Lying Dumbbell Tricep Extension","Step 1: Grab a pair of dumbbells and sit on the end of a flat bench. \n\n" +
                "Step 2: Lie back and raise the dumbbells above your head using a neutral grip, palms facing each other. \n\n" +
                "Step 3: Bending at the elbows and keeping your upper arms set, lower the dumbbells until they are about level with your ears. \n\n" +
                "Step 4: Squeeze your triceps and raise the dumbbells back to the starting position.\n",5,12,R.drawable.lyingdumbbelltricepsrxtension,5));

        allexercises.add(new exercise("Seated Leg Curl","Step 1: Sit upright on a leg press machine that is adjusted to your height. Your back should be against the back pad and your feet should be on the foot rests with your thighs under the leg pads.\n\n" +
                "Step 2: Grasp the handle bars and raise your legs so that they are fully extended in front of you and parallel to the floor for your starting position.\n\n" +
                "Step 3: Exhale and lower your legs, bending at the knees, until your legs form a 90 degree angle.\n\n" +
                "Step 4: Pause for a moment and then inhale as you raise your legs back to the starting position.\n" +
                "Step 5: Repeat for a complete set.\n",2,8,R.drawable.seatedlegcurl,6));
        allexercises.add(new exercise("Leg Extension","Step 1: Sit on a leg extension machine. Position your legs under the pad and grasp the side bars with your hands. This is the starting position.\n\n" +
                "Step 2: Extend your legs to the maximum, exhaling as you do so. Pause a second in this contracted position.\n\n" +
                "Step 3: Lower the weight back to the original position as you inhale. Make sure your legs don't go past the 90-degree angle point.\n" +
                "Step 4: Repeat for the desired number of reps.\n",3,10,R.drawable.legextension,6));
        allexercises.add(new exercise("Squat","Step 1: Using a squat rack, place the barbell at shoulder height.\n\n" +
                "Step 2: Turn around so that the barbell is below your neck and behind your shoulders.\n\n" +
                "Step 3: With your arms positioned wide on the barbell, push up with your legs and straighten up to lift the barbell onto your back.\n\n" +
                "Step 4: Step forward and place your feet shoulder width apart with your toes pointing slightly outward.\n\n" +
                "Step 5: With your back straight and your head up, inhale and bend your knees until you are in a seated position and your knees are perpendicular to your toes.\n\n" +
                "Step 6: Exhaling, push off with your heels to straighten your legs and return to a standing position.\n" +
                "Step 7: Repeat.\n",5,12,R.drawable.squat,6));

        allexercises.add(new exercise("Dumbbell Push Press","Step 1: Select two dumbbells of an appropriate weight.\n\n" +
                "Step 2: Start with one end of the dumbbells resting lightly on your shoulders, with your palms facing each other, standing with your feet hip-width apart.\n\n" +
                "Step 3: While bracing your core and keeping your back straight, bend your knees slightly, just enough to get some momentum without performing a full squat.\n\n" +
                "Step 4: As soon as the knees are slightly flexed, extend your hips and knees simultaneously by driving through your heels while pressing the dumbbells overhead.\n\n" +
                "Step 5: With controlled motion, lower the weights back down to your shoulders and prepare for the next repetition.\n",2,8,R.drawable.dumbbellpushpress,3));
        allexercises.add(new exercise("Lateral Raise","Step 1: With a dumbbell in each hand, palms facing in, stand upright with your feet shoulder width apart and your arms down by your sides. This is your starting position.\n\n" +
                "Step 2: With straight arms, exhale as you raise the dumbbells out to the sides until your arms are parallel with the floor.\n\n" +
                "Step 3: Hold the contraction for a moment and then inhale as you lower the dumbbells back to your starting position.\n\n" +
                "Step 4: Repeat for a full set.\n",3,10,R.drawable.dumbbelllateralraise,3));
        allexercises.add(new exercise("Standing Barbell Shoulder Press","Step 1: Grasp a barbell with hands wider than shoulder width apart and your palms facing down.\n\n" +
                "Step 2: Keep your feet shoulder width apart and your knees slightly bent.\n\n" +
                "Step 3: Raise the barbell to your chest and then overhead and slightly forward for your starting position.\n\n" +
                "Step 4: Inhale as you slowly lower the bar back to your chest.\n\n" +
                "Step 5: Exhale as you slowly raise the bar back overhead to the starting position.\n\n" +
                "Step 6: Repeat for a complete set.\n",5,12,R.drawable.standingbarbellshoulderpress,3));

        allexercises.add(new exercise("Seated V-Bar Cable Row","SEATED V-BAR CABLE ROW\n\n" +
                "Step 1: Attach a V-bar to a rowing machine and sit on the bench with your feet on the foot rest and your knees slightly bent.\n\n" +
                "Step 2: Grasp the V-bar so that your palms are facing forward.\n\n" +
                "Step 3: Extend your arms as you lean backward, achieving a 90 degree angle between your waist and your legs. Slightly arch your back so that your chest protrudes. This is your starting position.\n\n" +
                "Step 4: Without moving your torso, exhale as you pull the V-bar towards your body until it nearly touches your chest.\n\n" +
                "Step 5: Contract your back muscles for a count and then inhale as you slowly return the V-bar back to starting position.\n\n" +
                "Step 6: Repeat for a complete set.\n",2,8,R.drawable.seatedvbarcablerow,2));
        allexercises.add(new exercise("Barbell Deadlift","Step 1: Load a barbell and roll it against your shins. Bend at your hips and knees and grab the bar with an overhand grip, your hands just beyond shoulder width.\n\n" +
                "Step 2: Keeping your lower back naturally arched, pull your torso up and thrust your hips forward as you stand up with the barbell. \n\n" +
                "Step 3: As you lift the bar, keep it as close to your body as possible. \n\n" +
                "Step 4: Lower the bar to the floor\n",3,10,R.drawable.barbelldeadlift,2));
        allexercises.add(new exercise("Barbell Row","Step 1: Load a barbell and roll it against your shins. Bend at your hips and knees and grab the bar with an overhand grip, your hands just beyond shoulder width.\n\n" +
                "Step 2: Keeping your lower back naturally arched, pull your torso up and thrust your hips forward as you stand up with the barbell. \n\n" +
                "Step 3: As you lift the bar, keep it as close to your body as possible. \n\n" +
                "Step 4: Lower the bar to the floor\n",5,12,R.drawable.barbellrow,2));



        allexercises.add(new exercise("Push Up","Step 1: Lie on an exercise floor mat, face down.\n\n" +
                "Step 2: Press your toes against the floor and place your hands flat on the ground shoulder width apart, fingers extended forward.\n\n" +
                "Step 3: Push yourself up so that your arms are nearly extended and your torso and legs are off the floor. This is your starting position.\n\n" +
                "Step 4: Inhaling, bend your arms to lower your body and touch your chest nearly to the floor.\n\n" +
                "Step 5: Exhaling, contract your chest as you push off the ground and return to the starting position.\n\n" +
                "Step 6: Pause for a moment and then repeat for a full set.\n",5,12,R.drawable.pushups,1));

        allexercises.add(new exercise("Dumbbell Bent Over Row","Step 1: Assume a standing position while holding a dumbbell in each hand with a neutral grip.\n\n" +
                "Step 2: Hinge forward until your torso is roughly parallel with the floor (or slightly above) and then begin the movement by driving the elbows behind the body while retracting the shoulder blades.\n\n" +
                "Step 3: Pull the dumbbells towards your body until the elbows are at (or just past) the midline and then slowly lower the dumbbells back to the starting position under control.\n\n" +
                "Step 4: Repeat for the desired number of repetitions.\n",2,8,R.drawable.dumbbellbentoverrowsinglearm,2));
        allexercises.add(new exercise("Pull Up","Step 1: Facing a pull up bar, grasp the handles with your palms facing away from you.\n\n" +
                "Step 2: Pull in your torso so that your chest is out and there is a slight curve to your lower back.\n\n" +
                "Step 3: Exhaling, raise your body weight up until the bar touches your upper chest.\n\n" +
                "Step 4: Contract your back muscles for a moment and then inhale as you extend your arms completely and return back to the starting position.\n" +
                "Step 5: Repeat for a complete set.\n",3,10,R.drawable.pullup,2));
        allexercises.add(new exercise("Dumbbell Deadlift","Step 1: Stand with your feet hip-width apart, holding a pair of heavy dumbbells in front of your thighs, palms facing you.\n\n" +
                "Step 2: Keeping your back flat, shoulders back, and core engaged, push your hips back and simultaneously hinge forward at your waist as you bend at your knees (imagine closing a car door with your butt).\n\n" +
                "Step 3: Lower your torso until it’s nearly parallel to the floor and/or you feel a deep stretch in your hamstrings. Keep the dumbbells within an inch or two of your legs throughout the move.\n\n" +
                "Step 4: Pause, and then slowly reverse the movement to return to the standing position.\n",5,12,R.drawable.dumbbelldeadlift,2));



        allexercises.add(new exercise("Dumbbell Front Raise","Step 1: Stand with your feet about shoulder-width apart. Let your arms hang in front of you with the dumbbells in front of the thighs (palms facing the thighs). Your back is straight, your feet are planted flat on the floor, and your abdominal muscles are engaged.\n\n" +
                "Step 2: Lift the weights upward while inhaling. Your arms are extended, palms facing down, with a slight bend in the elbows to reduce the stress on the joints.\n\n" +
                "Step 3: Pause briefly when your arms are horizontal to the floor.\n\n" +
                "Step 4: Lower the dumbbells to the starting position (at the thighs) with a slow and controlled motion while exhaling.\n",5,12,R.drawable.dumbbellfrontraise,3));


        allexercises.add(new exercise("Dumbbell Concentration Curl","Step 1: Sit down on a bench holding a dumbbell in your left hand, and rest your elbow on the inside of your left thigh.\n" +
                "\n" +
                "Step 2: Squeeze the left biceps and bring the dumbbell toward your chest.\n" +
                "\n" +
                "Step 3: Lower the left arm to the starting position, repeat, and then switch arms.\n",3,10,R.drawable.dumbbellconcentrationcurl,4));
        allexercises.add(new exercise("Incline Dumbbell Curl","Step 1: Sit down against the workout bench, keeping your back straight and your abdominal muscles tight. Your weights should be at your sides to start, one in each hand.\n\n" +
                "Step 2: When you’ve gotten the starting position down, lift each dumbbell, palms up, toward your shoulders. It’s important to keep your upper arms tight so that you can isolate the biceps brachii muscle as you move your lower arms only.\n\n" +
                "Step 3: Slowly lower the dumbbells back down to your starting position. Don’t release the weights too fast or you could strain your muscles. This should be a controlled movement.\n\n",5,12,R.drawable.inclinedumbbelcurl,4));

        allexercises.add(new exercise("Dumbbell Lunge","Step 1: Inhale and take a big step forward with your right leg, landing on the heel.\n\n" +
                "Step 2: Bend at the knee until the right thigh approaches parallel to the ground. The left leg is bent at the knee and balanced on the toes while in the lunge position.\n\n" +
                "Step 3: Step the right foot back on an exhale to return to the starting position.\n\n" +
                "Step 4: Repeat the motion with the left leg.\n",5,12,R.drawable.lunge,6));

        allexercises.add(new exercise("Kickback","Step 1: Place one knee, shin and foot on a flat bench and bend over to keep your torso parallel to the floor. Grasp the head of the bench with your fingertips. \n\n" +
                "Step 2: In the outside hand hold a dumbbell. Press and hold that dumbbell-holding arm against your side, with a 90° bend at the elbow. \n\n" +
                "Step 3: Straighten your arm backwards until it is parallel to the floor. Contract your triceps at that top portion of the lift. Slowly lower until your arm is back at the 90° angle. After one arm is finished switch arms.\n\n",5,12,R.drawable.kickback,5));

        allexercises.add(new exercise("Bodyweight Squad","Step 1: Stand straight up with your feet shoulder's width apart.\n\n" +
                "Step 2: While bending at the knees, push your hips out and bend down. Picture yourself sitting on a chair.\n\n" +
                "Step 3: Once your hips have become lined up with your knees, return back to starting position.\n\n" +
                "Step 4: Repeat exercise as desired.\n",2,8,R.drawable.bodyweightsquat,6));
        allexercises.add(new exercise("Squad Jump","Step 1: Stand with feet shoulder-width apart and arms raised out in front of your body.\n\n" +
                "Step 2: Keep your head up and your back straight.\n\n" +
                "Step 3: Begin exercise by swinging your arms back behind your body as you bend your knees and push your hips back.\n\n" +
                "Step 4: Swing arms up as you drive with the balls of your feet and jump straight up into the air as high as you can. Your thighs will be acting like springs. Exhale as you do so.\n\n" +
                "Step 5: When you hit the floor again, squat down and jump as you did before.\n\n" +
                "Step 6: Repeat for the numbers of reps in the set.\n",3,10,R.drawable.jumpsquat,6));
        allexercises.add(new exercise("Dumbbell Lunge","Step 1: Inhale and take a big step forward with your right leg, landing on the heel.\n\n" +
                "Step 2: Bend at the knee until the right thigh approaches parallel to the ground. The left leg is bent at the knee and balanced on the toes while in the lunge position.\n\n" +
                "Step 3: Step the right foot back on an exhale to return to the starting position.\n\n" +
                "Step 4: Repeat the motion with the left leg.\n",5,12,R.drawable.lunge,6));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exercises = "";
                ownprogram.clear();
                if(check)
                {
                    ownprogram.add(allexercises.get(0));
                }
                if(check2)
                {
                    ownprogram.add(allexercises.get(1));
                }
                if(check3)
                {
                    ownprogram.add(allexercises.get(2));
                }
                if(check4)
                {
                    ownprogram.add(allexercises.get(3));
                }
                if(check5)
                {
                    ownprogram.add(allexercises.get(4));
                }
                if(check6)
                {
                    ownprogram.add(allexercises.get(5));
                }
                if(check7)
                {
                    ownprogram.add(allexercises.get(6));
                }
                if(check8)
                {
                    ownprogram.add(allexercises.get(7));
                }
                if(check9)
                {
                    ownprogram.add(allexercises.get(8));
                }
                if(check10)
                {
                    ownprogram.add(allexercises.get(9));
                }
                if(check11)
                {
                    ownprogram.add(allexercises.get(10));
                }
                if(check12)
                {
                    ownprogram.add(allexercises.get(11));
                }
                if(check13)
                {
                    ownprogram.add(allexercises.get(12));
                }
                if(check14)
                {
                    ownprogram.add(allexercises.get(13));
                }
                if(check15)
                {
                    ownprogram.add(allexercises.get(14));
                }
                if(check16)
                {
                    ownprogram.add(allexercises.get(15));
                }
                if(check17)
                {
                    ownprogram.add(allexercises.get(16));
                }
                if(check18)
                {
                    ownprogram.add(allexercises.get(17));
                }
                if(check19)
                {
                    ownprogram.add(allexercises.get(18));
                }
                if(check20)
                {
                    ownprogram.add(allexercises.get(19));
                }
                if(check21)
                {
                    ownprogram.add(allexercises.get(20));
                }
                if(check22)
                {
                    ownprogram.add(allexercises.get(21));
                }
                if(check23)
                {
                    ownprogram.add(allexercises.get(22));
                }
                if(check24)
                {
                    ownprogram.add(allexercises.get(23));
                }
                if(check25)
                {
                    ownprogram.add(allexercises.get(24));
                }
                if(check26)
                {
                    ownprogram.add(allexercises.get(25));
                }                if(check27)
                {
                    ownprogram.add(allexercises.get(26));
                }
                if(check28)
                {
                    ownprogram.add(allexercises.get(27));
                }
                if(check29)
                {
                    ownprogram.add(allexercises.get(28));
                }
                for(int i = 0; i < ownprogram.size(); i++)
                {
                    exercises = exercises + "\n" + ownprogram.get(i).name;
                }
                Toast.makeText(CreateYourProgram.this,"Created!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreateYourProgram.this,HomePage.class);
                startActivity(intent);

            }
        });


        if(check){

            int myColor = Color.parseColor("#FA7B34");
            b1.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b1.setBackgroundColor(myColor);

        }
        if(check2){

            int myColor = Color.parseColor("#FA7B34");
            b2.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b2.setBackgroundColor(myColor);

        }
        if(check2){

            int myColor = Color.parseColor("#FA7B34");
            b2.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b2.setBackgroundColor(myColor);

        }
        if(check3){

            int myColor = Color.parseColor("#FA7B34");
            b3.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b3.setBackgroundColor(myColor);

        }
        if(check4){

            int myColor = Color.parseColor("#FA7B34");
            b4.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b4.setBackgroundColor(myColor);

        }
        if(check5){

            int myColor = Color.parseColor("#FA7B34");
            b5.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b5.setBackgroundColor(myColor);

        }
        if(check6){

            int myColor = Color.parseColor("#FA7B34");
            b6.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b6.setBackgroundColor(myColor);

        }
        if(check7){

            int myColor = Color.parseColor("#FA7B34");
            b7.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b7.setBackgroundColor(myColor);

        }
        if(check8){

            int myColor = Color.parseColor("#FA7B34");
            b8.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b8.setBackgroundColor(myColor);

        }
        if(check9){

            int myColor = Color.parseColor("#FA7B34");
            b9.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b9.setBackgroundColor(myColor);

        }
        if(check10){

            int myColor = Color.parseColor("#FA7B34");
            b10.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b10.setBackgroundColor(myColor);

        }
        if(check11){

            int myColor = Color.parseColor("#FA7B34");
            b11.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b11.setBackgroundColor(myColor);

        }
        if(check12){

            int myColor = Color.parseColor("#FA7B34");
            b12.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b12.setBackgroundColor(myColor);

        }
        if(check13){

            int myColor = Color.parseColor("#FA7B34");
            b13.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b13.setBackgroundColor(myColor);

        }
        if(check14){

            int myColor = Color.parseColor("#FA7B34");
            b14.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b14.setBackgroundColor(myColor);

        }
        if(check15){

            int myColor = Color.parseColor("#FA7B34");
            b15.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b15.setBackgroundColor(myColor);

        }
        if(check16){

            int myColor = Color.parseColor("#FA7B34");
            b16.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b16.setBackgroundColor(myColor);

        }
        if(check17){

            int myColor = Color.parseColor("#FA7B34");
            b17.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b17.setBackgroundColor(myColor);

        }
        if(check18){

            int myColor = Color.parseColor("#FA7B34");
            b18.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b18.setBackgroundColor(myColor);

        }
        if(check19){

            int myColor = Color.parseColor("#FA7B34");
            b19.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b19.setBackgroundColor(myColor);

        }
        if(check20){

            int myColor = Color.parseColor("#FA7B34");
            b20.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b20.setBackgroundColor(myColor);

        }
        if(check21){

            int myColor = Color.parseColor("#FA7B34");
            b21.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b21.setBackgroundColor(myColor);

        }
        if(check22){

            int myColor = Color.parseColor("#FA7B34");
            b22.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b22.setBackgroundColor(myColor);

        }
        if(check23){

            int myColor = Color.parseColor("#FA7B34");
            b23.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b23.setBackgroundColor(myColor);

        }
        if(check24){

            int myColor = Color.parseColor("#FA7B34");
            b24.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b24.setBackgroundColor(myColor);

        }
        if(check25){

            int myColor = Color.parseColor("#FA7B34");
            b25.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b25.setBackgroundColor(myColor);

        }
        if(check26){

            int myColor = Color.parseColor("#FA7B34");
            b26.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b26.setBackgroundColor(myColor);

        }
        if(check27){

            int myColor = Color.parseColor("#FA7B34");
            b27.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b27.setBackgroundColor(myColor);

        }
        if(check28){

            int myColor = Color.parseColor("#FA7B34");
            b28.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b28.setBackgroundColor(myColor);

        }
        if(check29){

            int myColor = Color.parseColor("#FA7B34");
            b29.setBackgroundColor(myColor);
        }
        else {
            int myColor = Color.parseColor("#DDF2FF");
            b29.setBackgroundColor(myColor);

        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check) {

                    int myColor = Color.parseColor("#DDF2FF");
                    b1.setBackgroundColor(myColor);
                    check = false;

                } else {

                    int myColor = Color.parseColor("#FA7B34");
                    b1.setBackgroundColor(myColor);
                    check = true;
                }

                }
            } );
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check2){

                    int myColor = Color.parseColor("#DDF2FF");
                    b2.setBackgroundColor(myColor);
                    check2 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b2.setBackgroundColor(myColor);
                    check2 = true;

                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check3){

                    int myColor = Color.parseColor("#DDF2FF");
                    b3.setBackgroundColor(myColor);
                    check3 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b3.setBackgroundColor(myColor);
                    check3 = true;
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check4){

                    int myColor = Color.parseColor("#DDF2FF");
                    b4.setBackgroundColor(myColor);
                    check4 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b4.setBackgroundColor(myColor);
                    check4 = true;
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check5){

                    int myColor = Color.parseColor("#DDF2FF");
                    b5.setBackgroundColor(myColor);
                    check5 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b5.setBackgroundColor(myColor);
                    check5 = true;
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check6){


                    int myColor = Color.parseColor("#DDF2FF");
                    b6.setBackgroundColor(myColor);
                    check6 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b6.setBackgroundColor(myColor);
                    check6 = true;
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check7){

                    int myColor = Color.parseColor("#DDF2FF");
                    b7.setBackgroundColor(myColor);
                    check7 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b7.setBackgroundColor(myColor);
                    check7 = true;
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check8){

                    int myColor = Color.parseColor("#DDF2FF");
                    b8.setBackgroundColor(myColor);
                    check8 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b8.setBackgroundColor(myColor);
                    check8 = true;
                }

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check9){

                    int myColor = Color.parseColor("#DDF2FF");
                    b9.setBackgroundColor(myColor);
                    check9 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b9.setBackgroundColor(myColor);
                    check9 = true;
                }

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check10){

                    int myColor = Color.parseColor("#DDF2FF");
                    b10.setBackgroundColor(myColor);
                    check10 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b10.setBackgroundColor(myColor);
                    check10 = true;
                }

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check11){

                    int myColor = Color.parseColor("#DDF2FF");
                    b11.setBackgroundColor(myColor);
                    check11 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b11.setBackgroundColor(myColor);
                    check11 = true;
                }

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check12){

                    int myColor = Color.parseColor("#DDF2FF");
                    b12.setBackgroundColor(myColor);
                    check12 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b12.setBackgroundColor(myColor);
                    check12 = true;
                }

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check13){

                    int myColor = Color.parseColor("#DDF2FF");
                    b13.setBackgroundColor(myColor);
                    check13 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b13.setBackgroundColor(myColor);
                    check13 = true;
                }

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check14){

                    int myColor = Color.parseColor("#DDF2FF");
                    b14.setBackgroundColor(myColor);
                    check14 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b14.setBackgroundColor(myColor);
                    check14 = true;
                }

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check15){

                    int myColor = Color.parseColor("#DDF2FF");
                    b15.setBackgroundColor(myColor);
                    check15 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b15.setBackgroundColor(myColor);
                    check15 = true;
                }

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check16){

                    int myColor = Color.parseColor("#DDF2FF");
                    b16.setBackgroundColor(myColor);
                    check16 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b16.setBackgroundColor(myColor);
                    check16 = true;
                }

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check17){

                    int myColor = Color.parseColor("#DDF2FF");
                    b17.setBackgroundColor(myColor);
                    check17 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b17.setBackgroundColor(myColor);
                    check17 = true;
                }

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check18){

                    int myColor = Color.parseColor("#DDF2FF");
                    b18.setBackgroundColor(myColor);

                    check18 = false;
                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b18.setBackgroundColor(myColor);
                    check18 = true;
                }

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check19){

                    int myColor = Color.parseColor("#DDF2FF");
                    b19.setBackgroundColor(myColor);
                    check19 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b19.setBackgroundColor(myColor);
                    check19 = true;
                }

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check20){

                    int myColor = Color.parseColor("#DDF2FF");
                    b20.setBackgroundColor(myColor);
                    check20 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b20.setBackgroundColor(myColor);
                    check20 = true;
                }

            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check21){

                    int myColor = Color.parseColor("#DDF2FF");
                    b21.setBackgroundColor(myColor);
                    check21 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b21.setBackgroundColor(myColor);
                    check21 = true;
                }

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check22){

                    int myColor = Color.parseColor("#DDF2FF");
                    b22.setBackgroundColor(myColor);
                    check22 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b22.setBackgroundColor(myColor);
                    check22 = true;
                }

            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check23){

                    int myColor = Color.parseColor("#DDF2FF");
                    b23.setBackgroundColor(myColor);
                    check23 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b23.setBackgroundColor(myColor);
                    check23 = true;
                }

            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check24){

                    int myColor = Color.parseColor("#DDF2FF");
                    b24.setBackgroundColor(myColor);
                    check24 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b24.setBackgroundColor(myColor);
                    check24 = true;
                }

            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check25){

                    int myColor = Color.parseColor("#DDF2FF");
                    b25.setBackgroundColor(myColor);
                    check25 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b25.setBackgroundColor(myColor);
                    check25 = true;
                }

            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check26){

                    int myColor = Color.parseColor("#DDF2FF");
                    b26.setBackgroundColor(myColor);

                    check26 = false;
                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b26.setBackgroundColor(myColor);
                    check26 = true;
                }

            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check27){

                    int myColor = Color.parseColor("#DDF2FF");
                    b27.setBackgroundColor(myColor);
                    check27 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b27.setBackgroundColor(myColor);
                    check27 = true;
                }

            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check28){

                    int myColor = Color.parseColor("#DDF2FF");
                    b28.setBackgroundColor(myColor);
                    check28 = false;

                }
                else {
                    int myColor = Color.parseColor("#FA7B34");
                    b28.setBackgroundColor(myColor);
                    check28 = true;
                }

            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check29){

                    int myColor = Color.parseColor("#DDF2FF");
                    b29.setBackgroundColor(myColor);
                    check29 = false;

                }
                else {

                    int myColor = Color.parseColor("#FA7B34");
                    b29.setBackgroundColor(myColor);
                    check29 = true;
                }

            }
        });

    }
}
