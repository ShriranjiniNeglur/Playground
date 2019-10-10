package com.carmel.bootcamp.shriranjini;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.carmel.bootcamp.shriranjini.InviteDelegates.FoundPeopleForm;
import com.carmel.bootcamp.shriranjini.InviteDelegates.InviteDelegatesForm;
import com.carmel.bootcamp.shriranjini.InviteDelegates.SearchPeopleForm;
import com.carmel.bootcamp.shriranjini.InviteDelegates.SelectPeopleForm;

public class MainActivity extends AppCompatActivity implements InviteDelegatesForm {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InvitePeople invitePeople = new InvitePeople();
        invitePeople.setInviteDelegatesForm(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.DrawLayoutView,invitePeople);
        fragmentTransaction.commit();
    }


    @Override
    public void onclickAddPeople(InviteDelegatesForm inviteDelegatesForm) {
       AddPeople addPeople=new AddPeople();
       FragmentManager fragmentManager= getSupportFragmentManager();
        addPeople.setSelectPeopleForm(this);
        addPeople.setCancelText(this);
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
       fragmentTransaction.replace(R.id.DrawLayoutView,addPeople);
       fragmentTransaction.addToBackStack(null);
       fragmentTransaction.commit();
    }

    @Override
    public void onclickPulseIcon(InviteDelegatesForm inviteDelegatesForm) {
        AddPeople addPeople=new AddPeople();
        FragmentManager fragmentManager= getSupportFragmentManager();
        addPeople.setSelectPeopleForm(this);
        addPeople.setCancelText(this);
        addPeople.setSearchPeopleForm(this);
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.DrawLayoutView,addPeople);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    @Override
    public void onclickCancelText(InviteDelegatesForm inviteDelegatesForm) {
        InvitePeople invitePeople=new InvitePeople();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.DrawLayoutView,invitePeople);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    @Override
    public void onclickSearchicon(InviteDelegatesForm inviteDelegatesForm) {
        SearchPeople searchPeople=new SearchPeople();
        searchPeople.setFoundPeopleForm(this);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.DrawLayoutView,searchPeople);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    @Override
    public void onClicktoFindPeople(InviteDelegatesForm inviteDelegatesForm) {
        FoundPeople foundPeople=new FoundPeople();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.DrawLayoutView,foundPeople);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

//    @Override
//    public void onclickCancelText(SelectPeopleForm selectPeopleForm) {
//        InvitePeople invitePeople=new InvitePeople();
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.DrawLayoutView,invitePeople);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//
//    }
//    @Override
//    public void onclickPulseIcon(SelectPeopleForm selectPeopleForm) {
//        SelectPeople selectPeople=new SelectPeople();
//        selectPeople.setSearchPeopleForm(this);
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.DrawLayoutView,selectPeople);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }

//    @Override
//    public void onclickSearchicon(SelectPeopleForm selectPeopleForm) {
//        SearchPeople searchPeople=new SearchPeople();
//        searchPeople.setFoundPeopleForm(this);
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.DrawLayoutView,searchPeople);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//
//    }


//    @Override
//    public void onClicktoFindPeople(FoundPeopleForm foundPeopleForm) {
//        FoundPeople foundPeople=new FoundPeople();
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.DrawLayoutView,foundPeople);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }
}
