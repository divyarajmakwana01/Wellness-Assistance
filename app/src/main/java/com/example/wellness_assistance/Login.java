package com.example.wellness_assistance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
//import android.os.Handler;
//import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
//import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {


    TextInputEditText  textInputEditTextUsername, textInputEditTextPassword;
    Button buttonLogin;
    TextView textViewSignUp;
    ProgressBar progressBar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputEditTextUsername = findViewById(R.id.username);
        textInputEditTextPassword = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.buttonSignUp);
        textViewSignUp = findViewById(R.id.signUpText);
        progressBar = findViewById(R.id.progress);


        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SignUp.class);
                startActivity(intent);
                finish();
            }
        });

        textViewSignUp.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
                finish();
                return false;
            }
        });


//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String fullname, username, password, email;
//
//
//                username = String.valueOf(textInputEditTextUsername.getText());
//                password = String.valueOf(textInputEditTextPassword.getText());
//
//
//
//                if (!username.equals("") && !password.equals("")) {
//
//
//                    //Start ProgressBar first (Set visibility VISIBLE)
//                    Handler handler = new Handler(Looper.getMainLooper());
//                    handler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            //Starting Write and Read data with URL
//                            //Creating array for parameters
//                            String[] field = new String[2];
//
//                            field[0] = "username";
//                            field[1] = "password";
//
//                            //Creating array for data
//                            String[] data = new String[2];
//
//                            data[0] = username;
//                            data[1] = password;
//
//                            PutData putData = new PutData("http://192.168.31.148/LoginRegister/login.php", "POST", field, data);
//                            if (putData.startPut()) {
//                                if (putData.onComplete()) {
//                                    progressBar.setProgress(View.GONE);
//                                    String result = putData.getResult();
//                                    if (result.equals("Login Success")) {
//                                        Intent intent = new Intent(getApplicationContext(), HomePage2.class);
//                                        startActivity(intent);
//                                        finish();
//                                    } else {
//                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
//                                    }
//                                }
//                            }
//                        }
//
//                    });
//
//
//                }
//                else {
//                    Toast.makeText(getApplicationContext(),"All fields are required", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
    }
}