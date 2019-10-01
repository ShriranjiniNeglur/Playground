package com.example.requestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
  TextView texterror_emailid;
  ImageView loginerror_emailid;
  TextView texterror_password;
  ImageView loginerror_password;
  EditText username;
  TextView forgotpassword;
  Button login_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texterror_emailid=findViewById(R.id.texterror_emailid);
        loginerror_emailid=findViewById(R.id.loginerror_emailid);
        texterror_password=findViewById(R.id.texterror_password);
        loginerror_password=findViewById(R.id.loginerror_password);
        username=findViewById(R.id.username);
        login_button=findViewById(R.id.login_button);
        forgotpassword=findViewById(R.id.forgotpassword);

        texterror_emailid.setVisibility(View.INVISIBLE);
        loginerror_emailid.setVisibility(View.INVISIBLE);
        texterror_password.setVisibility(View.INVISIBLE);
        loginerror_password.setVisibility(View.INVISIBLE);

        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(intent);
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("")){
                    texterror_emailid.setVisibility(View.VISIBLE);
                    texterror_password.setVisibility(View.VISIBLE);
                    loginerror_emailid.setVisibility(View.VISIBLE);
                    loginerror_password.setVisibility(View.VISIBLE);
                }else {
                    Intent intent=new Intent(getApplicationContext(),MyRequest.class);
                    startActivity(intent);
            }
        }

    });

    }
}
