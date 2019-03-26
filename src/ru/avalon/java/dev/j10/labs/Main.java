package ru.avalon.java.dev.j10.labs;


import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;


/*  TODO (Проверка №1)
    Ошибка при выполнении!
    Перед отправкой ЛР не проверялась!
*/

public class Main {
    
    public static void main(String[]args){
        
   
        Passport passportIvanov = new Passport("Иван", "Иванов");
        passportIvanov.setPatronymic("Иванович");
        Passport passportSmith = new Passport("John", "Smith");
        passportSmith.setSecondName("Edvard");
        
        /*  TODO (Проверка №1)
            Все данные в класс Passport должны сразу задаваться, при создании 
            экземпляра класса, set применяется для изменения значения, а не для
            его инициализации.
        */

       Address addressIvanov = new Address(196411, "Россия", "Санкт-Петербург", "Невский", 32);
       Address addressSmith = new Address(945899, "USA", "Washington", "Constitution", 17);

        Person ivanov = new Person(passportIvanov, addressIvanov);
        Person smith = new Person(passportSmith, addressSmith);

        String fullNameIvanov = ivanov.getFullName();
        String fullNameSmith = smith.getFullName();

        String adressIvanov = ivanov.getAddress();
        String adressSmith = smith.getAddress();
        
        System.out.println(fullNameIvanov);
        System.out.println(fullNameSmith);
        System.out.println(adressIvanov);
        System.out.println(adressSmith);
        
    }
}