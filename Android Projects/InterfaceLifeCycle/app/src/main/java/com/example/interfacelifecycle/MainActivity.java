package com.example.interfacelifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Interface,InterfaceA {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display();
        view();
    }
    @Override
    public void Display(){
        Toast.makeText(getApplicationContext(),"This is interface msg",Toast.LENGTH_SHORT).show();


    }

    @Override
    public void view() {
        Toast.makeText(getApplicationContext(),"This is interface 2 msg",Toast.LENGTH_LONG).show();
    }
}
