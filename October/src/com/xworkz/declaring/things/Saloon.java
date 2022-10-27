package com.xworkz.declaring.things;

public class Saloon {

	public String name;
	public String location = "Gadag";
	public static int noOfHairCutstyles;
	public int saloonRent;
	public boolean acRoom;

	public Saloon(String name) { // Initializing using constructor
		this.name = name;
	}

	public void setSalonRent(int rent) {// Initializing using method
		saloonRent = rent;
	}

	public void display() {
		System.out.println("saloon name: " + this.name);
		System.out.println("saloon location: " + location);
		System.out.println("noOfHairCutstyles: " + noOfHairCutstyles);
		System.out.println("saloonRent: " + saloonRent);
		System.out.println("acRoom: " + acRoom);
	}

}
