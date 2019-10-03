package com.carmel.bootcamp.shriranjini;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.carmel.bootcamp.shriranjini.InviteDelegates.SelectPeopleForm;


public class AddPeople extends Fragment {
private View view;
ImageView SelectPeople;
SelectPeopleForm selectPeopleForm;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_add_people, container, false);
        SelectPeople=view.findViewById(R.id.SelectPeople);

        SelectPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectPeopleForm!=null){
                    selectPeopleForm.onclickPulseIcon(selectPeopleForm);
                }
            }
        });

        return view;
    }
public void setSelectPeopleForm(SelectPeopleForm selectPeopleForm){
        this.selectPeopleForm=selectPeopleForm;
}
}
