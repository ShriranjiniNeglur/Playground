package com.carmel.bootcamp.shriranjini;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.carmel.bootcamp.shriranjini.InviteDelegates.InviteDelegatesForm;
import com.carmel.bootcamp.shriranjini.InviteDelegates.SearchPeopleForm;
import com.carmel.bootcamp.shriranjini.InviteModels.InvitePeopleModel;
import com.carmel.bootcamp.shriranjini.InviteModels.InvitedList;

import java.util.ArrayList;


public class InvitePeople extends Fragment {

    private View view;
    ImageView addPeople;
    InviteDelegatesForm inviteDelegatesForm;
    private RecyclerView  recyclerView;
    private RecyclerView.Adapter inviteAdapter;
    ImageView DeleteIcon;

    private RecyclerView.LayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_invite_people, container, false);

        addPeople = view.findViewById(R.id.addpeople);

        addPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inviteDelegatesForm != null) {
                    inviteDelegatesForm.onclickAddPeople(inviteDelegatesForm);

                }
            }
        });

        recyclerView=view.findViewById(R.id.InvitePeopleList);
        final ArrayList<InvitedList> invitedLists = new ArrayList<>();


        InvitedList invitedList = new InvitedList();

        invitedList.setPerson_Name("Luke Ray");
        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
        invitedLists.add(invitedList);

        invitedList = new InvitedList();

        invitedList.setPerson_Name("Daisy Lake");
        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
        invitedLists.add(invitedList);

        invitedList = new InvitedList();

        invitedList.setPerson_Name("Mark Smith");
        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
        invitedLists.add(invitedList);

        invitedList = new InvitedList();

        invitedList.setPerson_Name("Mark Smith");
        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
        invitedLists.add(invitedList);

        inviteAdapter = new InviteAdapter(view.getContext(),invitedLists);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(inviteAdapter);


//        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
//            @Override
//            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
//                return false;
//            }
//
//            @Override
//            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
//                // Row is swiped from recycler view
//                // remove it from adapter
//
//            }
//
//            @Override
//            public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
//                // view the background view
//            }
//        };
//
//// attaching the touch helper to recycler view
//        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView( recyclerView);
//


        return view;


    }

    public void setInviteDelegatesForm(InviteDelegatesForm inviteDelegatesForm) {
        this.inviteDelegatesForm = inviteDelegatesForm;
    }


}
