package com.keremkarza.bilfitprojectfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.keremkarza.bilfitprojectfinal.R.id;

import java.util.ArrayList;


public class MotivationPage extends AppCompatActivity {
    ImageView back;
    ArrayList<String> quotes;
    TextView quote;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
        quotes = new ArrayList<>();
        createquotes();
        back = findViewById(R.id.backarrow3);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MotivationPage.this, HomePage.class);
                startActivity(intent);
            }
        });
        quote = (TextView) findViewById(R.id.quote);
        quote.setText(randomquote());
        quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quote.setText(randomquote());
            }
        });
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
