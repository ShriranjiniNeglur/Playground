package com.example.login;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;

public class ForgotPassword extends AppCompatActivity {
    Button ContinueBtn;
    TextView text1;
    TextView text2;
    ImageView img1;
    ImageView img2;
    EditText emailtext;
    AlertDialog.Builder alertBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        alertBuilder=new AlertDialog.Builder(this);
        final View alertView=getLayoutInflater().inflate(R.layout.pop_up,null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog=alertBuilder.create();
        ContinueBtn=findViewById(R.id.Continubtn);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        text1.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        ContinueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.VISIBLE);
                alertDialog.show();
            }
        });
    }
}
