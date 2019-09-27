package com.example.pagesorientation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.pagesorientation.model_items.ItemsList;

import java.util.ArrayList;

class ItemAdapter extends BaseAdapter {
    private Context context;
    ArrayList<ItemsList> itemsList;
    public ItemAdapter(Context context, ArrayList<ItemsList> requestview) {
        this.context=context;
        this.itemsList=requestview;
    }


    @Override
    public int getCount() {
        return  itemsList.size();
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
        View viewitems = LayoutInflater.from(context).inflate(R.layout.items_items,viewGroup,false);

        TextView listitens;

        listitens=viewitems.findViewById(R.id.listitens);

        ItemsList itemsList = this.itemsList.get(position);
        listitens.setText(String.valueOf(itemsList.getRequestItems()));
        return viewitems;
    }
}
