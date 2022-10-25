package com.xworkz.declaring.things;

public class Lamp {

	public String color;
	public boolean working;
	public int price;
	public static String lampMaterial;
	public String shopName = "balaji";

	public Lamp(String color) { // Initializing using constructor

		this.color = color;

	}

	public void setPrice() {// Initializing using method
		price = 855;
	}

	public void display() {

		System.out.println("lamp color: " + this.color);
		System.out.println("working: " + working);
		System.out.println("lamp price: " + price);
		System.out.println("lampMaterial: " + lampMaterial);
		System.out.println("shopName: " + shopName);

	}

}
