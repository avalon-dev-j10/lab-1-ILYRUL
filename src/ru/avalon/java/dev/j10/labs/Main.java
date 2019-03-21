package ru.avalon.java.dev.j10.labs;


import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
public class Main {
    pablic static void main(String[]args){
        
   
        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

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
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        String ivanovFullName=ivanov.getFullName();
        String smithFullName=smith.getFullName();
        
        ivanov.setAddress(new Address("Saint-Peterburg","Nevskiy", 123, 5));
        String ivanovAddress=ivanov.getAddress();
        
        smith.setAddress(new Address("Mexico","Francisco Sosa", 5, 2));
        String smithAddress=smith.getAddress();
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        System.out.printIn(ivanovFullName +"\n"+ smithFullName+"\n"+ ivanovAddress+"\n"+ smithAddres);
    }
}
