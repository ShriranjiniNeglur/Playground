package com.example.requestlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RequestReview extends AppCompatActivity {
    TextView productnumber,date,requeststatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_review);

//        productnumber=findViewById(R.id.productnumber);
//        date=findViewById(R.id.date);
//        requeststatus=findViewById(R.id.requeststatus);
//
//        Bundle requestBundle = getIntent().getBundleExtra("request");
//        String  RequestNumber= requestBundle.getString("RequestNumber");
//        String RequestDescription = requestBundle.getString("RequestDescription");
//        String RequestStatus = requestBundle.getString("RequestStatus");
//
//       productnumber.setText(RequestNumber);
//       date.setText(RequestDescription);
//       requeststatus.setText(RequestStatus);
    }
}
