 
 
package ru.avalon.java.dev.j10.labs.commons;
public class Address{
    privat String city = "not defined";
    privat String street = "not defined";
    privat int numberOfHouse;
    privat int numberOfApartment;
    public Address(){
            
}
    public Address(String citi,String street, int numberOfHouse,int numberOfApartment){
        this.city;
        this.street;
        this.numberOfHouse=numberOfHouse;
        this.numberOfApartment=numberOfApartment;
    }
    public String getCity(){
        return city;
        
    }
    public String getStreet(){
       return street;  
    }
    public int getnumberOfHouse();{
    return int numberOfHouse;
} 
     public int getnumberOfApartment();{
    return int numberOfApartment;  
    }
    public void setstreet(String street) {
        this.street = street;
}
    public void setstreet(String street) {
        this.street = street;
    }
  
    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }
}
