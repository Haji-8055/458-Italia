package com.xworkz.declaring.things;

public class Sweet {

	public String name = "motichoorLaddu";// literal
	public double quantity;// Initializing using method
	public int price;// Initializing using constructor
	public static String color;
	public String shopName;

	public Sweet(int price) { // Initializing using constructor
		this.price = price;
	}

	public void setQuantity(int quantity) { // Initializing using method
		this.quantity = quantity;
	}

	public void display() {

		System.out.println("sweetname: " + name);
		System.out.println("quantity: " + quantity);
		System.out.println("price: " + this.price);
		System.out.println("color: " + color);
		System.out.println("shopName: " + shopName);

	}

}
