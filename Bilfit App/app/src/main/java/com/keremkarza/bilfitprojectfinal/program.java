package com.keremkarza.bilfitprojectfinal;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class program {
    ArrayList<exercise> chest,biceps,triceps,leg,shoulder,back,homechest,homebiceps,hometriceps,homeleg,homeshoulder,homeback,program1, programx,program2,program3,program4,program5,program6,program7,program8,program9,program10,program1home,program2home,program3home,program4home,program5home,program6home,program7home,program8home,program9home,program10home;


    program()
    {

        chest = new ArrayList<exercise>();
        chest.add(new exercise("Dumbbell Bench Press","Step 1: Lie flat on back on a flat bench and hold one dumbbell in each hand with thumbs just outside of nipples.\n\n" +
                "Step 2: Press dumbbells straight up into the air and lock arms out at a full extended position and with the dumbbells touching at the peak of the movement.\n\n" +
                "Step 3: Lower dumbbells to complete the repetition.\n",2,8, R.drawable.dumbbellbenchpress,1));
        chest.add(new exercise("Bench Press","Step 1: Lie on your back on a flat bench. Lift the bar off the rack and hold it straight over you, keeping your arms locked. This is the starting position.\n\n" +
                "Step 2: Next, inhale and bring the barbell down in a slow and controlled manner until it reaches your mid-chest.\n\n" +
                "Step 3: Pause briefly before raising the barbell back to your starting position as you exhale. Your focus should be on using your chest muscles to move the bar. Lock your arms at the top of the movement and squeeze your chest before slowly bringing the barbell down again. This step should take twice as long raising the weight to get the maximum benefit.\n\n" +
                "Step 4: Repeat the movement for the desired number of repetitions.\n\n" +
                "Step 5: The final step in the exercise is to place the barbell on the rack.\n",3,10,R.drawable.barbellbenchpress,1));
        chest.add(new exercise("Dumbbell Fly","Step 1: Pick up the dumbbells off the floor using a neutral grip (palms facing in). Position the ends of the dumbbells in your hip crease, and sit down on the bench.\n" +
                "\n\n" +
                "Step 2: To get into position, lay back and keep the weights close to your chest. Once you are in position, take a deep breath, then press the dumbbells to lockout at the top.\n" +
                "\n\n" +
                "Step 3: Slightly retract your shoulder blades, unlock your elbows, and slowly lower the dumbbells laterally while maintaining the angle at your elbow.\n" +
                "\n\n" +
                "Step 4: Once the dumbbells reach chest level, reverse the movement by squeezing your pecs together and bringing the dumbbells back to their starting position.\n" +
                "\n\n" +
                "Step 5: Without allowing the dumbbells to touch, start the next repetition, and continue until the set is completed.\n",5,12,R.drawable.dumbbellfly,1));
        biceps = new ArrayList<exercise>();
        biceps.add(new exercise("Barbell Curl","Step 1: Stand up straight while holding a barbell in a shoulder-width grip.\n\n" +
                "Step 2: Contract your biceps to curl the weight forward. Your upper arms should remain stationary during this process.\n\n" +
                "Step 3: Continue moving the barbell until the biceps are fully contracted and the bar is at shoulder height. Hold this position for a second and then squeeze your biceps.\n\n" +
                "Step 4: Bring the barbell back to the starting position. Repeat for the desired number of reps.\n\n",2,8,R.drawable.barbellcurl,4));
        biceps.add(new exercise("Reverse Barbell Curl","Step 1: With your arms extended downward in front of you, grasp a barbell so that your hands are shoulder width apart and your palms facing in towards your body. (The back of your hands should be facing forward.) Stand upright with your feet shoulder width apart. This is your starting position.\n\n" +
                "Step 2: Exhaling, use only your forearms to raise the barbell to your chest, should level high.\n\n" +
                "Step 3: Hold the contraction for a moment and then inhale as you lower the barbell until your arms are extended and the barbell is back in the starting position.\n\n" +
                "Step 4: Repeat for a full set.\n",3,10,R.drawable.reversebarbellcurl,4));
        biceps.add(new exercise("Hammer Curl","Step 1: Stand up straight with your torso upright. Hold a dumbbell in each hand at arms-length. Your elbows should be close to your torso.\n\n" +
                "Step 2: The palms of your hands should be facing your torso. This is the starting position for the exercise.\n\n" +
                "Step 3: Curl the weight forward while contracting your biceps. Your upper arm should remain stationary. Continue to lift the weight until your biceps are fully contracted and the dumbbell is at shoulder level. Hold the contraction for a moment as you squeeze your biceps.\n\n" +
                "Step 4: Inhale and slowly start to bring the dumbbells back to the starting position.\n" +
                "Step 5: Repeat for the desired number of reps.\n",5,12,R.drawable.hammerxurl,4));
        triceps = new ArrayList<exercise>();
        triceps.add(new exercise("Triceps Pressdown","Step 1: Start by bracing your abdominals.\n\n" +
                "Step 2: Tuck your elbows in at your sides and position your feet slightly apart.1\n\n" +
                "Step 3: Inhale. Push down until your elbows are fully extended but not yet in the straight, locked position. Keep your elbows close to your body and bend your knees slightly on the pushdown. Resist bending forward. Try to keep your back as straight as possible as you push down.\n\n" +
                "Step 4: As you exhale, return to the starting point using a controlled movement. Try not to crash the weights.\n\n",2,8,R.drawable.tricepspressdown,5));
        triceps.add(new exercise("Bench Dips","Step 1: Place the chairs facing each other, about 3 feet apart.\n\n" +
                "Step 2: Sit on the edge of one chair and grip the edge with your hands.\n\n" +
                "Step 3: Place your heels on the edge of the other chair and hold yourself up using your triceps.\n\n" +
                "Step 4: Slide forward just far enough that your behind clears the edge of the chair, then lower yourself until your elbows are bent between 45 and 90 degrees.\n\n" +
                "Step 5: Push yourself back up to the start position and repeat. Go slowly and control the movement throughout the range of motion.\n\n",3,10,R.drawable.benchdips,5));
        triceps.add(new exercise("Lying Dumbbell Tricep Extension","Step 1: Grab a pair of dumbbells and sit on the end of a flat bench. \n\n" +
                "Step 2: Lie back and raise the dumbbells above your head using a neutral grip, palms facing each other. \n\n" +
                "Step 3: Bending at the elbows and keeping your upper arms set, lower the dumbbells until they are about level with your ears. \n\n" +
                "Step 4: Squeeze your triceps and raise the dumbbells back to the starting position.\n\n",5,12,R.drawable.lyingdumbbelltricepsrxtension,5));
        leg = new ArrayList<exercise>();
        leg.add(new exercise("Seated Leg Curl","Step 1: Sit upright on a leg press machine that is adjusted to your height. Your back should be against the back pad and your feet should be on the foot rests with your thighs under the leg pads.\n\n" +
                "Step 2: Grasp the handle bars and raise your legs so that they are fully extended in front of you and parallel to the floor for your starting position.\n\n" +
                "Step 3: Exhale and lower your legs, bending at the knees, until your legs form a 90 degree angle.\n\n" +
                "Step 4: Pause for a moment and then inhale as you raise your legs back to the starting position.\n\n" +
                "Step 5: Repeat for a complete set.\n",2,8,R.drawable.seatedlegcurl,6));
        leg.add(new exercise("Leg Extension","Step 1: Sit on a leg extension machine. Position your legs under the pad and grasp the side bars with your hands. This is the starting position.\n\n" +
                "Step 2: Extend your legs to the maximum, exhaling as you do so. Pause a second in this contracted position.\n\n" +
                "Step 3: Lower the weight back to the original position as you inhale. Make sure your legs don't go past the 90-degree angle point.\n\n" +
                "Step 4: Repeat for the desired number of reps.\n",3,10,R.drawable.legextension,6));
        leg.add(new exercise("Squat","Step 1: Using a squat rack, place the barbell at shoulder height.\n\n" +
                "Step 2: Turn around so that the barbell is below your neck and behind your shoulders.\n\n" +
                "Step 3: With your arms positioned wide on the barbell, push up with your legs and straighten up to lift the barbell onto your back.\n\n" +
                "Step 4: Step forward and place your feet shoulder width apart with your toes pointing slightly outward.\n\n" +
                "Step 5: With your back straight and your head up, inhale and bend your knees until you are in a seated position and your knees are perpendicular to your toes.\n\n" +
                "Step 6: Exhaling, push off with your heels to straighten your legs and return to a standing position.\n\n" +
                "Step 7: Repeat.\n",5,12,R.drawable.squat,6));
        shoulder = new ArrayList<exercise>();
        shoulder.add(new exercise("Dumbbell Push Press","Step 1: Select two dumbbells of an appropriate weight.\n\n" +
                "Step 2: Start with one end of the dumbbells resting lightly on your shoulders, with your palms facing each other, standing with your feet hip-width apart.\n\n" +
                "Step 3: While bracing your core and keeping your back straight, bend your knees slightly, just enough to get some momentum without performing a full squat.\n\n" +
                "Step 4: As soon as the knees are slightly flexed, extend your hips and knees simultaneously by driving through your heels while pressing the dumbbells overhead.\n\n" +
                "Step 5: With controlled motion, lower the weights back down to your shoulders and prepare for the next repetition.\n\n",2,8,R.drawable.dumbbellpushpress,3));
        shoulder.add(new exercise("Lateral Raise","Step 1: With a dumbbell in each hand, palms facing in, stand upright with your feet shoulder width apart and your arms down by your sides. This is your starting position.\n\n" +
                "Step 2: With straight arms, exhale as you raise the dumbbells out to the sides until your arms are parallel with the floor.\n\n" +
                "Step 3: Hold the contraction for a moment and then inhale as you lower the dumbbells back to your starting position.\n\n" +
                "Step 4: Repeat for a full set.\n",3,10,R.drawable.dumbbelllateralraise,3));
        shoulder.add(new exercise("Standing Barbell Shoulder Press","Step 1: Grasp a barbell with hands wider than shoulder width apart and your palms facing down.\n\n" +
                "Step 2: Keep your feet shoulder width apart and your knees slightly bent.\n\n" +
                "Step 3: Raise the barbell to your chest and then overhead and slightly forward for your starting position.\n\n" +
                "Step 4: Inhale as you slowly lower the bar back to your chest.\n\n" +
                "Step 5: Exhale as you slowly raise the bar back overhead to the starting position.\n\n" +
                "Step 6: Repeat for a complete set.\n",5,12,R.drawable.standingbarbellshoulderpress,3));
        back = new ArrayList<exercise>();
        back.add(new exercise("Seated V-Bar Cable Row",
                "Step 1: Attach a V-bar to a rowing machine and sit on the bench with your feet on the foot rest and your knees slightly bent.\n\n" +
                "Step 2: Grasp the V-bar so that your palms are facing forward.\n\n" +
                "Step 3: Extend your arms as you lean backward, achieving a 90 degree angle between your waist and your legs. Slightly arch your back so that your chest protrudes. This is your starting position.\n\n" +
                "Step 4: Without moving your torso, exhale as you pull the V-bar towards your body until it nearly touches your chest.\n\n" +
                "Step 5: Contract your back muscles for a count and then inhale as you slowly return the V-bar back to starting position.\n\n" +
                "Step 6: Repeat for a complete set.\n",2,8,R.drawable.seatedvbarcablerow,2));
        back.add(new exercise("Barbell Deadlift","Step 1: Load a barbell and roll it against your shins. Bend at your hips and knees and grab the bar with an overhand grip, your hands just beyond shoulder width.\n\n" +
                "Step 2: Keeping your lower back naturally arched, pull your torso up and thrust your hips forward as you stand up with the barbell. \n\n" +
                "Step 3: As you lift the bar, keep it as close to your body as possible. \n\n" +
                "Step 4: Lower the bar to the floor\n",3,10,R.drawable.barbelldeadlift,2));
        back.add(new exercise("Barbell Row","Step 1: Load a barbell and roll it against your shins. Bend at your hips and knees and grab the bar with an overhand grip, your hands just beyond shoulder width.\n\n" +
                "Step 2: Keeping your lower back naturally arched, pull your torso up and thrust your hips forward as you stand up with the barbell. \n\n" +
                "Step 3: As you lift the bar, keep it as close to your body as possible. \n\n" +
                "Step 4: Lower the bar to the floor\n",5,12,R.drawable.barbellrow,2));

        homechest = new ArrayList<>();
        homechest.add(new exercise("Dumbbell Bench Press","Step 1: Lie flat on back on a flat bench and hold one dumbbell in each hand with thumbs just outside of nipples.\n\n" +
                "Step 2: Press dumbbells straight up into the air and lock arms out at a full extended position and with the dumbbells touching at the peak of the movement.\n\n" +
                "Step 3: Lower dumbbells to complete the repetition.\n",2,8,R.drawable.dumbbellbenchpress,1));
        homechest.add(new exercise("Dumbbell Fly","Step 1: Pick up the dumbbells off the floor using a neutral grip (palms facing in). Position the ends of the dumbbells in your hip crease, and sit down on the bench.\n" +
                "\n" +
                "Step 2: To get into position, lay back and keep the weights close to your chest. Once you are in position, take a deep breath, then press the dumbbells to lockout at the top.\n" +
                "\n" +
                "Step 3: Slightly retract your shoulder blades, unlock your elbows, and slowly lower the dumbbells laterally while maintaining the angle at your elbow.\n" +
                "\n" +
                "Step 4: Once the dumbbells reach chest level, reverse the movement by squeezing your pecs together and bringing the dumbbells back to their starting position.\n" +
                "\n" +
                "Step 5: Without allowing the dumbbells to touch, start the next repetition, and continue until the set is completed.\n",3,10,R.drawable.dumbbellfly,1));
        homechest.add(new exercise("Push Up","Step 1: Lie on an exercise floor mat, face down.\n\n" +
                "Step 2: Press your toes against the floor and place your hands flat on the ground shoulder width apart, fingers extended forward.\n\n" +
                "Step 3: Push yourself up so that your arms are nearly extended and your torso and legs are off the floor. This is your starting position.\n\n" +
                "Step 4: Inhaling, bend your arms to lower your body and touch your chest nearly to the floor.\n\n" +
                "Step 5: Exhaling, contract your chest as you push off the ground and return to the starting position.\n\n" +
                "Step 6: Pause for a moment and then repeat for a full set.\n",5,12,R.drawable.pushups,1));
        homeback = new ArrayList<>();
        homeback.add(new exercise("Dumbbell Bent Over Row","Step 1: Assume a standing position while holding a dumbbell in each hand with a neutral grip.\n\n" +
                "Step 2: Hinge forward until your torso is roughly parallel with the floor (or slightly above) and then begin the movement by driving the elbows behind the body while retracting the shoulder blades.\n\n" +
                "Step 3: Pull the dumbbells towards your body until the elbows are at (or just past) the midline and then slowly lower the dumbbells back to the starting position under control.\n\n" +
                "Step 4: Repeat for the desired number of repetitions.\n",2,8,R.drawable.dumbbellbentoverrowsinglearm,2));
        homeback.add(new exercise("Pull Up","Step 1: Facing a pull up bar, grasp the handles with your palms facing away from you.\n\n" +
                "Step 2: Pull in your torso so that your chest is out and there is a slight curve to your lower back.\n\n" +
                "Step 3: Exhaling, raise your body weight up until the bar touches your upper chest.\n\n" +
                "Step 4: Contract your back muscles for a moment and then inhale as you extend your arms completely and return back to the starting position.\n\n" +
                "Step 5: Repeat for a complete set.\n",3,10,R.drawable.pullup,2));
        homeback.add(new exercise("Dumbbell Deadlift","Step 1: Stand with your feet hip-width apart, holding a pair of heavy dumbbells in front of your thighs, palms facing you.\n\n" +
                "Step 2: Keeping your back flat, shoulders back, and core engaged, push your hips back and simultaneously hinge forward at your waist as you bend at your knees (imagine closing a car door with your butt).\n\n" +
                "Step 3: Lower your torso until it’s nearly parallel to the floor and/or you feel a deep stretch in your hamstrings. Keep the dumbbells within an inch or two of your legs throughout the move.\n\n" +
                "Step 4: Pause, and then slowly reverse the movement to return to the standing position.\n",5,12,R.drawable.dumbbelldeadlift,2));
        homeshoulder = new ArrayList<>();
        homeshoulder.add(new exercise("Dumbbell Push Press","Step 1: Select two dumbbells of an appropriate weight.\n\n" +
                "Step 2: Start with one end of the dumbbells resting lightly on your shoulders, with your palms facing each other, standing with your feet hip-width apart.\n\n" +
                "Step 3: While bracing your core and keeping your back straight, bend your knees slightly, just enough to get some momentum without performing a full squat.\n\n" +
                "Step 4: As soon as the knees are slightly flexed, extend your hips and knees simultaneously by driving through your heels while pressing the dumbbells overhead.\n\n" +
                "Step 5: With controlled motion, lower the weights back down to your shoulders and prepare for the next repetition.\n",2,8,R.drawable.dumbbellpushpress,3));
        homeshoulder.add(new exercise("Lateral Raise","Step 1: With a dumbbell in each hand, palms facing in, stand upright with your feet shoulder width apart and your arms down by your sides. This is your starting position.\n\n" +
                "Step 2: With straight arms, exhale as you raise the dumbbells out to the sides until your arms are parallel with the floor.\n\n" +
                "Step 3: Hold the contraction for a moment and then inhale as you lower the dumbbells back to your starting position.\n\n" +
                "Step 4: Repeat for a full set.\n",3,10,R.drawable.dumbbelllateralraise,3));
        homeshoulder.add(new exercise("Dumbbell Front Raise","Step 1: Stand with your feet about shoulder-width apart. Let your arms hang in front of you with the dumbbells in front of the thighs (palms facing the thighs). Your back is straight, your feet are planted flat on the floor, and your abdominal muscles are engaged.\n\n" +
                "Step 2: Lift the weights upward while inhaling. Your arms are extended, palms facing down, with a slight bend in the elbows to reduce the stress on the joints.\n\n" +
                "Step 3: Pause briefly when your arms are horizontal to the floor.\n\n" +
                "Step 4: Lower the dumbbells to the starting position (at the thighs) with a slow and controlled motion while exhaling.\n\n",5,12,R.drawable.dumbbellfrontraise,3));
        homebiceps = new ArrayList<>();
        homebiceps.add(new exercise("Hammer Curl","Step 1: Stand up straight with your torso upright. Hold a dumbbell in each hand at arms-length. Your elbows should be close to your torso.\n\n" +
                "Step 2: The palms of your hands should be facing your torso. This is the starting position for the exercise.\n\n" +
                "Step 3: Curl the weight forward while contracting your biceps. Your upper arm should remain stationary. Continue to lift the weight until your biceps are fully contracted and the dumbbell is at shoulder level. Hold the contraction for a moment as you squeeze your biceps.\n\n" +
                "Step 4: Inhale and slowly start to bring the dumbbells back to the starting position.\n\n" +
                "Step 5: Repeat for the desired number of reps.\n",2,8,R.drawable.hammercurl,4));
        homebiceps.add(new exercise("Dumbbell Concentration Curl","Step 1: Sit down on a bench holding a dumbbell in your left hand, and rest your elbow on the inside of your left thigh.\n" +
                "\n" +
                "Step 2: Squeeze the left biceps and bring the dumbbell toward your chest.\n" +
                "\n" +
                "Step 3: Lower the left arm to the starting position, repeat, and then switch arms.\n",3,10,R.drawable.dumbbellconcentrationcurl,4));
        homebiceps.add(new exercise("Incline Dumbbell Curl","Step 1: Sit down against the workout bench, keeping your back straight and your abdominal muscles tight. Your weights should be at your sides to start, one in each hand.\n\n" +
                "Step 2: When you’ve gotten the starting position down, lift each dumbbell, palms up, toward your shoulders. It’s important to keep your upper arms tight so that you can isolate the biceps brachii muscle as you move your lower arms only.\n\n" +
                "Step 3: Slowly lower the dumbbells back down to your starting position. Don’t release the weights too fast or you could strain your muscles. This should be a controlled movement.\n\n",5,12,R.drawable.inclinedumbbelcurl,4));
        hometriceps = new ArrayList<>();
        hometriceps.add(new exercise("lying Dumbbell Triceps Extension","Step 1: Grab a pair of dumbbells and sit on the end of a flat bench. \n\n" +
                "Step 2: Lie back and raise the dumbbells above your head using a neutral grip, palms facing each other. \n\n" +
                "Step 3: Bending at the elbows and keeping your upper arms set, lower the dumbbells until they are about level with your ears. \n\n" +
                "Step 4: Squeeze your triceps and raise the dumbbells back to the starting position.\n\n",2,8,R.drawable.lyingdumbbelltricepsrxtension,5));
        hometriceps.add(new exercise("Bench Dips","Step 1: Place the chairs facing each other, about 3 feet apart.\n\n" +
                "Step 2: Sit on the edge of one chair and grip the edge with your hands.\n\n" +
                "Step 3: Place your heels on the edge of the other chair and hold yourself up using your triceps.\n\n" +
                "Step 4: Slide forward just far enough that your behind clears the edge of the chair, then lower yourself until your elbows are bent between 45 and 90 degrees.\n\n" +
                "Step 5: Push yourself back up to the start position and repeat. Go slowly and control the movement throughout the range of motion.\n",3,10,R.drawable.benchdips,5));
        hometriceps.add(new exercise("Kickback","Step 1: Place one knee, shin and foot on a flat bench and bend over to keep your torso parallel to the floor. Grasp the head of the bench with your fingertips. \n\n" +
                "Step 2: In the outside hand hold a dumbbell. Press and hold that dumbbell-holding arm against your side, with a 90° bend at the elbow. \n\n" +
                "Step 3: Straighten your arm backwards until it is parallel to the floor. Contract your triceps at that top portion of the lift. Slowly lower until your arm is back at the 90° angle. After one arm is finished switch arms.\n\n",5,12,R.drawable.kickback,5));
        homeleg = new ArrayList<>();
        homeleg.add(new exercise("Bodyweight Squad","Step 1: Stand straight up with your feet shoulder's width apart.\n\n" +
                "Step 2: While bending at the knees, push your hips out and bend down. Picture yourself sitting on a chair.\n\n" +
                "Step 3: Once your hips have become lined up with your knees, return back to starting position.\n\n" +
                "Step 4: Repeat exercise as desired.\n",2,8,R.drawable.bodyweightsquat,6));
        homeleg.add(new exercise("Squad Jump","Step 1: Stand with feet shoulder-width apart and arms raised out in front of your body.\n\n" +
                "Step 2: Keep your head up and your back straight.\n\n" +
                "Step 3: Begin exercise by swinging your arms back behind your body as you bend your knees and push your hips back.\n\n" +
                "Step 4: Swing arms up as you drive with the balls of your feet and jump straight up into the air as high as you can. Your thighs will be acting like springs. Exhale as you do so.\n\n" +
                "Step 5: When you hit the floor again, squat down and jump as you did before.\n\n" +
                "Step 6: Repeat for the numbers of reps in the set.\n",3,10,R.drawable.jumpsquat,6));
        homeleg.add(new exercise("Dumbbell Lunge","Step 1: Inhale and take a big step forward with your right leg, landing on the heel.\n\n" +
                "Step 2: Bend at the knee until the right thigh approaches parallel to the ground. The left leg is bent at the knee and balanced on the toes while in the lunge position.\n\n" +
                "Step 3: Step the right foot back on an exhale to return to the starting position.\n" +
                "Step 4: Repeat the motion with the left leg.\n",5,12,R.drawable.lunge,6));
        program1 = new ArrayList<>();
        program2 = new ArrayList<>();
        program3 = new ArrayList<>();
        program4 = new ArrayList<>();
        program5 = new ArrayList<>();
        program6 = new ArrayList<>();
        program7 = new ArrayList<>();
        program8 = new ArrayList<>();
        program9 = new ArrayList<>();
        program10 = new ArrayList<>();
        program1home = new ArrayList<>();
        program2home = new ArrayList<>();
        program3home = new ArrayList<>();
        program4home = new ArrayList<>();
        program5home = new ArrayList<>();
        program6home = new ArrayList<>();
        program7home = new ArrayList<>();
        program8home = new ArrayList<>();
        program9home = new ArrayList<>();
        program10home = new ArrayList<>();
        programx = new ArrayList<>();

        program1.add(chest.get(0));
        program1.add(back.get(0));
        program1.add(shoulder.get(0));
        program1.add(biceps.get(0));
        program1.add(triceps.get(0));
        program1.add(leg.get(0));

        program2.add(chest.get(1));
        program2.add(back.get(1));
        program2.add(shoulder.get(0));
        program2.add(biceps.get(0));
        program2.add(triceps.get(0));
        program2.add(leg.get(0));

        program3.add(chest.get(1));
        program3.add(back.get(1));
        program3.add(shoulder.get(1));
        program3.add(biceps.get(0));
        program3.add(triceps.get(0));
        program3.add(leg.get(0));

        program4.add(chest.get(1));
        program4.add(back.get(1));
        program4.add(shoulder.get(1));
        program4.add(biceps.get(0));
        program4.add(triceps.get(0));
        program4.add(leg.get(1));

        program5.add(chest.get(1));
        program5.add(back.get(1));
        program5.add(shoulder.get(1));
        program5.add(biceps.get(1));
        program5.add(triceps.get(1));
        program5.add(leg.get(1));

        program6.add(chest.get(2));
        program6.add(back.get(2));
        program6.add(shoulder.get(1));
        program6.add(biceps.get(1));
        program6.add(triceps.get(1));
        program6.add(leg.get(1));

        program7.add(chest.get(2));
        program7.add(back.get(2));
        program7.add(shoulder.get(2));
        program7.add(biceps.get(1));
        program7.add(triceps.get(1));
        program7.add(leg.get(1));

        program8.add(chest.get(2));
        program8.add(back.get(2));
        program8.add(shoulder.get(2));
        program8.add(biceps.get(1));
        program8.add(triceps.get(1));
        program8.add(leg.get(2));

        program9.add(chest.get(2));
        program9.add(back.get(2));
        program9.add(shoulder.get(2));
        program9.add(biceps.get(2));
        program9.add(triceps.get(2));
        program9.add(leg.get(2));


        program1home.add(homechest.get(0));
        program1home.add(homeback.get(0));
        program1home.add(homeshoulder.get(0));
        program1home.add(homebiceps.get(0));
        program1home.add(hometriceps.get(0));
        program1home.add(homeleg.get(0));

        program2home.add(homechest.get(1));
        program2home.add(homeback.get(1));
        program2home.add(homeshoulder.get(0));
        program2home.add(homebiceps.get(0));
        program2home.add(hometriceps.get(0));
        program2home.add(homeleg.get(0));

        program3home.add(homechest.get(1));
        program3home.add(homeback.get(1));
        program3home.add(homeshoulder.get(1));
        program3home.add(homebiceps.get(0));
        program3home.add(hometriceps.get(0));
        program3home.add(homeleg.get(0));

        program4home.add(homechest.get(1));
        program4home.add(homeback.get(1));
        program4home.add(homeshoulder.get(1));
        program4home.add(homebiceps.get(0));
        program4home.add(hometriceps.get(0));
        program4home.add(homeleg.get(1));

        program5home.add(homechest.get(1));
        program5home.add(homeback.get(1));
        program5home.add(homeshoulder.get(1));
        program5home.add(homebiceps.get(1));
        program5home.add(hometriceps.get(1));
        program5home.add(homeleg.get(1));

        program6home.add(homechest.get(2));
        program6home.add(homeback.get(2));
        program6home.add(homeshoulder.get(1));
        program6home.add(homebiceps.get(1));
        program6home.add(hometriceps.get(1));
        program6home.add(homeleg.get(1));

        program7home.add(homechest.get(2));
        program7home.add(homeback.get(2));
        program7home.add(homeshoulder.get(2));
        program7home.add(homebiceps.get(1));
        program7home.add(hometriceps.get(1));
        program7home.add(homeleg.get(1));

        program8home.add(homechest.get(2));
        program8home.add(homeback.get(2));
        program8home.add(homeshoulder.get(2));
        program8home.add(homebiceps.get(1));
        program8home.add(hometriceps.get(1));
        program8home.add(homeleg.get(2));

        program9home.add(homechest.get(2));
        program9home.add(homeback.get(2));
        program9home.add(homeshoulder.get(2));
        program9home.add(homebiceps.get(2));
        program9home.add(hometriceps.get(2));
        program9home.add(homeleg.get(2));




        double x;

        x=HomePage.muscle;

        if(!HomePage.switchgymhome)
        {


            if(x<=55){
                programx = program1;
            }
            else if(x>55&&x<=60){
                programx = program2;
            }
            else if(x>60&&x<=65){
                programx = program3;
            }
            else if(x>65&&x<=70){
                programx = program4;
            }
            else if(x>70&&x<=75){
                programx = program5;
            }
            else if(x>75&&x<=80){
                programx = program6;
            }
            else if(x>80&&x<=85){
                programx = program7;
            }
            else if(x>85&&x<=90){
                programx = program8;
            }
            else {
                programx = program9;
            }
        }
        else
        {


            if(x<=55){
                programx = program1home;
            }
            else if(x>55&&x<=60){
                programx = program2home;
            }
            else if(x>60&&x<=65){
                programx = program3home;
            }
            else if(x>65&&x<=70){
                programx = program4home;
            }
            else if(x>70&&x<=75){
                programx = program5home;
            }
            else if(x>75&&x<=80){
                programx = program6home;
            }
            else if(x>80&&x<=85){
                programx = program7home;
            }
            else if(x>85&&x<=90){
                programx = program8home;
            }
            else {
                programx = program9home;
            }

        }

    }

}
