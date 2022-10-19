package com.haji.instance.constructor;

import com.haji.instance.constants.TeaBrand;

public class Tea {

	public String name;
	public TeaBrand brand;
	public String maker;
	public boolean isGood;
	public int price;
	public String[] types;
	public String[] differentBrands;
	public String[] availableLocations;
	public int[] pricesOfTypes;
	public String[] customers;
	public String[] employees;

	public Tea(String name, TeaBrand brand, String maker, boolean isGood, int price, String[] types,
			String[] differentBrands, String[] availableLocations, int[] pricesOfTypes, String[] customers,
			String[] employees) {

		this.name = name;
		this.brand = brand;
		this.maker = maker;
		this.price = price;
		this.isGood = isGood;
		this.types = types;
		this.differentBrands = differentBrands;
		this.availableLocations = availableLocations;
		this.pricesOfTypes = pricesOfTypes;
		this.customers = customers;
		this.employees = employees;

	}

	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("brand : " + brand);
		System.out.println("maker : " + maker);
		System.out.println("price: " + price);
		System.out.println("isGood : " + isGood);

		System.out.println("printing types  ");
		for (int i = 0; i < types.length; i++) {
			System.out.println(types[i]);
		}

		System.out.println("printing differentBrands ");
		for (int i = 0; i < differentBrands.length; i++) {
			System.out.println(differentBrands[i]);
		}

		System.out.println("printing availableLocations ");
		for (int i = 0; i < availableLocations.length; i++) {
			System.out.println(availableLocations[i]);
		}

		System.out.println("printing pricesOfTypes ");
		for (int i = 0; i < pricesOfTypes.length; i++) {
			System.out.println(pricesOfTypes[i]);
		}

		System.out.println("printing customers ");
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i]);
		}

		System.out.println("printing employees ");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

}
