package com.carmel.bootcamp.shriranjini.InviteModels;

import java.io.Serializable;

public class InvitePeopleModel implements Serializable {
    String InvitePeopleName;
    String InvitePeopleDetails;

    public String getInvitePeopleName() {
        return InvitePeopleName;
    }

    public void setInvitePeopleName(String invitePeopleName) {
        InvitePeopleName = invitePeopleName;
    }

    public String getInvitePeopleDetails() {
        return InvitePeopleDetails;
    }

    public void setInvitePeopleDetails(String invitePeopleDetails) {
        InvitePeopleDetails = invitePeopleDetails;
    }
}
