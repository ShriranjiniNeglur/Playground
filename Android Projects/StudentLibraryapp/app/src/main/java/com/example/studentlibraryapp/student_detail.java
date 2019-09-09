package com.example.studentlibraryapp;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class student_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    student_detail(){

    }
    public void details(Context applicationContext){
        Toast.makeText(applicationContext ,"This is to enter student details",Toast.LENGTH_LONG).show();

    }
}
