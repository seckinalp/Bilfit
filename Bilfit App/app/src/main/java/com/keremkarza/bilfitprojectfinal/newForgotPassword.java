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
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class newForgotPassword extends AppCompatActivity {
    private EditText editEmail;
    private String txtEmail;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_forgot_password);
        editEmail = (EditText) findViewById(R.id.forgotten_email);
        db = FirebaseFirestore.getInstance();
    }

    public void send(View view) {
        Toast.makeText(newForgotPassword.this,"TOASTED!",Toast.LENGTH_SHORT).show();
        txtEmail = editEmail.getText().toString();

        if( txtEmail.isEmpty() ){
            Toast.makeText(newForgotPassword.this,"ENTER EMAIL!",Toast.LENGTH_SHORT).show();
        }else{
            FirebaseAuth.getInstance().sendPasswordResetEmail(txtEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful())
                    {
                        // if isSuccessful then done message will be shown
                        // and you can change the password
                        Toast.makeText(newForgotPassword.this,"Done sent",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(newForgotPassword.this,"Error Occurred",Toast.LENGTH_LONG).show();
                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(newForgotPassword.this,"Error Failed",Toast.LENGTH_LONG).show();
                }
            });
        }



    }
}