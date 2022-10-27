package com.xworkz.association.things;

public class FuelBrand {
	public String name="Indian oil";
	public String gstNo="ka04b88887g6";
	public int rating=8;
	
	FuelLocation fuelLocation=new FuelLocation("basaveshwar nagar","bangalore","karnataka", 5800601,"india");

	public void showOff()
	{
		System.out.println("===printing fuel brand details");
		System.out.println("name : "+name);
		System.out.println("gstNo : "+gstNo);
		System.out.println("rating : "+rating);
		
		fuelLocation.showOff();
	}
}
