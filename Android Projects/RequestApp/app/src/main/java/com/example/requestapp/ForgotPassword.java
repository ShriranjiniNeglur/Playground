package com.example.requestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    TextView forgottexterror;
    TextView forgottext;
    ImageView forgorerroricon;
    ImageView forgoterrorimage;
    EditText forgot_username;
    Button continue_button;
    AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        alertBuilder=new AlertDialog.Builder(this);
        final View alertView=getLayoutInflater().inflate(R.layout.forgotpopup_window,null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog=alertBuilder.create();




        forgorerroricon=findViewById(R.id.forgorerroricon);
        forgoterrorimage=findViewById(R.id.forgoterrorimage);
        forgottexterror=findViewById(R.id.forgottexterror);
        forgottext=findViewById(R.id.forgottext);
        forgot_username=findViewById(R.id.forgot_username);
        continue_button=findViewById(R.id.continue_button);

        forgottext.setVisibility(View.INVISIBLE);
        forgottexterror.setVisibility(View.INVISIBLE);
        forgoterrorimage.setVisibility(View.INVISIBLE);
        forgorerroricon.setVisibility(View.INVISIBLE);

        continue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (forgot_username.getText().toString().equals("")){
                    forgottext.setVisibility(View.VISIBLE);
                    forgottexterror.setVisibility(View.VISIBLE);
                    forgoterrorimage.setVisibility(View.VISIBLE);
                    forgorerroricon.setVisibility(View.VISIBLE);
                }
                else {
                    alertDialog.show();
                }

            }
        });


    }
}
