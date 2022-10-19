package com.haji.instance.constructor;

public class Juice {
	
	public String name;
	public String brand;
	public String flavour;
	public boolean isGood;
	public int price;
	public String[] types;
	public String[] flavours;
	public String[] mostlyUsed;
	public int[] pricesOfModels;
	public String[] buyers;
	public String[] suppliers;

	public Juice(String name, String brand, String flavour, boolean isGood, int price, String[] types,
			String[] flavours, String[] mostlyUsed, int[] pricesOfModels, String[] buyers,
			String[] suppliers) {

		this.name = name;
		this.brand = brand;
		this.flavour = flavour;
		this.isGood = isGood;
		this.price = price;
		this.types = types;
		this.flavours = flavours;
		this.mostlyUsed = mostlyUsed;
		this.pricesOfModels = pricesOfModels;
		this.buyers = buyers;
		this.suppliers = suppliers;

	}

	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("brand : " + brand);
		System.out.println("flavour : " + flavour);
		System.out.println("price: " + price);
		System.out.println("isGood : " + isGood);

		System.out.println("printing types  ");
		for (int i = 0; i < types.length; i++) {
			System.out.println(types[i]);
		}

		System.out.println("printing flavours ");
		for (int i = 0; i < flavours.length; i++) {
			System.out.println(flavours[i]);
		}

		System.out.println("printing mostlyUsed ");
		for (int i = 0; i < mostlyUsed.length; i++) {
			System.out.println(mostlyUsed[i]);
		}

		System.out.println("printing pricesOfModels ");
		for (int i = 0; i < pricesOfModels.length; i++) {
			System.out.println(pricesOfModels[i]);
		}

		System.out.println("printing buyers ");
		for (int i = 0; i < buyers.length; i++) {
			System.out.println(buyers[i]);
		}

		System.out.println("printing suppliers ");
		for (int i = 0; i < suppliers.length; i++) {
			System.out.println(suppliers[i]);
		}

	}

}


