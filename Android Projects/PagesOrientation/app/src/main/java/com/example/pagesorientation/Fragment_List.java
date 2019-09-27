package com.example.pagesorientation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.pagesorientation.Delegates.Delegates_form;
import com.example.pagesorientation.global.RequestStatus;
import com.example.pagesorientation.models.RequestModel;

import java.util.ArrayList;


public class Fragment_List extends Fragment {
    ListView listView;
   private Delegates_form delegates_form;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

              view=  inflater.inflate(R.layout.fragment_fragment__list, container, false);


        listView =view. findViewById(R.id.listview);


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

        ListAdapter adapterfile = new AdapterFile (view.getContext(),requestlist);
        listView.setAdapter(adapterfile);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long arg) {
                RequestModel requestModel = requestlist.get(position);
                if (delegates_form !=null){
                    delegates_form.onclickRequestItem(requestModel);
                }
            }
        });
                return view;
    }

     public void setDelegates_form(Delegates_form delegates_form){
        this.delegates_form = delegates_form;
     }
}
