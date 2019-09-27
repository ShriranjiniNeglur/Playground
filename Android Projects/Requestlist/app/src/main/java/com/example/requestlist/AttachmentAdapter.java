package com.example.requestlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.requestlist.model.Attchament_model;

import java.util.ArrayList;

class AttachmentAdapter extends BaseAdapter {
    private Context context;
    ArrayList<Attchament_model> attchament_model;
    public AttachmentAdapter(Context context, ArrayList<Attchament_model> attchamentlist) {
        this.context=context;
        this.attchament_model=attchamentlist;
    }


    @Override
    public int getCount() {
        return attchament_model.size();
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
        View attachview = LayoutInflater.from(context).inflate(R.layout.attachment_list,viewGroup,false);
        TextView attchment_detail;

        attchment_detail=attachview.findViewById(R.id.attchment_detail);

        Attchament_model attchament_model = this.attchament_model.get(position);
        attchment_detail.setText(String.valueOf(attchament_model.getAttchamentItems()));
        return null;
    }
}
