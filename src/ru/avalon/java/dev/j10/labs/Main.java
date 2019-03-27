package ru.avalon.java.dev.j10.labs;


import java.time.LocalDate;

import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;


public class Main {
    
    public static void main(String[]args){
        
        Person ivanov = null;
        Person smith = null;
               
    
        
         ivanov = new Person ( new Passport("4000", 554433,"Иван", "Иванов","Иванович",null,
        LocalDate.of (1950,05,20), LocalDate.of(2018, 03, 10), "О/М"),
                 new Address(195280,"Россия" ,null,null, "Санкт-Петербург","Невский",32,1,345));
        


        smith = new Person ( new Passport("54", 45644654,null,"John", "Smith","Edvard",
        LocalDate.of (1950,05,20), LocalDate.of(2018, 03, 10), "polis"),
                new Address( 945899,"USA" , null,null, "Washington","Constitution",50,0,10));
        
      
        
        
        

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