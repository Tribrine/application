package com.tribrine.practice;

public class User {

    private final Address address;

    public User() {
        address = new Address();
    }

    public void getAddress() {
        address.getAddress();
    }
}

class Address {

    public void getAddress() {

    }
}