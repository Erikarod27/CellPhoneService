package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
         serialNumber = 0;
         String model = "";
         String carrier ="";
         String phoneNumber ="";
         String owner = "";
    }

    //setter for serial number
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    //getter for serial number
    public int getSerialNumber() {
        return serialNumber;
    }

    //setter for model
    public void setModel(String model) {
        this.model = model;
    }
    //getter for model
    public String getModel() {
        return model;
    }

    //setter for carrier
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    //getter for carrier
    public String getCarrier() {
        return carrier;
    }

    //setter for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setter for owner
    public void setOwner(String owner) {
        this.owner = owner;
    }

    //getter for owner
    public String getOwner() {
        return owner;
    }

    public void dial(String calling) {
        System.out.println(this.owner +"'s phone is calling " + calling);
    }

}
