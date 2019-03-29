package ru.avalon.java.dev.j10.labs.models;



import java.time.LocalDate;


   public class Passport {

    private String serial;//серия
    private int number;//номер паспорта
    private String name;//имя
    private String surname;//фамилия
    private String patronymic; //отчество
    private String secondName;//второе имя
    private LocalDate birthsday ;// Дата рождения
    private LocalDate issue  ;// дата выдачи
    private String department; //орган, выдавший документ
    
    
     //  все параметры
    public Passport(String serial, int number, String name, String surname,
        String patronymic, String secondName, LocalDate birthsday, LocalDate issue, String department) {
        this.serial = serial;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.secondName = secondName;
        this.birthsday = birthsday;
        this.issue = issue;
        this.department = department;
    }
    //    без отчества
    public Passport(String serial, int number, String name, String surname, 
        String secondName, LocalDate birthsday, LocalDate issue, String department) {
        this (serial, number, name,  surname, null, secondName, birthsday,issue,department );
                
    }
    //  без отчества и второго имени  
    public Passport(String serial, int number, String name, String surname,
            LocalDate birthsday, LocalDate issue, String department) {
        this (serial, number, name,  surname, null, null ,birthsday,issue,department );
          
    }
         //  без  второго имени  
    public Passport(String serial, String name,int number ,String surname, 
            String patronymic, LocalDate birthsday, LocalDate issue, String department) {
        this (serial, number, name,  surname,patronymic ,null, birthsday,issue,department );
       
     }
    
    //  без отчества , второго имени,даты рождения,даты выдачи и органа выдавшего документ
    public Passport(String serial, int number, String name, String surname) {
        this (serial, number, name,  surname, null, null ,null,null,null );
     }   
    
        /*  TODO (Замечания№2 ЛР№1)
            - Данный конструктор реализовать через конструктор с полным набором параметров!  Исправил
        */  

    
    
    
    public String getSerial() {
        return serial;
    }
    public int getNumber() {
        return number;
    }
    public String getName() { 
        return name; 
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic; 
    }
    public String getSecondName() {
        return secondName; 
    }
    public LocalDate getBirthsday() {
        return birthsday;
    }
    public LocalDate getIssue() {
        return issue;
    }
    public String getDepartment() { 
        return department; 
    }
    
    
    
    

    

    
    

   
    
    
    
    
    
    
    

}