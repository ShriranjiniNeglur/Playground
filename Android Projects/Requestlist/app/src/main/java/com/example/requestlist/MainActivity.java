package com.example.requestlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.requestlist.global.RequestStatus;
import com.example.requestlist.model.RequestModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listview);


       final ArrayList<RequestModel> requestlist = new ArrayList<>();

       RequestModel requestModel = new RequestModel();

       requestModel.setRequestnumber("PUR-056-2019");
       requestModel.setDescription("06-JUL-2019");
       requestModel.setRequestStatus(RequestStatus.Approved);
       requestlist.add(requestModel);


        requestModel  = new RequestModel();
        requestModel.setRequestnumber("PUR-056-2018");
        requestModel.setDescription("27-AUG-2018");
        requestModel.setRequestStatus(RequestStatus.Awaititng_Approved);
        requestlist.add(requestModel);


         requestModel = new RequestModel();
        requestModel.setRequestnumber("PUR-056-2017");
        requestModel.setDescription("15-SEP-2019");
        requestModel.setRequestStatus(RequestStatus.Draft);
        requestlist.add(requestModel);


        requestModel = new RequestModel();
        requestModel.setRequestnumber("PUR-056-2016");
        requestModel.setDescription("05-OCT-2019");
        requestModel.setRequestStatus(RequestStatus.Rejected);
        requestlist.add(requestModel);

        ListAdapter adapterfile = new AdapterFile (getApplicationContext(),requestlist);
        listView.setAdapter(adapterfile);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),Requestview.class);
                startActivity(intent);
            }
        });
    }
}
