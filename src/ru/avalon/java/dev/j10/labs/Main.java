package ru.avalon.java.dev.j10.labs;


import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;


public class Main {
    
    public static void main(String[]args){
        
   
        Person ivanov = null;
        Person smith = null;
        ivanov =new Person ("Иван");
        smith =new Person ("John");

        Passport passportForIvanov = new Passport("Иванов",ivanov.getFirstName(),"Иванович");
        ivanov.setPassport(passportForIvanov);
        System.out.print("\n"+ passportForIvanov + "\n");
        
        Passport passportForSmith = new Passport(smith.getFirstName(),"Edvard","smith","");
        smith.setPassport(passportForSmith);
        System.out.print("\n"+ passportForSmith + "\n");
        
        

        
        String ivanovFullName=ivanov.getFullName();
        String smithFullName=smith.getFullName();
        
        ivanov.setAddress(new Address("Saint-Peterburg","Nevskiy", 123, 5));
        String ivanovAddress=ivanov.getAddress();
        
        smith.setAddress(new Address("Mexico","Francisco Sosa", 5, 2));
        String smithAddress=smith.getAddress();
        
        System.out.println(ivanovFullName +"\n"+ smithFullName+"\n"+ ivanovAddress+"\n"+ smithAddress);
    }
}
