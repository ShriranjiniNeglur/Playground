package com.example.requestlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.requestlist.model.RequestModel;

import java.util.ArrayList;

class AdapterFile extends BaseAdapter {
  private   Context context;
  ArrayList<RequestModel> requestModel;


    public AdapterFile(Context context, ArrayList<RequestModel> requestlist) {
        this.context=context;
        this.requestModel= requestlist;
    }

    @Override
    public int getCount() {
        return requestModel.size();
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
        View view = LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);

        TextView productnumber,date,requeststatus;
        ImageView notify;

        productnumber=view.findViewById(R.id.productnumber);
        date=view.findViewById(R.id.date);
        requeststatus=view.findViewById(R.id.requeststatus);
        notify=view.findViewById(R.id.statusicon);


        RequestModel requestModel = this.requestModel.get(position);
        productnumber.setText(String.valueOf(requestModel.getRequestnumber()));
        date.setText(String.valueOf(requestModel.getDescription()));
        requeststatus.setText(String.valueOf(requestModel.getRequestStatus()));
        notify.setImageResource(R.drawable.notify);

        return view;
    }
}
