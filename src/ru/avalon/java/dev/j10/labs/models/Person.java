package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/*  TODO (Проверка №1)
    Ошибка в классе, найти и сиправить! 
*/
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
    
    /*  TODO (Проверка №1)
        Реализовать в данном классе два метода getFullName() и getAddress()
        через объекты passport и address.
        Добавить коментарии к полям и методам класса
    */
}