package com.xworkz.association1.properties;

public class EmailCompany {
	
	EmailLocation location = new EmailLocation();

	public void display(String name, String ownerName) {
		
		System.out.println("====printing email company address====");

		System.out.println(" company name: " + name);
		System.out.println(" company ownerName: " + ownerName);

		location.dislpay(46, "Mountain view");

	}
}
