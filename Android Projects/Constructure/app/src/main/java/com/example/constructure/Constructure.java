package com.example.constructure;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_LONG;

public class Constructure extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
      Constructure() {
//      System.out.println("contrcuture");
    }


    public void object(Context applicationContext) {
            Toast.makeText(applicationContext, "This is constrcuture demo", LENGTH_LONG).show();


    }
}
