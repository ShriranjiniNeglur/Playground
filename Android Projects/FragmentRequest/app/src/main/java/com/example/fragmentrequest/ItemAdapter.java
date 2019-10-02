package com.example.fragmentrequest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.fragmentrequest.Models.Items_List;

import java.util.ArrayList;

class ItemAdapter extends BaseAdapter {
    private Context context;
    ArrayList<Items_List> items_list;
    public ItemAdapter(Context context, ArrayList<Items_List> requestview) {
        this.context=context;
        this.items_list=requestview;
    }

    @Override
    public int getCount() {
        return items_list.size();
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

        Items_List items_list = this.items_list.get(position);
        listitens.setText(String.valueOf(items_list.getRequestItems()));
        return viewitems;
    }
}
