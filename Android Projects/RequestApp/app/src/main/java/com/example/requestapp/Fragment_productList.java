package com.example.requestapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.requestapp.Request_Delegates.RequestDelegate_form;
import com.example.requestapp.global.RequestStatus;
import com.example.requestapp.model.Request_model;

import java.util.ArrayList;


public class Fragment_productList extends Fragment {
    ListView listView;
    private RequestDelegate_form requestDelegate_form;
    private View view;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      view=  inflater.inflate(R.layout.fragment_productlist, container, false);
        listView =view. findViewById(R.id.listview);


        final ArrayList<Request_model> requestlist = new ArrayList<>();

        Request_model request_model = new Request_model();

        request_model.setRequestnumber("PUR-056-2019");
        request_model.setDescription("06-JUL-2019");
        request_model.setRequestStatus(RequestStatus.Approved);
        requestlist.add(request_model);


        request_model  = new Request_model();
        request_model.setRequestnumber("PUR-057-2018");
        request_model.setDescription("27-AUG-2018");
        request_model.setRequestStatus(RequestStatus.Awaititng_Approved);
        requestlist.add(request_model);


        request_model = new Request_model();
        request_model.setRequestnumber("PUR-058-2017");
        request_model.setDescription("15-SEP-2019");
        request_model.setRequestStatus(RequestStatus.Draft);
        requestlist.add(request_model);


        request_model = new Request_model();
        request_model.setRequestnumber("PUR-059-2016");
        request_model.setDescription("05-OCT-2019");
        request_model.setRequestStatus(RequestStatus.Rejected);
        requestlist.add(request_model);

        ListAdapter adapterfile = new AdapterFile (view.getContext(),requestlist);
        listView.setAdapter(adapterfile);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long arg) {
                Request_model request_model = requestlist.get(position);
                if (requestDelegate_form !=null){
                    requestDelegate_form.onclickRequestDelegate_form(request_model);
                }
            }
        });

        return view;

    }
    public void setDelegates_form(RequestDelegate_form requestDelegate_form){
        this.requestDelegate_form=requestDelegate_form;
    }


}
