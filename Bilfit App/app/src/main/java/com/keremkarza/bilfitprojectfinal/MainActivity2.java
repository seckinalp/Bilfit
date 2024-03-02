package com.keremkarza.bilfitprojectfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
    private Button kayitButton;
    private EditText editEmail,editPass;
    private TextView already;
    private String txtEmail,txtPassword;
    private FirebaseAuth mAuth;
    private FirebaseFirestore db;
    private Map<String, Object> user;
    private FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        db = FirebaseFirestore.getInstance();
        kayitButton = (Button) findViewById(R.id.kayit_ol_button);
        editEmail = (EditText) findViewById(R.id.kayit_ol_editEmail);
        editPass = (EditText) findViewById(R.id.kayit_ol_editPassword);
        already = (TextView) findViewById(R.id.already_in);
        mAuth = FirebaseAuth.getInstance();

        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    public void kayitOl(View view) {
        //Toast.makeText(this,"Tıklandı!",Toast.LENGTH_SHORT).show();
        txtEmail = editEmail.getText().toString();
        txtPassword = editPass.getText().toString();
        if(!TextUtils.isEmpty(txtEmail) && !TextUtils.isEmpty(txtEmail) ){
            mAuth.createUserWithEmailAndPassword(txtEmail,txtPassword).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        user = new HashMap<>();
                        user.put("email", txtEmail);
                        user.put("password", txtPassword);
                        mUser = mAuth.getCurrentUser();
                        Toast.makeText(MainActivity2.this,"Kayıt İşlemi Başarılı!",Toast.LENGTH_SHORT).show();
                        db.collection("users").document(mUser.getUid())
                                .set(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if(task.isSuccessful()){
                                            Toast.makeText(MainActivity2.this,"success!",Toast.LENGTH_SHORT).show();
                                        }else{
                                            Toast.makeText(MainActivity2.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                                        }

                                    }
                                });
                        Intent intent = new Intent(MainActivity2.this,RegisterInfo.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity2.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else{
            Toast.makeText(this,"Email ve Şifre Kısımları Dolu olmalı!",Toast.LENGTH_SHORT).show();
        }
    }
}