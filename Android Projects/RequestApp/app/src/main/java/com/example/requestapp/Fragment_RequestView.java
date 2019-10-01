package com.example.requestapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.requestapp.model.Request_items;
import com.example.requestapp.model.Request_model;

import java.util.ArrayList;


public class Fragment_RequestView extends Fragment {
    ListView items;
    Request_model request_model;
    TextView Requestno,Requestdate,status;
    private View view;
    ImageView msg_light;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment__request_view, container, false);
        Requestno=view.findViewById(R.id.requestid);
        Requestdate=view.findViewById(R.id.submitdate);
        status=view.findViewById(R.id.status_view);

        Requestno.setText(request_model.getRequestnumber());
        Requestdate.setText(request_model.getDescription());
        status.setText(request_model.getRequestStatus().toString());

        msg_light=view.findViewById(R.id.msg_dark);


        msg_light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(view.getContext(),Inbox_page.class);
                startActivity(intent);
            }
        });

        items = view.findViewById(R.id.items);

        final ArrayList<Request_items> requestview = new ArrayList<>();

        Request_items request_items = new Request_items();

        request_items.setRequestItems("IBM ThinkServer TS150 Tower Server With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5\"(3.3 GHz /Cache 8 MB)... / STD MEMORY 8GB X 1/ MAX. MEMORY 64GB 4 Slots/HARD DRIVE 1 X 1TB SATA 3.5\" 7.2k SATA / STD. HDD BAY/ 3 bay MAX. HDD BAY upto 4 x 3.5\" +1 x 2.5\" bay/ OPTICAL Multi Burner/Integrated RAID 0,1,5,10 (RAID 121i).");
        requestview.add(request_items);

        request_items = new Request_items();

        request_items.setRequestItems("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ STD MEMORY 8GB X 1 MAX. MEMORY 64GB; 4 DIMM Memory Slots/ HARD DRIVE Open Bay/ 2.5” SAS/SATA HS Bays (8 bay MAX. HDD BAY upto 8 x 2.5” bay MAX. HDD BAY upto 16x2.5”)/OPTICAL Multi Burner/ PCIe RAID 0,1,10 (RAID 520i). Supports SAS & SATA drives/Power Supply Standard (Inbuilt) 1 x 450W Power Supply /Max: 2");
        requestview.add(request_items);

        request_items = new Request_items();

        request_items.setRequestItems("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 GHz,10 MB,1066MHz/ 1x 8GB RAM/ 1x500GB SATA HDD/ 3.5Simple-Swap/ MULTI BUTRNER");
        requestview.add(request_items);

        request_items = new Request_items();

        request_items.setRequestItems("IBM Lenovo ThinkServer RD450 Rack Server (PN:70Q90059IH) with 1 x Intel® Xeon® E5-2620v4 (2.1GHz/8C/20MB/85W/2133Mhz)/Max: 2 Processors/ STD MEMORY 16GB X 1 MAX. MEMORY 1 TB ;16 Slots/ HARD DRIVE : Open Bay (2.5” HOT Swap SAS/SATA STD. HDD BAY 8 bay / MAX. HDD BAY 16 bay with optical bay/24 bay without optical bay) / OPTICAL Multi Burner/ Integrated RAID 0,1,10 (RAID 110i). Supports only SATA drive/ Power Supply Standard (Inbuilt) 1 x 750W Power Supply Max: 2");
        requestview.add(request_items);

        request_items = new Request_items();

        request_items.setRequestItems("daptec 128 MB Raid Controller Pair. Pci-e SAS/SATA");
        requestview.add(request_items);

        ListAdapter itemadapter = new ItemAdapter(view.getContext(), requestview);
        items.setAdapter(itemadapter);

        return view;

    }
    public void setDatafetching(Request_model request_model){
        this.request_model=request_model;
    }

}
