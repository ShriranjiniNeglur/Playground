package com.carmel.bootcamp.shriranjini;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.carmel.bootcamp.shriranjini.InviteDelegates.InviteDelegatesForm;
import com.carmel.bootcamp.shriranjini.InviteDelegates.SearchPeopleForm;
import com.carmel.bootcamp.shriranjini.InviteDelegates.SelectPeopleForm;


public class SelectPeople extends Fragment {
private View view;
InviteDelegatesForm  inviteDelegatesForm;
ImageView SearchIcon;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_select_people, container, false);
//        SearchIcon=view.findViewById(R.id.SearchIcon);
//        SearchIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (inviteDelegatesForm!=null){
//                    inviteDelegatesForm.onclickSearchicon(inviteDelegatesForm);
//                }
//            }
//        });


        return view;
    }
// public  void setSearchPeopleForm(InviteDelegatesForm inviteDelegatesForm){
//        this.inviteDelegatesForm=inviteDelegatesForm;
// }
}
