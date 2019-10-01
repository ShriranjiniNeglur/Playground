package com.example.requestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.requestapp.model.Request_items;

import java.util.ArrayList;

class ItemAdapter extends BaseAdapter {
    private Context context;
    ArrayList<Request_items> request_items;
    public ItemAdapter(Context context, ArrayList<Request_items> requestview) {
        this.context=context;
        this.request_items=requestview;
    }

    @Override
    public int getCount() {
        return request_items.size();
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
        View viewitems = LayoutInflater.from(context).inflate(R.layout.request_items,viewGroup,false);

        TextView listitens;

        listitens=viewitems.findViewById(R.id.listitens);

        Request_items request_items = this.request_items.get(position);
        listitens.setText(String.valueOf(request_items.getRequestItems()));
        return viewitems;

    }
}
