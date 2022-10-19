package com.haji.instance.constructor;

public class Shop {

	public String name;
	public String shopType;
	public String ownerName;
	public boolean isGood;
	public int dailyincome;
	public String[] items;
	public String[] branches;
	public String[] popularLocations;
	public int[] pricesOfItems;
	public String[] customers;
	public String[] employees;

	public Shop(String name, String shopType, String ownerName, boolean isGood, int dailyincome, String[] items,
			String[] branches, String[] popularLocations, int[] pricesOfItems, String[] customers, String[] employees) {

		this.name = name;
		this.shopType = shopType;
		this.ownerName = ownerName;
		this.dailyincome = dailyincome;
		this.isGood = isGood;
		this.items = items;
		this.branches = branches;
		this.popularLocations = popularLocations;
		this.pricesOfItems = pricesOfItems;
		this.customers = customers;
		this.employees = employees;

	}

	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("shopType : " + shopType);
		System.out.println("ownerName : " + ownerName);
		System.out.println("dailyincome: " + dailyincome);
		System.out.println("isGood : " + isGood);

		System.out.println("printing items  ");
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}

		System.out.println("printing branches ");
		for (int i = 0; i < branches.length; i++) {
			System.out.println(branches[i]);
		}

		System.out.println("printing popularLocations ");
		for (int i = 0; i < popularLocations.length; i++) {
			System.out.println(popularLocations[i]);
		}

		System.out.println("printing pricesOfItems ");
		for (int i = 0; i < pricesOfItems.length; i++) {
			System.out.println(pricesOfItems[i]);
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
