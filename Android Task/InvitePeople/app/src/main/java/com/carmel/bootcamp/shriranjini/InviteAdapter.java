package com.carmel.bootcamp.shriranjini;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.carmel.bootcamp.shriranjini.InviteModels.InvitePeopleModel;
import com.carmel.bootcamp.shriranjini.InviteModels.InvitedList;

import java.util.ArrayList;
import java.util.HashMap;

import static androidx.constraintlayout.widget.Constraints.TAG;

class InviteAdapter extends RecyclerView.Adapter {
    ImageView DeleteIcon;
    private Context context;
    ArrayList<InvitedList> invitedList;

    public InviteAdapter(Context context, ArrayList<InvitedList> invitedLists) {
        this.context=context;
        this.invitedList=invitedLists;

    }

//    public InviteAdapter(ArrayList<InvitedList> invitedLists) {
//        this.invitedList=invitedLists;
//
//
//    }

    @NonNull
    @Override
    public InviteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inviteview = LayoutInflater.from(context).inflate(R.layout.invitedlist,parent,false);
        InviteViewHolder inviteViewHolder = new InviteViewHolder(inviteview);
        return inviteViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        InviteAdapter.InviteViewHolder inviteViewHolder = (InviteAdapter.InviteViewHolder)holder;
        InvitedList invitedList = this.invitedList.get(position);
        inviteViewHolder.setUpData(invitedList);

    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount:  " +invitedList.size());
        return invitedList.size();
    }
    private class InviteViewHolder extends RecyclerView.ViewHolder {
        public TextView PersonName,PersonDetail;
        public ImageView AddIcon,PersonProfile,minusicon;
        public InviteViewHolder(@NonNull View itemView) {
            super(itemView);

            PersonName =itemView.findViewById(R.id.InviteName);
            PersonDetail=itemView.findViewById(R.id.InviteDetail);
            PersonProfile=itemView.findViewById(R.id.InviteProfile);
            AddIcon=itemView.findViewById(R.id.DeleteIcon);
        }

        public void setUpData(final InvitedList invitedList) {
            PersonName.setText(String.valueOf(invitedList.getPerson_Name()));
            PersonDetail.setText(String.valueOf(invitedList.getPerson_Detail()));
            AddIcon.setImageResource(R.drawable.deleteicon);
            AddIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete(getAdapterPosition());
                }
            });
        }
        public void delete(int position) {

            invitedList.remove(position);
            notifyItemRemoved(position);

        }
    }

}

