package com.haji.instance.constructor;

public class Biryani {

	public String name;
	public String type;
	public String riceType;
	public boolean isTasty;
	public int quantity;
	public String[] ingredients;
	public String[] types;
	public String[] popularLocations;
	public int[] prices;
	public String[] hotelNames;
	public String[] riceTypes;

	public Biryani(String name, String type, String riceType, boolean isTasty, int quantity, String[] ingredients,
			String[] types, String[] popularLocations, int[] prices, String[] hotelNames, String[] riceTypes) {

		this.name = name;
		this.type = type;
		this.riceType = riceType;
		this.quantity = quantity;
		this.isTasty = isTasty;
		this.ingredients = ingredients;
		this.types = types;
		this.popularLocations = popularLocations;
		this.prices = prices;
		this.hotelNames = hotelNames;
		this.riceTypes = riceTypes;

	}

	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("type : " + type);
		System.out.println("riceType : " + riceType);
		System.out.println("quantity: " + quantity);
		System.out.println("isTasty : " + isTasty);

		System.out.println("printing ingredients  ");
		for (int i = 0; i < ingredients.length; i++) {
			System.out.println(ingredients[i]);
		}

		System.out.println("printing types ");
		for (int i = 0; i < types.length; i++) {
			System.out.println(types[i]);
		}

		System.out.println("printing popularLocations ");
		for (int i = 0; i < popularLocations.length; i++) {
			System.out.println(popularLocations[i]);
		}

		System.out.println("printing prices ");
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		System.out.println("printing hotelNames ");
		for (int i = 0; i < hotelNames.length; i++) {
			System.out.println(hotelNames[i]);
		}

		System.out.println("printing riceTypes ");
		for (int i = 0; i < riceTypes.length; i++) {
			System.out.println(riceTypes[i]);
		}

	}
}
