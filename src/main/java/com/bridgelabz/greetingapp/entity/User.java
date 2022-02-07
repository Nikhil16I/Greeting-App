package com.bridgelabz.greetingapp.entity;

public class User {
    private  String firstName;
    private  String lastName;

    public User(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {

    }
    //Tostring
    @Override
    public String toString() {
        String str = (firstName != null) ? firstName + " " : "";
        str += (lastName != null) ? lastName : "";
        return str.trim();
    }
//Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
//Getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

