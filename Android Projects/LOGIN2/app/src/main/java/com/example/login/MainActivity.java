package com.example.login;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView T1;
    TextView T2;
    ImageView I1;
    ImageView I2;
    Button LoginButton;
    EditText username;
    EditText passwordname;
    TextView forget;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forget=findViewById(R.id.forget);
        T1=findViewById(R.id.T1);
        T2=findViewById(R.id.T2);
        I1=findViewById(R.id.I1);
        I2=findViewById(R.id.I2);
        LoginButton=findViewById(R.id.Continuebtn);
        username=findViewById(R.id.forgotuser);
        passwordname=findViewById(R.id.passwordname);

        T1.setVisibility(View.INVISIBLE);
        T2.setVisibility(View.INVISIBLE);
        I1.setVisibility(View.INVISIBLE);
        I2.setVisibility(View.INVISIBLE);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(intent);
            }
        });

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("")||passwordname.getText().toString().equals("")){
                    T1.setVisibility(View.VISIBLE);
                    T2.setVisibility(View.VISIBLE);
                    I1.setVisibility(View.VISIBLE);
                    I2.setVisibility(View.VISIBLE);
                }else {
                    Intent intent=new Intent(getApplicationContext(),BurgerMenu.class);
                    startActivity(intent);
                }
            }
        });







    }
}
