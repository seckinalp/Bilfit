package com.keremkarza.bilfitprojectfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    private TextView forgotPassword,toRegister,needHelp;
    private EditText editEmail,editPass;
    private String txtEmail,txtPassword;

    private FirebaseAuth mAuth;
    private Map<String, Object> user;
    private FirebaseUser mUser;
    private FirebaseFirestore db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        forgotPassword = (TextView) findViewById(R.id.new_forgot_password);
        toRegister = (TextView) findViewById(R.id.toRegister);
        needHelp = (TextView) findViewById(R.id.need_help);
        editEmail = (EditText) findViewById(R.id.giris_Email);
        editPass = (EditText) findViewById(R.id.giris_Password);
        mAuth = FirebaseAuth.getInstance();


        needHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,NeedHelp.class);
                startActivity(intent);
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,newForgotPassword.class);
                startActivity(intent);

            }
        });
        toRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public void girisYap(View view) {
        txtEmail = editEmail.getText().toString();
        txtPassword = editPass.getText().toString();
        if(!TextUtils.isEmpty(txtEmail) && !TextUtils.isEmpty(txtEmail) ){
            //authenticate user with email/password by adding complete listener
            mAuth.signInWithEmailAndPassword(txtEmail, txtPassword)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                // there was an error
                                Toast.makeText(LoginActivity.this, "Authentication failed." + task.getException(),
                                        Toast.LENGTH_LONG).show();
                                Log.e("MyTag", task.getException().toString());

                            } else {
                                /*
                                user = new HashMap<>();
                                user.put("email", txtEmail);
                                user.put("password", txtPassword);
                                mUser = mAuth.getCurrentUser();
                                Toast.makeText(LoginActivity.this,"Giriş İşlemi Başarılı!",Toast.LENGTH_SHORT).show();
                                db.collection("users").document(mUser.getUid())
                                        .set(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if(task.isSuccessful()){
                                                    Toast.makeText(LoginActivity.this,"success!",Toast.LENGTH_SHORT).show();
                                                }else{
                                                    Toast.makeText(LoginActivity.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                                                }

                                            }
                                        });*/
                                Intent intent = new Intent(LoginActivity.this, HomePage.class);
                                startActivity(intent);
                                finish();
                            }
                        }
                    });
        }else{
            Toast.makeText(this,"Email ve Şifre Kısımları Dolu olmalı!",Toast.LENGTH_SHORT).show();
        }
    }
}
/**
 * FirebaseAuth.getInstance().sendPasswordResetEmail(txtEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
 * @Override
 * public void onComplete(@NonNull Task<Void> task) {
 *         if(task.isSuccessful())
 *         {
 *         // if isSuccessful then done message will be shown
 *         // and you can change the password
 *         Toast.makeText(LoginActivity.this,"Done sent",Toast.LENGTH_LONG).show();
 *         }
 *         else {
 *         Toast.makeText(LoginActivity.this,"Error Occurred",Toast.LENGTH_LONG).show();
 *         }
 *         }
 *         }).addOnFailureListener(new OnFailureListener() {
 * @Override
 * public void onFailure(@NonNull Exception e) {
 *         Toast.makeText(LoginActivity.this,"Error Failed",Toast.LENGTH_LONG).show();
 *         }
 *         });
 */
