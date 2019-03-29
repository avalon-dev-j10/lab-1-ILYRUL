package ru.avalon.java.dev.j10.labs.models;

import  ru.avalon.java.dev.j10.labs.commons.Address ;

public class Person {

        private Passport passport;
        private Address address;

    public Person (Passport passport, Address address) {
        this.address = address;
        this.passport = passport;
    }

    public Passport getPassport(){
        return passport;
    }
    public Address geAddress(){
        return address;
    }
    
    public String getFullName() {
        //  Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя,
        //  Фамилию и Отчество, разделённые пробелом.
        if (passport.getName() != null && passport.getSurname() != null && 
                passport.getPatronymic() != null){
            return passport.getName() + " " 
                + passport.getSurname() + " " + passport.getPatronymic();
        }
        
        //  Если у человека нет Отчества, но есть второе имя, то возвращает
        // Имя, Первую букву второго имени, и Фамилию, разделённые пробелом. 
        //   После Инициала второго имени должна стоять точка.
        
         else if (passport.getPatronymic() == null && passport.getSecondName() != null){
            return passport.getName() + "  " + passport.getSecondName().charAt(0)+ "." 
                    +"" + passport.getSurname() ;
         }
         
        //  Если у человека Отчество и второе имя невозможно, 
        
        else if (passport.getPatronymic() != null && passport.getSecondName() 
            != null){ 

            return "Отчество и второе имя невозможно";
        }
        // если нет отчества и второго имени
        else {
        
        return passport.getName() + " " + passport.getSurname();
        }
        /*  TODO (Замечания№2 ЛР№1)
            - Вариант, когда у человека есть Второе имя, но нет Отчества не корректно
            работает!. Исправить!!! Возникли вопросы??? Где ошибка???
            - Есть вероятность, что ни одно из условий не выполниться и метод вернет null!
            Исправить! Исправил
        */
    }
   
    public String getAddress() {
        
        return address.getCountry() + " " + address.getPostcode()  +
               ((address.getOblast()== null) ? " " : address.getOblast() + " ")
               + ((address.getDistrict()==null) ? " ":address.getDistrict() + " ")
               + address.getCity() + " " + address.getStreet() + " " +
               address.getHouse() + "  " + address.getBlock() + " " + address.getAapartment();

        /*  TODO (Замечания№2 ЛР№1)
            - При выводе адреса в нем не должно быть значений null. Исправить!!! Исправил
        */
    }
}