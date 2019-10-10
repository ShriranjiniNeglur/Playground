package com.carmel.bootcamp.shriranjini;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.carmel.bootcamp.shriranjini.InviteModels.InvitePeopleModel;

import java.util.ArrayList;

class RecyclerAdapter extends RecyclerView.Adapter {
    private Context context;
    ArrayList<InvitePeopleModel> invitePeopleModel;
    public RecyclerAdapter(Context context, ArrayList<InvitePeopleModel> inviteList) {
        this.context=context;
        this.invitePeopleModel=inviteList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from(context).inflate(R.layout.invitepeoplelist,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view1);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RecyclerAdapter.MyViewHolder myViewHolder = (RecyclerAdapter.MyViewHolder)holder;
        InvitePeopleModel invitePeopleModel = this.invitePeopleModel.get(position);
        myViewHolder.setUpData(invitePeopleModel);

    }

    @Override
    public int getItemCount() {
        return invitePeopleModel.size();
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView PersonName,PersonDetail;
        public ImageView AddIcon,PersonProfile,minusicon;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            PersonName =itemView.findViewById(R.id.InviteName);
            PersonDetail=itemView.findViewById(R.id.InviteDetail);
            PersonProfile=itemView.findViewById(R.id.InviteProfile);
            AddIcon=itemView.findViewById(R.id.DeleteIcon);
            AddIcon.setTag(1);

            minusicon=itemView.findViewById(R.id.DeleteIcon);

            AddIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer integer = (Integer) AddIcon.getTag();
                    switch (integer){
                        case 1 :
                            AddIcon.setImageResource(R.drawable.minusicon);
                            AddIcon.setTag(0);
                            break;
                        case 0 :
                            AddIcon.setImageResource(R.drawable.plusicon);
                            AddIcon.setTag(1);
                            break;
                    }
                }
            });


        }

        public void setUpData(InvitePeopleModel invitePeopleModel) {
            PersonName.setText(String.valueOf(invitePeopleModel.getInvitePeopleName()));
            PersonDetail.setText(String.valueOf(invitePeopleModel.getInvitePeopleDetails()));
        }

    }
}
