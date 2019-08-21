package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button LoginBtn;
 TextView T1;
 TextView T2;
 ImageView I1;
 ImageView I2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginBtn=findViewById(R.id.LoginBtn);
        T1=findViewById(R.id.t1);
        T2=findViewById(R.id.t2);
        I1=findViewById(R.id.w1);
        I2=findViewById(R.id.w2);
        T1.setVisibility(View.INVISIBLE);
        T2.setVisibility(View.INVISIBLE);
        I1.setVisibility(View.INVISIBLE);
        I2.setVisibility(View.INVISIBLE);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setVisibility(View.VISIBLE);
                T2.setVisibility(View.VISIBLE);
                I1.setVisibility(View.VISIBLE);
                I2.setVisibility(View.VISIBLE);
            }
        });
    }
}
