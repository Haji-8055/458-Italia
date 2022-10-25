package com.xworkz.declaring.things;

public class Flower {

	public String color;
	public double quantity;
	public int price;
	public int noOfTypes;
	public String name = "JASMINE";
	public static String size;

	public Flower(String color, double quantity) { // Initializing using constructor

		this.color = color;
		this.quantity = quantity;
	}

	public void setPrice() {// Initializing using method
		price = 25;

	}

	public void display() {
		System.out.println("Flower FlowerName: " + name);
		System.out.println("Flower color: " + this.color);
		System.out.println("Flower quantity: " + this.quantity);
		System.out.println("Flower size: " + size);
		System.out.println("Flower price: " + price);
		System.out.println("noOfCustomers: " + noOfTypes);

	}

}
