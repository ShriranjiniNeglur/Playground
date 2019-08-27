package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerListAdapter extends RecyclerView.Adapter<MyRecyclerListAdapter.MyViewHolder> {
    String titles[]={},dates[]={},status[]={};
    private Context context;

    public MyRecyclerListAdapter(Context context, String[] title, String[] date, String[] status) {
        this.context=context;
        this.titles=title;
        this.dates=date;
        this.status=status;
    }
    @NonNull
    @Override
    public MyRecyclerListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyRecyclerListAdapter.MyViewHolder myViewHolder = (MyRecyclerListAdapter.MyViewHolder) holder;
        myViewHolder.setUpData(String.valueOf(titles[position]),String.valueOf(dates[position]),String.valueOf(status[position]));
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,date,statusText;
        public ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            date=itemView.findViewById(R.id.date);
            statusText=itemView.findViewById(R.id.status);
            imageView=itemView.findViewById(R.id.viewkb);
        }
        public void setUpData(String titles,String dates, String status){
            title.setText(titles);
            date.setText(dates);
            statusText.setText(status);
            imageView.setImageResource(R.drawable.cancel);
        }
    }
}
