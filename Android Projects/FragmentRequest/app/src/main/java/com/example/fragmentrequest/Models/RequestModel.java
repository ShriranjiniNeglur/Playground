package com.example.fragmentrequest.Models;

import com.example.fragmentrequest.Global.RequestStatus;

import java.io.Serializable;

public class RequestModel implements Serializable {
    String RequestNumber;
    RequestStatus requestStatus;
    String RequestDate;

    public String getRequestNumber() {
        return RequestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        RequestNumber = requestNumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(String requestDate) {
        RequestDate = requestDate;
    }
}
