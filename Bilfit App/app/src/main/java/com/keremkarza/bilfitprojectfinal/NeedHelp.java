package com.keremkarza.bilfitprojectfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class NeedHelp extends AppCompatActivity {
    private EditText editEmail,editMessage;
    private String txtEmail,txtMessage;
    private Map<String, Object> help;
    private FirebaseFirestore db;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_help);
        editEmail = (EditText) findViewById(R.id.email_input);
        editMessage = (EditText) findViewById(R.id.message_input);
        sendBtn = (Button) findViewById(R.id.change);
        db = FirebaseFirestore.getInstance();
        Toast.makeText(NeedHelp.this,"TOASTED2!",Toast.LENGTH_SHORT).show();


    }

    public void send(View view) {
        //Toast.makeText(NeedHelp.this,"TOASTED!",Toast.LENGTH_SHORT).show();
        txtEmail = editEmail.getText().toString();
        txtMessage = editMessage.getText().toString();
        help = new HashMap<>();
        help.put("email", txtEmail);
        help.put("message", txtMessage);
        Toast.makeText(NeedHelp.this,"Mesaj İşlemi Başarılı!",Toast.LENGTH_SHORT).show();
        db.collection("messages").document(txtEmail)
                .set(help).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(NeedHelp.this,"success!",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(NeedHelp.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }
}