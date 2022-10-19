package com.haji.instance.constructor;

public class Mobile {
	
	public String name;
	public String brand;
	public String processorType;
	public boolean isGood;
	public int price;
	public String[] types;
	public String[] models;
	public String[] mostlyUsed;
	public int[] pricesOfModels;
	public String[] buyers;
	public String[] suppliers;

	public Mobile(String name, String brand, String processorType, boolean isGood, int price, String[] types,
			String[] models, String[] mostlyUsed, int[] pricesOfModels, String[] buyers, String[] suppliers) {

		this.name = name;
		this.brand = brand;
		this.processorType = processorType;
		this.isGood = isGood;
		this.price = price;
		this.types = types;
		this.models = models;
		this.mostlyUsed = mostlyUsed;
		this.pricesOfModels = pricesOfModels;
		this.buyers = buyers;
		this.suppliers = suppliers;

	}

	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("brand : " + brand);
		System.out.println("processorType : " + processorType);
		System.out.println("price: " + price);
		System.out.println("isGood : " + isGood);

		System.out.println("printing types  ");
		for (int i = 0; i < types.length; i++) {
			System.out.println(types[i]);
		}

		System.out.println("printing models ");
		for (int i = 0; i < models.length; i++) {
			System.out.println(models[i]);
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
