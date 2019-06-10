package com.example.weekend1hw;

public class Person {
   /* public String getFirstName();

    public String lastName();

    public String Address();

    public String City();

    public String State();

    public String Zip();*/
    //declaring variables used
    private String firstName;
    private String lastName;
    private String Address;
    private String City;
    private String State;
    private String Zip;






    public Person(String fName, String lName, String address, String city, String state, String zip) { // constructor
        this.firstName = fName;
        this.lastName = lName;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.Zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }
}