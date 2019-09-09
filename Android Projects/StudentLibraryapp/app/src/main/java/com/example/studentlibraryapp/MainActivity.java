package com.example.studentlibraryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button button;
  Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button1 =findViewById(R.id.ldt);
        button =findViewById(R.id.sdt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                student_detail s = new student_detail();
               s.details(getApplicationContext());
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                library_detail l = new library_detail();
               l.books(getApplicationContext());
            }
        });

    }
}
