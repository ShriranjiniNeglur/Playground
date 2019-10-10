package com.carmel.bootcamp.shriranjini.InviteModels;

import java.io.Serializable;

public class InvitedList implements Serializable {
    String Person_Name;
    String Person_Detail;

    public String getPerson_Name() {
        return Person_Name;
    }

    public void setPerson_Name(String person_Name) {
        Person_Name = person_Name;
    }

    public String getPerson_Detail() {
        return Person_Detail;
    }

    public void setPerson_Detail(String person_Detail) {
        Person_Detail = person_Detail;
    }
}
