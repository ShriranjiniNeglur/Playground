package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ListPopupWindow;



public class BurgerMenu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
        ListPopupWindow listPopupWindow;
        TextView options;
        ImageView filter_icon;
        ListView box;
        Button newBtn;
        @Override
            protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_burger_menu);

            newBtn=findViewById(R.id.newBtn);
            newBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   Intent intent=new Intent(getApplicationContext(),RecycleView.class);
                   startActivity(intent);
               }
          });

            filter_icon = findViewById(R.id.filter_icon);
            listPopupWindow = new android.widget.ListPopupWindow(getApplicationContext());
            options = findViewById(R.id.options);

            String[] items = {"Clear", "Approved", "Awaiting", "Draft", "Rejected"};

            listPopupWindow.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.list_item, items));
            listPopupWindow.setAnchorView(filter_icon);
            listPopupWindow.setModal(true);

            filter_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listPopupWindow.show();
                }
            });


            box = findViewById(R.id.box);
            String title[] = {"PUR-056-2019", "PUR-056-2019", "PUR-056-2019", "PUR-056-2019"};
            String date[] = {"06-JUL-2019", "06-JUL-2019", "06-JUL-2019", "06-JUL-2019"};
            String status[] = {"Awaiting", "approved", "Draft", "Rejected"};

            ListAdapter listAdapter = new MyListAdapter(getApplicationContext(), title, date, status);
            box.setAdapter(listAdapter);


            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            FloatingActionButton fab = findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            NavigationView navigationView = findViewById(R.id.nav_view);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();
            navigationView.setNavigationItemSelectedListener(this);

        }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.burger_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
