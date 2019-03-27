package ru.avalon.java.dev.j10.labs.models;

import  ru.avalon.java.dev.j10.labs.commons.Address ;

public class Person {

        private Passport passport;
        private Address address;

    public Person (Passport passport, Address address) {
        this.address = address;
        this.passport = passport;
    }

    
    
    public String getFullName() {
        //  Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя,
        //  Фамилию и Отчество, разделённые пробелом.
        if (passport.getName() != null && passport.getSurname() != null && 
                passport.getPatronymic() != null)return passport.getName() + " " 
                + passport.getSurname() + " " + passport.getPatronymic();
        //  Если у человека нет Отчества, но есть второе имя, то возвращает
        // Имя, Первую букву второго имени, и Фамилию, разделённые пробелом. 
        //   После Инициала второго имени должна стоять точка.
        
        if (passport.getPatronymic() == null && passport.getSecondName() != null)

            return passport.getName() + "  " + passport.getSecondName()
            + ".  " + passport.getSurname();

        //  Если у человека нет ни Отчества ни Второго имени, а есть только Имя и Фамилия, 
        // то возвращает их, разделённые пробелом.
        if (passport.getPatronymic() == null && passport.getSecondName() 
            == null && passport.getName() != null && passport.getSurname() != null)

            return passport.getName() + " " + passport.getSurname();
        
        
        return null;
    }
   
    public String getAddress() {
        
        return address.getCountry() + " " + address.getPostcode()  +
               ((address.getOblast()== null) ? " " : address.getOblast() + " ")
               + ((address.getDistrict()==null) ? " ":address.getDistrict() + " ")
               + address.getCity() + " " + address.getStreet() + " " +
               address.getHouse() + "  " + address.getBlock() + " " + address.getAapartment();

    }
}