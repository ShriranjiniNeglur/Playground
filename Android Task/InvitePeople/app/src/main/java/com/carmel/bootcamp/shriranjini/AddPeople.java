package com.carmel.bootcamp.shriranjini;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.carmel.bootcamp.shriranjini.InviteDelegates.InviteDelegatesForm;
import com.carmel.bootcamp.shriranjini.InviteDelegates.SelectPeopleForm;
import com.carmel.bootcamp.shriranjini.InviteModels.InvitePeopleModel;

import java.util.ArrayList;


public class AddPeople extends Fragment {
private View view;
ImageView SelectPeople;
InviteDelegatesForm inviteDelegatesForm;
    TextView CancelText;
    private RecyclerView recyclerViewList;
    private RecyclerView.Adapter recyclerAdapter;
    ImageView SearchIcon;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_add_people, container, false);
        SelectPeople=view.findViewById(R.id.SelectPeople);

        SearchIcon=view.findViewById(R.id.SearchIcon);
        SearchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inviteDelegatesForm!=null){
                    inviteDelegatesForm.onclickSearchicon(inviteDelegatesForm);
                }
            }
        });

//        SelectPeople.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (inviteDelegatesForm!=null){
//                    inviteDelegatesForm.onclickPulseIcon(inviteDelegatesForm);
//                }
//            }
//        });

//        CancelText=view.findViewById(R.id.CancelText);
//
//        CancelText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (inviteDelegatesForm!=null){
//                    inviteDelegatesForm.onclickCancelText(inviteDelegatesForm);
//                }
//            }
//        });

        recyclerViewList=view.findViewById(R.id.recyclerView);
        final ArrayList<InvitePeopleModel> InviteList = new ArrayList<>();


        InvitePeopleModel invitePeopleModel = new InvitePeopleModel();

        invitePeopleModel.setInvitePeopleName("Luke Ray");
        invitePeopleModel.setInvitePeopleDetails("Lorem ipsum doler sit amet.");
        InviteList.add(invitePeopleModel);

        invitePeopleModel = new InvitePeopleModel();

        invitePeopleModel.setInvitePeopleName("Daisy Lake");
        invitePeopleModel.setInvitePeopleDetails("Lorem ipsum doler sit amet.");
        InviteList.add(invitePeopleModel);

        invitePeopleModel = new InvitePeopleModel();

        invitePeopleModel.setInvitePeopleName("Mark Smith");
        invitePeopleModel.setInvitePeopleDetails("Lorem ipsum doler sit amet.");
        InviteList.add(invitePeopleModel);

        invitePeopleModel = new InvitePeopleModel();

        invitePeopleModel.setInvitePeopleName("Mark Smith");
        invitePeopleModel.setInvitePeopleDetails("Lorem ipsum doler sit amet.");
        InviteList.add(invitePeopleModel);

        invitePeopleModel = new InvitePeopleModel();

        invitePeopleModel.setInvitePeopleName("Mark Smith");
        invitePeopleModel.setInvitePeopleDetails("Lorem ipsum doler sit amet.");
        InviteList.add(invitePeopleModel);




        recyclerAdapter= new RecyclerAdapter(view.getContext(),InviteList);
        recyclerViewList.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerViewList.setItemAnimator(new DefaultItemAnimator());
        recyclerViewList.setAdapter(recyclerAdapter);

        return view;
    }
public void setSelectPeopleForm(InviteDelegatesForm inviteDelegatesForm){
        this.inviteDelegatesForm=inviteDelegatesForm;
}
public void setCancelText(InviteDelegatesForm inviteDelegatesForm){
        this.inviteDelegatesForm=inviteDelegatesForm;
}
public  void setSearchPeopleForm(InviteDelegatesForm inviteDelegatesForm){
        this.inviteDelegatesForm=inviteDelegatesForm;
    }



}
