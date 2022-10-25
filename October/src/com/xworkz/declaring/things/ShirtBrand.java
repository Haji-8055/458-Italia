package com.xworkz.declaring.things;

public class ShirtBrand {

	public String owner = "gautam singhania";
	public String shirtColor;
	public String brandName;
	public static int shirtPrice;
	public long companyRevenue;

	public ShirtBrand(String shirtColor) { // Initializing using constructor
		this.shirtColor = shirtColor;
	}

	public void setBrandName() {// Initializing using method
		brandName = "Raymonds";
	}

	public void display() {
		System.out.println("shirtColor: " + this.shirtColor);
		System.out.println("brandName: " + brandName);
		System.out.println("brandowner: " + owner);
		System.out.println("companyRevenue: " + companyRevenue);
		System.out.println("shirtPrice: " + shirtPrice);
	}

}
