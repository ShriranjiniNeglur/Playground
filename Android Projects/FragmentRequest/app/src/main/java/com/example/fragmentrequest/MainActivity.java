package com.example.fragmentrequest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.fragmentrequest.Models.RequestModel;
import com.example.fragmentrequest.Request_Delegates.Delegate_Form;

public class MainActivity extends AppCompatActivity implements Delegate_Form {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment_Product_list fragment_product_list= new Fragment_Product_list();
        fragment_product_list.setDelegate_form(this);
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.Fragment_Layout,fragment_product_list);
        ft.addToBackStack(null);
        ft.commit();
    }


    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Fragment_RequestView myfragment =  new Fragment_RequestView();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.Fragment_Handling,myfragment);
            ft.addToBackStack(null);
            ft.commit();
        }
        else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Fragment_RequestView myfragment =  new Fragment_RequestView();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.Fragment_Layout,myfragment);
            ft.addToBackStack(null);
            ft.commit();
        }
    }

    @Override
    public void onclickDelegate_Form(RequestModel requestModel) {
        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation== Configuration.ORIENTATION_PORTRAIT){
            Fragment_RequestView myfragment =  new Fragment_RequestView();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.Fragment_Layout,myfragment);
            ft.addToBackStack(null);
            ft.commit();
            myfragment.setDatafetching(requestModel);
        }
        else if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            Fragment_RequestView myfragment =  new Fragment_RequestView();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.Fragment_Handling,myfragment);
            ft.addToBackStack(null);
            ft.commit();
            myfragment.setDatafetching(requestModel);

        }

    }
}
