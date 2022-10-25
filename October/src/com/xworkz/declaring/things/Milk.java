package com.xworkz.declaring.things;

public class Milk {

	public static String brand;
	public double quantity = 500.2d;
	public int price;
	public String milkDessert;
	public String packagingMaterial;

	public Milk(String milkDessert) { // Initializing using constructor
		this.milkDessert = milkDessert;
	}

	public void setpackagingMaterial() {// Initializing using method
		packagingMaterial = "tetrapack";
	}

	public void display() {

		System.out.println("Milk brand: " + brand);
		System.out.println("Milk quantity: " + quantity);
		System.out.println("Milk price: " + price);
		System.out.println("milkDessert: " + this.milkDessert);
		System.out.println("Milk packagingMaterial: " + packagingMaterial);
	}

}
