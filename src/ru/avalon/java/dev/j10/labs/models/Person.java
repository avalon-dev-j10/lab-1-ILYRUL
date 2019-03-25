package ru.avalon.java.dev.j10.labs.models;


public class Person {

        private Passport passport;
        private Address address;

    public Person (Passport passport, Address address) {
        this.address = address;
        this.passport = passport;
    }
  
    
    public String getFullName() {
    return passport.getFullName();
    }
   
    public String getAddress() {
    return address.getFullAdress();
    }
}