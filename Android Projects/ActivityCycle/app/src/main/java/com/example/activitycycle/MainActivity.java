package com.example.activitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),
                "This is onRestart method",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),
                "This is onstart method",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),
                "This is onResume method",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),
                "This is onpause method",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),
                "This is onStop method",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),
                "This is ondestroy method",Toast.LENGTH_LONG);
        toast.show();
    }

}
