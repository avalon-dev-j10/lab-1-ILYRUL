 
 
package ru.avalon.java.dev.j10.labs.commons;
public class Address{
    private String city = "not defined";
    private String street = "not defined";
    private int numberOfHouse;
    private int numberOfApartment;

    public Address(String citi, String street, int numberOfHouse,int numberOfApartment){
        this.city;
        this.street;
        this.numberOfHouse=numberOfHouse;
        this.numberOfApartment=numberOfApartment;
  }
}
   public String getCity(){
       return city;
        
   }
    public String getStreet(){
       return street;  
   }
    public int getNumberOfHouse();{
    return int numberOfHouse;
    } 
        public int getNumberOfApartment();{
        return int numberOfApartment;  
    }
        public void setStreet(String street) {
        this.street = street;
    }

        public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

        public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }
}
