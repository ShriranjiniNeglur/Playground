package com.example.requestlist.model;

import com.example.requestlist.global.RequestStatus;

public class RequestModel {
    String Requestnumber;
    RequestStatus requestStatus;
    String Description;

    public String getRequestnumber() {
        return Requestnumber;
    }

    public void setRequestnumber(String requestnumber) {
        Requestnumber = requestnumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
