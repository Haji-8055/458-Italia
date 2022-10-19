package com.haji.instance.boot;

import com.haji.instance.constructor.Kitchen;

public class KitchenRunner {

	public static void main(String[] args) {

		String[] itemsInkitchen = { "Shenga", "putaane", "aata", "rice" };
		String[] compartments = { "kirani", "oil compartment", "boxes" };
		String[] storageTypes = { "draws", "tubs", "racks" };
		int[] pricesOfItems = { 180, 120, 80, 60 };
		String[] familyMembers = { "Ganesh", "pavan", "ravi" };
		String[] cooks = { "maruti", "rahul", "raju" };

		Kitchen kitchen = new Kitchen("Modern", "open kitchen", "ravi", true, 200000, itemsInkitchen, compartments,
				storageTypes, pricesOfItems, familyMembers, cooks);
		kitchen.displayDetails();
	}

}
