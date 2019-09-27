package com.example.pagesorientation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.pagesorientation.Delegates.Delegates_form;
import com.example.pagesorientation.models.RequestModel;

public class MainActivity extends AppCompatActivity implements Delegates_form {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Fragment_List myfragment=new Fragment_List();
       myfragment.setDelegates_form(this);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment,myfragment);
        ft.commit();
    }



    @Override
    public void onclickRequestItem(RequestModel requestModel) {
            int orientation = this.getResources().getConfiguration().orientation;
            if (orientation== Configuration.ORIENTATION_PORTRAIT){
        Fragment_Form myfragment =  new Fragment_Form();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment,myfragment);
        ft.addToBackStack(null);
        ft.commit();

   }
            else {
                Fragment_Form myfragment =  new Fragment_Form();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1,myfragment);
                ft.addToBackStack(null);
                ft.commit();
            }

            }
}
