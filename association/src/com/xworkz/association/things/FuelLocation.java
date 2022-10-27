package com.xworkz.association.things;

public class FuelLocation {

	public String street ; 
	public String city ; 
	public String state ; 
	public int pinCode ;
	public String country ; 
	
	public FuelLocation(String street, String city,String state,int pinCode, String country)
	{
		this.street=street;
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
		this.country=country;
	
	}

	public void showOff()
	{
		System.out.println("===printing fuel bunk location");
		System.out.println("street : "+street);
		System.out.println("city : "+city);
		System.out.println("state : "+state);
		System.out.println("pinCode : "+pinCode);
		System.out.println("country : "+country);

	}

}
	//System.out.println(" : "+);
