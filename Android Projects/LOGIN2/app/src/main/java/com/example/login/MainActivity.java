package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button LoginBtn;
 TextView T1;
 TextView T2;
 ImageView I1;
 ImageView I2;
 TextView Forgotid;
 ImageView filterOption;
 ListPopupWindow ListPopupWindow;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        filterOption=findViewById(R.id.filterOptionid);
//        ListPopupWindow=new ListPopupWindow(this);
//        filterOption.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        String[] products={"Clear", "Approved", "Draft","Awaititng",
//                "Rejected"};
//        TextView popUp=findViewById(R.id.popUp);
//        ListPopupWindow = new ListPopupWindow(
//                getApplicationContext());
//        ListPopupWindow.setAdapter(new ArrayAdapter(
//                getApplicationContext(),
//                R.layout.list_item, products));
//        ListPopupWindow.setAnchorView(popUp);
//        ListPopupWindow.setModal(true);
//        popUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ListPopupWindow.show();
//            }
//        });
        LoginBtn=findViewById(R.id.LoginBtn);
        T1=findViewById(R.id.t1);
        T2=findViewById(R.id.t2);
        I1=findViewById(R.id.w1);
        I2=findViewById(R.id.w2);
        T1.setVisibility(View.INVISIBLE);
        T2.setVisibility(View.INVISIBLE);
        I1.setVisibility(View.INVISIBLE);
        I2.setVisibility(View.INVISIBLE);
        Forgotid=findViewById(R.id.Forgotid);

        Forgotid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(intent);
            }
        });

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                T1.setVisibility(View.VISIBLE);
//                T2.setVisibility(View.VISIBLE);
//                I1.setVisibility(View.VISIBLE);
//                I2.setVisibility(View.VISIBLE);
                Intent intent=new Intent(getApplicationContext(),BurgerMenu.class);
                startActivity(intent);

            }
        });
    }
}
