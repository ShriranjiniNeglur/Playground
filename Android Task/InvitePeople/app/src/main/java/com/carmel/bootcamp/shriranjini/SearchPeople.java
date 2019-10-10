package com.carmel.bootcamp.shriranjini;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.carmel.bootcamp.shriranjini.InviteDelegates.FoundPeopleForm;
import com.carmel.bootcamp.shriranjini.InviteDelegates.InviteDelegatesForm;


public class SearchPeople extends Fragment {
    private View view;
    InviteDelegatesForm inviteDelegatesForm;
    ImageView findicon;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_search_people, container, false);

       findicon=view.findViewById(R.id.findicon);
       findicon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (inviteDelegatesForm!=null){
                   inviteDelegatesForm.onClicktoFindPeople(inviteDelegatesForm);
               }
           }
       });

        return view;
    }
   public void setFoundPeopleForm(InviteDelegatesForm inviteDelegatesForm){
        this.inviteDelegatesForm=inviteDelegatesForm;
   }
}
