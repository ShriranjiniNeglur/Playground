package com.example.itemslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class listAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> Farray;
    ArrayList<String> Sarray;
    ArrayList<String> Tarray;

    public listAdapter(Context context, ArrayList<String> firstFunction, ArrayList<String> secondFunction, ArrayList<String> thirdFunction) {
       this.context = context;
       this.Farray = firstFunction;
       this.Sarray = secondFunction;
       this.Tarray = thirdFunction;
    }

    @Override
    public int getCount() {
        return Farray.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(context).inflate(R.layout.container,viewGroup,false);
        TextView pd,date,status;
        ImageView notify;

        pd =v.findViewById(R.id.pd);
        date =v.findViewById(R.id.date);
        status =v.findViewById(R.id.status);
        notify =v.findViewById(R.id.notify);

        pd.setText(Farray.get(i));
        date.setText(Tarray.get(i));
        status.setText(Sarray.get(i));
        notify.setImageResource(R.drawable.notification);

        return v;
    }
}
