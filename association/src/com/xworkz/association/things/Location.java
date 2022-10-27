package com.xworkz.association.things;

public class Location {
	public String city;
	public String state;
	public int pinCode;
	public String country;
	public Temple temple = new Temple("kedarnath", "Rawal", 12000, 15000);

	public Location(String city, String state, int pinCode, String country) {

		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;

	}

	public void showOff() {
		System.out.println("======printng details of location====");
		System.out.println("city : "+this.city);
		System.out.println("state : "+this.state);
		System.out.println("pincode : "+this.pinCode);
		System.out.println("country : "+this.country);
		temple.showOff();

	}

}
