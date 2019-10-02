package com.example.fragmentrequest.Models;

import java.io.Serializable;

public class Items_List implements Serializable {
    String RequestItems;

    public String getRequestItems() {
        return RequestItems;
    }

    public void setRequestItems(String requestItems) {
        RequestItems = requestItems;
    }
}
