package com.example.itemslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list =findViewById(R.id.list);

        final ArrayList<String> firstFunction = new ArrayList<>(4);
        final ArrayList<String> secondFunction = new ArrayList<>(4);
        final ArrayList<String> thirdFunction = new ArrayList<>(4);

        firstFunction.add("PUR-056-2019");
        firstFunction.add("PUR-056-2019");
        firstFunction.add("PUR-056-2019");
        firstFunction.add("PUR-056-2019");
        firstFunction.add("PUR-056-2019");
        firstFunction.add("PUR-056-2019");
        firstFunction.add("PUR-056-2019");

        secondFunction.add("Approved");
        secondFunction.add("Approved");
        secondFunction.add("Approved");
        secondFunction.add("Approved");
        secondFunction.add("Approved");
        secondFunction.add("Approved");
        secondFunction.add("Approved");

        thirdFunction.add("06-JUL-2019");
        thirdFunction.add("06-JUL-2019");
        thirdFunction.add("06-JUL-2019");
        thirdFunction.add("06-JUL-2019");
        thirdFunction.add("06-JUL-2019");
        thirdFunction.add("06-JUL-2019");
        thirdFunction.add("06-JUL-2019");






        ListAdapter ListAd = new listAdapter(getApplicationContext(),firstFunction,secondFunction,thirdFunction);
            list.setAdapter(ListAd);


    }
}
