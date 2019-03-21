package ru.avalon.java.dev.j10.labs.models;


 public class Passport {
	 private int serialAndNumber;
	 private static int counterOfPasports=1;// количество выданных паспартов
private String firstName;
private String secondName;
private String middleName;
private String lastName;

private String birthday = "not defined";
private String dateOflssue = "not defined";
private String organization = "not defined";
public Passport(String firstName){
this.firstName = firstName;
}
	public Passport(String lastName,String firstName){
this(firstName);
this.lastName = lastName;
serialAndNumber = counterOfPasports++;
}
	public Passport(String lastName,String firstName,String middleName){
this(lastName, firstName);
this.middleName = middleName;
	}
	public Passport(String secondName, String lastName,String firstName,String middleName){
this(lastName, firstName);
this.secondName = secondName;

	}
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
public void setSecondName(String secondName){
		this.secondName=secondName;
		
}
public void setMiddleName(String middleName){
		this.middleName=middleName;
}

public void setLasteName(String lastName){
		this.lastName=lastName;
}

public void setMiddleBirthday(String birthday){
		this.birthday=birthday;
		
}
public void setDateOflssue(String dateOflssue){
		this.dateOflssue=dateOflssue;
}
public void setOrganization(String organization){
		this.organization=organization;
}

public void setSerialAndNuber(String serialAndNumber){
		this.serialAndNumber = serialAndNumber;
		
}
public int getSerialAndNuber(){
		return serialAndNumber;
		
}
public String getFirstName(){
		return firstName;
}

public String getSecondName(){
		return secondName;
}
public String getMidleName(){
		return middleName;
}
public String getLastName(){
		return lastName;
}
public String getBirthday(){
		return birthday;
}
public String getDateOfissue(){
		return dateOflssue;
}
public String getOrganization(){
		return organization;
}
@Override
public String toString(){
	String pssportinfo="firstName"+firstName+"\n";
	if (secondName!=null)
	pssportinfo += "firstName"+firstName+"\n";

else 
	
passportinfo +="secondName: not defined"+"\n";

if (middleName!=null)

	pssportinfo += "middleName"+middleName+"\n";
else	

passportinfo+="middleName:not defined"+"\n";

pssportinfo += "\n"+birthday+"lastName"+lastName+"\n"+"serialAndNumber:"+serialAndNumber+
        "\n"+"birthday:""dateOflssue"+dateOflssue+"\n"+"organization:"+organization;

 }
 





   