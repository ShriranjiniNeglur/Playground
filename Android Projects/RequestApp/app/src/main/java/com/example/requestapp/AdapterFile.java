package com.example.requestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.requestapp.model.Request_model;

import java.util.ArrayList;

class AdapterFile extends BaseAdapter {

    private   Context context;
    ArrayList<Request_model> request_model;
    public AdapterFile(Context context, ArrayList<Request_model> requestlist) {
        this.context=context;
        this.request_model= requestlist;
    }

    @Override
    public int getCount() {
        return request_model.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_list,viewGroup,false);

        TextView productnumber,date,requeststatus;
        ImageView notify;

        productnumber=view.findViewById(R.id.productnumber);
        date=view.findViewById(R.id.date);
        requeststatus=view.findViewById(R.id.requeststatus);
        notify=view.findViewById(R.id.statusicon);


        Request_model request_model = this.request_model.get(position);
        productnumber.setText(String.valueOf(request_model.getRequestnumber()));
        date.setText(String.valueOf(request_model.getDescription()));
        requeststatus.setText(String.valueOf(request_model.getRequestStatus()));
        notify.setImageResource(R.drawable.notify);



        return view;
    }
}
