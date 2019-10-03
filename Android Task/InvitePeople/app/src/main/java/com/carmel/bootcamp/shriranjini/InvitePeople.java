package com.carmel.bootcamp.shriranjini;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.carmel.bootcamp.shriranjini.InviteDelegates.InviteDelegatesForm;


public class InvitePeople extends Fragment {

private View view;
ImageView addPeople;
InviteDelegatesForm inviteDelegatesForm;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_invite_people, container, false);

        addPeople=view.findViewById(R.id.addpeople);

        addPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inviteDelegatesForm!=null){
                    inviteDelegatesForm.onclickAddPeople(inviteDelegatesForm);

                }
            }
        });
       return view;



    }

 public void setInviteDelegatesForm(InviteDelegatesForm inviteDelegatesForm){
        this.inviteDelegatesForm=inviteDelegatesForm;
 }
}
