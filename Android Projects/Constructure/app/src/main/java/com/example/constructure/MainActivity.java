package com.example.constructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();
    }
    @Override
    public void show(){
        Toast.makeText(getApplicationContext(),"This is constructure",Toast.LENGTH_LONG).show();
    }

}
