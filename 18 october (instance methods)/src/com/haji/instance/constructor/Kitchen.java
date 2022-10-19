package com.haji.instance.constructor;

public class Kitchen {

	public String kitchenType;
	public String place;
	public String cookName;
	public boolean isGood;
	public int costOfKitchen;
	public String[] itemsInkitchen;
	public String[] compartments;
	public String[] storageTypes;
	public int[] pricesOfItems;
	public String[] familyMembers;
	public String[] cooks;

	public Kitchen(String kitchenType, String place, String cookName, boolean isGood, int costOfKitchen,
			String[] itemsInkitchen, String[] compartments, String[] storageTypes, int[] pricesOfItems,
			String[] familyMembers, String[] cooks) {

		this.kitchenType = kitchenType;
		this.place = place;
		this.cookName = cookName;
		this.isGood = isGood;
		this.costOfKitchen = costOfKitchen;
		this.itemsInkitchen = itemsInkitchen;
		this.compartments = compartments;
		this.storageTypes = storageTypes;
		this.pricesOfItems = pricesOfItems;
		this.familyMembers = familyMembers;
		this.cooks = cooks;

	}

	public void displayDetails() {
		System.out.println("kitchenType: " + kitchenType);
		System.out.println("place : " + place);
		System.out.println("cookName : " + cookName);
		System.out.println("costOfKitchen: " + costOfKitchen);
		System.out.println("isGood : " + isGood);

		System.out.println("printing itemsInkitchen  ");
		for (int i = 0; i < itemsInkitchen.length; i++) {
			System.out.println(itemsInkitchen[i]);
		}

		System.out.println("printing compartments ");
		for (int i = 0; i < compartments.length; i++) {
			System.out.println(compartments[i]);
		}

		System.out.println("printing storageTypes ");
		for (int i = 0; i < storageTypes.length; i++) {
			System.out.println(storageTypes[i]);
		}

		System.out.println("printing pricesOfItems ");
		for (int i = 0; i < pricesOfItems.length; i++) {
			System.out.println(pricesOfItems[i]);
		}

		System.out.println("printing familyMembers ");
		for (int i = 0; i < familyMembers.length; i++) {
			System.out.println(familyMembers[i]);
		}

		System.out.println("printing cooks ");
		for (int i = 0; i < cooks.length; i++) {
			System.out.println(cooks[i]);
		}

	}
}
