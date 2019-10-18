package com.carmel.bootcamp.shriranjini;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.carmel.bootcamp.shriranjini.InviteDelegates.InviteDelegatesForm;
import com.carmel.bootcamp.shriranjini.InviteModels.InvitedList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;


public class InvitePeople extends Fragment {

    private View view;
    ImageView addPeople;
    InviteDelegatesForm inviteDelegatesForm;
    RecyclerView  recyclerView;
    InviteAdapter inviteAdapter;
     ArrayList<InvitedList> invitedLists;
//    ArrayList<String> peoplelist = new ArrayList<>();

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
        invitedLists = new ArrayList<>();
        getjson();


//        try {
//            JSONObject obj = new JSONObject(loadJSONFromAsset());
//            JSONArray mjarray = obj.getJSONArray("people");
//            ArrayList<HashMap<String ,String>> fromlist = new ArrayList<HashMap<String, String>>();
//            HashMap<String,String> mlist;
//             for (int i =0;i<mjarray.length();i++){
//                 JSONObject joinside = mjarray.getJSONObject(i);
//                 Log.d("Details-->", joinside.getString("people"));
//                 String formula_value = joinside.getString("people");
//                 String url_value = joinside.getString("url");
//
//                 mlist = new HashMap<String, String>();
//                 mlist.put("formule", formula_value);
//                 mlist.put("url", url_value);
//
//                 fromlist.add(mlist);
//             }
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        inviteAdapter = new InviteAdapter(invitedLists);
//        recyclerView.setAdapter(inviteAdapter);
//
//        recyclerViewstart();
//        loadJSONFromAsset();
//

//        final ArrayList<InvitedList> invitedLists = new ArrayList<>();
//
//
//        InvitedList invitedList = new InvitedList();
//
//        invitedList.setPerson_Name("Luke Ray");
//        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
//        invitedLists.add(invitedList);
//
//        invitedList = new InvitedList();
//
//        invitedList.setPerson_Name("Daisy Lake");
//        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
//        invitedLists.add(invitedList);
//
//        invitedList = new InvitedList();
//
//        invitedList.setPerson_Name("Mark Smith");
//        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
//        invitedLists.add(invitedList);
//
//        invitedList = new InvitedList();
//
//        invitedList.setPerson_Name("Mark Smith");
//        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
//        invitedLists.add(invitedList);
//
//        invitedList = new InvitedList();
//
//        invitedList.setPerson_Name("Daisy Lake");
//        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
//        invitedLists.add(invitedList);
//
//        invitedList = new InvitedList();
//
//        invitedList.setPerson_Name("Daisy Lake");
//        invitedList.setPerson_Detail("Lorem ipsum doler sit amet.");
//        invitedLists.add(invitedList);
        recyclerView=view.findViewById(R.id.InvitePeopleList);
        inviteAdapter = new InviteAdapter(view.getContext(),invitedLists);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(inviteAdapter);

//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
        return view;


    }

//    private void recyclerViewstart() {
//        recyclerView=view.findViewById(R.id.InvitePeopleList);
//        recyclerView.setHasFixedSize(true);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());
//        recyclerView.setLayoutManager(layoutManager);
//
//
//
//
//    }
//
//    private String loadJSONFromAsset() {
//           String json = null;
//           try {
//               InputStream is = getActivity().getAssets().open("people.json");
//               int size = is.available();
//               byte[]buffer = new  byte[size];
//               is.read(buffer);
//               is.close();
//               json =new String(buffer,"UTF-8");
//           } catch (IOException e) {
//               e.printStackTrace();
//           }
//     return json;
//    }

    public void setInviteDelegatesForm(InviteDelegatesForm inviteDelegatesForm) {
        this.inviteDelegatesForm = inviteDelegatesForm;
    }
    public  void getjson(){
        String json;
        try {
            InputStream is = getActivity().getAssets().open("people.json");
//            Toast.makeText(view.getContext(),"Json file",Toast.LENGTH_LONG).show();

            int size = is.available();
            byte[]buffer = new byte[size];
            is.read(buffer);
            is.close();


            json = new String(buffer,"UTF-8");
            JSONArray jsonArray = new JSONArray(json);

            for (int i=0;i<jsonArray.length();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                String PeopleNames = obj.optString("name");
                String PeopleDetails = obj.optString("description");

                invitedLists.add(new InvitedList(PeopleNames,PeopleDetails));


            }
//            Toast.makeText(view.getContext(),peoplelist.toString(),Toast.LENGTH_LONG).show();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }






//    public void setInvitedLists(ArrayList<InvitedList> invitedLists) {
//        this.invitedLists = invitedLists;
//    }
}
