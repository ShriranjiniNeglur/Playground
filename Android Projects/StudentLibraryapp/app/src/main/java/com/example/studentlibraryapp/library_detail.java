package com.example.studentlibraryapp;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class library_detail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    library_detail(){
    }

    public void books(Context applicationContext){
        Toast.makeText(applicationContext,"This is to enter books details",Toast.LENGTH_LONG).show();

    }
}
