package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecycleView extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerView=findViewById(R.id.recyclerView);

        String title[]={"PUR-056-2019","PUR-056-2019","PUR-056-2019","PUR-056-2019","PUR-056-2019"};
        String date[]={"06-JUL-2019","06-JUL-2019","06-JUL-2019","06-JUL-2019","06-JUL-2019"};
        String status[]={"APPROVED","REJECTED","DRAFT","AWAITING","COMPLETED"};
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        MyRecyclerListAdapter myRecyclerListAdapter=new MyRecyclerListAdapter(getApplicationContext(),title,date,status);
        recyclerView.setAdapter(myRecyclerListAdapter);
    }
}
