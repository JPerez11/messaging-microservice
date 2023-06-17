package com.pragma.powerup.messaging.domain.models;

public class TwilioModel {

    private String status;
    private String phoneNumber;

    public TwilioModel() {}

    public TwilioModel(String status, String phoneNumber) {
        this.status = status;
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
