package com.keremkarza.bilfitprojectfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class ForgotPassword extends AppCompatActivity {
    private EditText editEmail,editMessage;
    private String txtEmail,txtMessage;
    private Map<String, Object> help;
    private FirebaseFirestore db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        editEmail = (EditText) findViewById(R.id.help_email);
        editMessage = (EditText) findViewById(R.id.help_message);
        db = FirebaseFirestore.getInstance();

    }


    public void send(View view) {
        txtEmail = editEmail.getText().toString();
        txtMessage = editMessage.getText().toString();
        help = new HashMap<>();
        help.put("email", txtEmail);
        help.put("message", txtMessage);
        Toast.makeText(ForgotPassword.this,"Mesaj İşlemi Başarılı!",Toast.LENGTH_SHORT).show();
        db.collection("users").document()
                .set(help).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(ForgotPassword.this,"success!",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(ForgotPassword.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }
}