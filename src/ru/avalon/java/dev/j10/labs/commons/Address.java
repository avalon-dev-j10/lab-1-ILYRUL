package ru.avalon.java.dev.j10.labs.commons;

public class Address {
                
   
 private int postcode;
    private String country;
    private String city;
    private String street;
    private int house;
    
    /* TODO (Проверка №1)
        Добавить поля - область, корпус, квартира
        Добавить коментарии к полям и методам класса
    */

    public Address (int postcode, String country,String city,
            String street,int house) {
        this.postcode = postcode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }
    
    /* TODO (Проверка №1)
        Добавить конструкторы без возможно отсутствующих параметров - квартира,
        корпус и перегрузить их через конструктор со всеми параметрами
    */
    
    public int getPostcode() { return postcode; }
    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public int getHouse() { return house; }
    
    public void setPostcode(int postcode) { this.postcode = postcode; }
    public void setCountry(String country) { this.country = country; }
    public void setCity(String city) { this.city = city; }
    public void setStreet(String street) { this.street = street; }
    public void setHouse(int house) { this.house = house; }

    
    public String getFullAdress() {
        if (country == "Россия" || country == "Российская Федерация" || country == "РФ") {
            return postcode + ", " + country + ", г. " + city + ", ул. " + street + ", д. " + house;
        } else {
            return house + ", " + street + ", " + city + ", " + country + ", " + postcode;
        }           
    }
    
    /*  TODO (Проверка №1)
        Метод  public String getFullAdress() должен быть реализован в классе Person,
        по условию задачи.
    */
}
