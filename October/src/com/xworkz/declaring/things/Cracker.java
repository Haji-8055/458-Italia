package com.xworkz.declaring.things;

public class Cracker {

	public String type = "rocket"; // literals
	public int price;
	public double quantity;
	public static String companyName;
	public String usedAt;

	public Cracker(double quantity) { // Initializing using constructor
		this.quantity = quantity;
	}

	public void setUsedAt(String usedAt) {// Initializing using method
		this.usedAt =usedAt ;
	}

	public void display() {

		System.out.println("cracker type: " + type);
		System.out.println("cracker price: " + price);
		System.out.println("cracker quantity: " + this.quantity);
		System.out.println("cracker companyName: " + companyName);
		System.out.println("cracker usedAt: " + usedAt);

	}

}
