package ru.avalon.java.dev.j10.labs.models;


public class Person {
	private String firstName;
	private Passport passport;
	private Address address;
	
	public Person (String firstName){
		this.firstName=firstName;
		passport=new Passport(firstName);
		address =new Address();
	}

    

    public String getFullName() {
       
        String fullName;
	String middlename = passport.getMiddleName();
	String lastName = passport.getLastName();
	String secondName = passport.getSecondName();
		
	if (middleName == null) && (secondName == null)
	 fullName=firstName + "" + lastName;
		else
		if(secondName==null){
		fullName=firstName+""+middlename+""+lastName;
		}
		else
		fullName=""+firstName+((Character)secondName.charAt(0)).toString()+ "." +lastName;
			
		
		return fullName;
		
    }

    
    public String getAddress() {
        
        return address.toString;
	
    }
	public String getFirstName(){
		return firstName;
	}
	public Passport getPassport(){
		return passport;
	}
	public void setPassport(Passport passport){
		this.passport=passport;
	}
	public void setAddress(Address address){
		this address = address;
	}
}

