package com.example.fragmentrequest;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.fragmentrequest.Global.RequestStatus;
import com.example.fragmentrequest.Models.RequestModel;
import com.example.fragmentrequest.Request_Delegates.Delegate_Form;

import java.util.ArrayList;


public class Fragment_Product_list extends Fragment {
    ListView products_list;
 Delegate_Form delegate_form;
private View view;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

      view =  inflater.inflate(R.layout.fragment_fragment__product_list, container, false);

      products_list = view.findViewById(R.id.products_list);

      final ArrayList<RequestModel> requestlist = new ArrayList<>();

      RequestModel requestModel=new RequestModel();

      requestModel.setRequestNumber("PUR-056-2019");
      requestModel.setRequestDate("06-JUL-2019");
      requestModel.setRequestStatus(RequestStatus.Approved);
      requestlist.add(requestModel);

        requestModel=new RequestModel();

        requestModel.setRequestNumber("PUR-057-2019");
        requestModel.setRequestDate("09-JUL-2019");
        requestModel.setRequestStatus(RequestStatus.Awaiting_Awpproved);
        requestlist.add(requestModel);

        requestModel=new RequestModel();

        requestModel.setRequestNumber("PUR-058-2019");
        requestModel.setRequestDate("15-JUL-2019");
        requestModel.setRequestStatus(RequestStatus.Draft);
        requestlist.add(requestModel);

        requestModel=new RequestModel();

        requestModel.setRequestNumber("PUR-059-2019");
        requestModel.setRequestDate("27-JUL-2019");
        requestModel.setRequestStatus(RequestStatus.Rejected);
        requestlist.add(requestModel);

        ListAdapter productAdapter = new Adapterlist (view.getContext(),requestlist);
        products_list.setAdapter(productAdapter);

        products_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long arg) {
                RequestModel requestModel= requestlist.get(position);
                if (delegate_form!=null){
                    delegate_form.onclickDelegate_Form(requestModel);
                }
            }
        });





        return view;
    }
    public void setDelegate_form(Delegate_Form delegate_form){
        this.delegate_form=delegate_form;

    }

}
