package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> student;
    Button show;
    Button add;
    Button remove;
    TextView array;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = findViewById(R.id.show);
        editText = findViewById(R.id.editText);
        add = findViewById(R.id.add);
        remove = findViewById(R.id.remove);
        array = findViewById(R.id.array);

        student = new ArrayList<>();
        student.add("RAJU\n");
        student.add("KAJU\n");
        student.add("MANJU\n");
        student.add("SANJU\n");

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < student.size(); i++) {
                    array.setText(array.getText() + student.get(i) + "");
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = editText.getText().toString();
                array.setText(content);

            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < student.size(); i++) {
                    student.remove(0);
                }
            }
        });


    }
}
