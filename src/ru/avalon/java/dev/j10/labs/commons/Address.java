package ru.avalon.java.dev.j10.labs.commons;

public class Address {
                   
   
    private int postcode; //индекс
    private String country; //страна
    private String oblast; //область
    private String district; //район
    private String city; //город
    private String street; //улица
    private int house; //дом
    private int bloc;//корпус
    private int apartment; //квартира

    // конструктор со всеми параметрами
    public Address (int postcode, String country, String oblast,String district, String city,
            String street,int house,int bloc,int apartment) {
        this.postcode = postcode;
        this.country = country;
        this.oblast = oblast;
        this.district = district;
        this.street = street;
        this.house = house;
        this.bloc = bloc;
        this.apartment = apartment;
        
        
    }
    
    // конструктор без квартиры
    public Address(int postcode, String country, String oblast, String district,
            String city, String street, int house, int bloc) {
        this (postcode, country, oblast, district, city, street, house, bloc,0 );
    }
    // конструктор без корпуса и квартиры
    public Address(int postcode, String country, String oblast, String district, String city, String street, int house) {
        this (postcode, country, oblast, district, city, street, house, 0 ,0 );
        
    }

    // конструктор без области, района, корпуса и квартиры
    public Address(int postcode, String country, String oblast, String city, String street, int house, int bloc, int apartment) {
        this (postcode, country, oblast, null, city, street, house, 0 ,0 );
        
    }
    
     // конструктор без области, района, корпуса и квартиры
    public Address(int postcode, String country, String city, String street, int house) {
       this (postcode, country, null, null,  city, street, house, 0 ,0 );
        
    }

    

    //  обращаемся к переменным этого класса
    public int getPostcode() {
        return postcode;
    }
    public String getCountry() {
        return country;
    }
    public String getOblast() {
        return oblast;
    }
    public String getDistrict() {
        return district;
    }
    public String getCity() {
        return city; 
    }
    public String getStreet() {
        return street; 
    }
    public int getHouse() { 
        return house;
    }
    public int getBlock() {
        return bloc; 
    }
    public int getAapartment() {
        return apartment;  
    }
}  
 