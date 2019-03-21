package ru.avalon.java.dev.j10.labs.models;


public class Person {
	private String firstName;
	private Passport passport;
	private Address address;
	
	public Person (String firstName){
		this.firstName=firstName;
		passport=new Passport(firstName);
		address =new address();
	}

    

    public String getFullName() {
       
        String fullName;
		String middlename = passport.getMiddleName();
		String lastName = passport.getLastName();
		String secondName = passport.getSecondName();
		
		if(middlename==null)&&(secondName==null)
			fullName=firstName+""+lastName;
		else
			if(secondName==null){
				fullName=firstName+""+middlename+""+lastName;
			}
			else
				fullName=""+firstName+((Character)secondName.charAt(0)).toString()+".;+lastName;
			
		
		return fullName;
		
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address.toString;
	
    }
	public String getFirsName(){
		return firstName;
	}
	public Passport getPassport(){
		return passport;
	}
	public void setPassport(Passport passport){
		this.passport=passport;
	}
	public void setAdress(Address address){
		this address = address;
	}
}

