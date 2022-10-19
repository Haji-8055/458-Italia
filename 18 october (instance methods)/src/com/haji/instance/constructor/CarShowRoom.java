package com.haji.instance.constructor;

public class CarShowRoom {

	public String name;
	public String brand;
	public String ownerName;
	public boolean isGood;
	public int yearlyIncome;
	public String[] models;
	public String[] branches;
	public String[] popularLocations;
	public int[] pricesOfModels;
	public String[] customers;
	public String[] employees;

	public CarShowRoom(String name, String brand, String ownerName, boolean isGood, int yearlyIncome, String[] models,
			String[] branches, String[] popularLocations, int[] pricesOfModels, String[] customers,
			String[] employees) {

		this.name = name;
		this.brand = brand;
		this.ownerName = ownerName;
		this.yearlyIncome = yearlyIncome;
		this.isGood = isGood;
		this.models = models;
		this.branches = branches;
		this.popularLocations = popularLocations;
		this.pricesOfModels = pricesOfModels;
		this.customers = customers;
		this.employees = employees;

	}

	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("brand : " + brand);
		System.out.println("ownerName : " + ownerName);
		System.out.println("yearlyIncome: " + yearlyIncome);
		System.out.println("isGood : " + isGood);

		System.out.println("printing models  ");
		for (int i = 0; i < models.length; i++) {
			System.out.println(models[i]);
		}

		System.out.println("printing branches ");
		for (int i = 0; i < branches.length; i++) {
			System.out.println(branches[i]);
		}

		System.out.println("printing popularLocations ");
		for (int i = 0; i < popularLocations.length; i++) {
			System.out.println(popularLocations[i]);
		}

		System.out.println("printing pricesOfModels ");
		for (int i = 0; i < pricesOfModels.length; i++) {
			System.out.println(pricesOfModels[i]);
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
