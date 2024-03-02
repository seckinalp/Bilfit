package com.keremkarza.bilfitprojectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InformativeNutrition extends AppCompatActivity {
    ImageView back;
    ArrayList<String> information;
    int que;
    TextView word, quetxt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informative_nutrition);
        back = findViewById(R.id.backarrow9);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(InformativeNutrition.this,InformativePage.class);
                startActivity(intent);
            }
        });
        information = new ArrayList<>();
        createinformation();
        que=0;
        quetxt=(TextView) findViewById(R.id.textView13);

        word=(TextView) findViewById(R.id.textView15);
        getnext();

        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getnext();
            }
        });
    }
    protected void createinformation(){
        information.add("Eating too much sodium can raise your risk of high blood pressure, heart attack, and stroke. More than 70% of the sodium Americans consume comes from packaged and prepared foods. While sodium has many forms, 90% of the sodium we consume is from salt.");
        information.add("Replacing saturated fat with healthier unsaturated fats can help protect your heart. Common sources of saturated fats are fatty meats such as beef ribs and sausage, whole milk, full-fat cheese, butter, and cream cheese.\n" +"We need some dietary fat to give us energy, help us develop healthy cells, and help us absorb some vitamins and minerals. But unsaturated fat is better for us than saturated fat.");
        information.add("Sugary drinks like sodas, fruit juices, and sweetened teas are the primary source of added sugar in the American diet.\n" +
                "Unfortunately, findings from several studies point to sugar-sweetened beverages increasing risk of heart disease and type 2 diabetes, even in people who are not carrying excess body fat.\n" +
                "Sugar-sweetened beverages are also uniquely harmful for children, as they can contribute not only to obesity in children but also to conditions that usually do not develop until adulthood, like type 2 diabetes, high blood pressure, and non-alcoholic fatty liver disease.");
        information.add("Ultra-processed foods are foods containing ingredients that are significantly modified from their original form. They often contain additives like added sugar, highly refined oil, salt, preservatives, artificial sweeteners, colors, and flavors as well.\n" +
                "\n" +
                "Ultra-processed foods are highly palatable, meaning they are easily overeaten, and activate reward-related regions in the brain, which can lead to excess calorie consumption and weight gain. Studies show that diets high in ultra-processed food can contribute to obesity, type 2 diabetes, heart disease, and other chronic conditions.");
        information.add("Hydration is an important and often overlooked marker of health. Staying hydrated helps ensure that your body is functioning optimally and that your blood volume is sufficient.\n" +
                "Drinking water is the best way to stay hydrated, as it’s free of calories, sugar, and additives.\n" +
                "Although there’s no set amount that everyone needs per day, aim to drink enough so that your thirst is adequately quenched.\n");
        information.add("Meat can be a nutritious and healthy part of your diet. It’s very high in protein and a rich source of nutrients.\n" +
                "However, problems occur when meat is charred or burnt. This charring can lead to the formation of harmful compounds that may increase your risk for certain cancers.\n" +
                "When you cook meat, try not to char or burn it. Additionally limit your consumption of red and processed meats like lunch meats and bacon as these are linked to overall cancer risk and colon cancer risk.\n");
        information.add("Diets are generally ineffective and rarely work well long term. In fact, past dieting is one of the strongest predictors for future weight gain.\n" +
                "This is because overly restrictive diets actually lower your metabolic rate, or the amount of calories you burn, making it more difficult to lose weight. At the same time, they also cause alterations to your hunger and satiety hormones, which make you hungrier and may cause strong food cravings for foods high in fat, calories, and sugar.\n"+
                "Weight loss should follow as you transition to whole, nutritious foods — which are naturally more filling while containing fewer calories than processed foods.\n");
        information.add("It's recommended that you eat at least 5 portions of a variety of fruit and veg every day. They can be fresh, frozen, canned, dried or juiced.\n" +
                "Getting your 5 A Day is easier than it sounds. Why not chop a banana over your breakfast cereal, or swap your usual mid-morning snack for a piece of fresh fruit?\n" +
                "A portion of fresh, canned or frozen fruit and vegetables is 80g. A portion of dried fruit (which should be kept to mealtimes) is 30g.\n" +
                "A 150ml glass of fruit juice, vegetable juice or smoothie also counts as 1 portion, but limit the amount you have to no more than 1 glass a day as these drinks are sugary and can damage your teeth.\n");
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
