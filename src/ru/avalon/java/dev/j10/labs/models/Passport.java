package ru.avalon.java.dev.j10.labs.models;

import java.util.Date;


   public class Passport {

    private int serial;
    private String name;
    private String surname;
    private String patronymic; //отчество
    private String secondName;
    private Date birthsday ;
    private Date issue  ;
    private String department; //орган, выдавший документ
    
    /* TODO (Проверка №1)
        Добавить коментарии к полям и методам класса
    */
    
    public Passport(String name,
                    String surname) {
        this.name = name;
        this.surname = surname;
    }

    
    public Passport(String name,
                    String surname,
                    int serial,
                    Date birthsday,
                    Date issue,
                    String department) {
        this(name,surname);
        this.serial = serial;
        this.birthsday = birthsday;
        this.issue = issue;
        this.department = department;
    }

   /* TODO (Проверка №1)
        Добавить конструкторы без возможно отсутствующих параметров - отчестово,
        второе имя и перегрузить их через конструктор со всеми параметрами.
        Лишние конструкторы удалить!!!
    */
    
    public String getPassportData() {
            return "Номер паспорта: \t" + serial + "\n" +
                   "Дата рождения: \t" + birthsday + "\n" +
                   "Дата выдачи: \t" + issue + "\n" +
                   "Кем выдан: \t" + department;
    } 
    
    
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getPatronymic() { return patronymic; }
    public String getSecondName() { return secondName; }
    public String getDepartment() { return department; }
    public Date getBirthsday() { return birthsday; }
    public Date getIssue() { return issue; }
    public int getSerial() { return serial; }

    public void setBirthsday(Date birthsday) { this.birthsday = birthsday; }
    public void setDepartment(String department) { this.department = department; }
    public void setIssue(Date issue) { this.issue = issue; }
    public void setName(String name) { this.name = name; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }
    public void setSecondName(String secondName) { this.secondName = secondName; }
    public void setSerial(int serial) { this.serial = serial; }
    public void setSurname(String surname) { this.surname = surname; }
    

    public String getFullName() {
        if (secondName != null) {
            return name + " " + secondName.charAt(0) + ". " + surname;
        } else if (secondName == null && patronymic == null) {
            return name + " " + surname;
        } else {
            return surname + " " + name + " " + patronymic;
        }
    }
    /*  TODO (Проверка №1)
        Метод   public String getFullName() должен быть реализован в классе Person,
        по условию задачи.
    */
    
}