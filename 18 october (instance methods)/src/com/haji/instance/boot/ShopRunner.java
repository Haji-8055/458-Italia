package com.haji.instance.boot;

import com.haji.instance.constructor.Shop;

public class ShopRunner {

	public static void main(String[] args) {

		String[] items = { "diamond", "gold", "platinum", "silver" };
		String[] branches = { "malleshwaram", "MG road", "Koramangala" };
		String[] popularLocations = { "Bangalore", "kerala", "Hyderabad" };
		int[] pricesOfItems = { 180000, 55000, 70000, 680 };
		String[] customers = { "Ganesh", "pavan", "ravi" };
		String[] employees = { "maruti", "rahul", "raju" };

		Shop shop = new Shop("joy alukkas", "jewelry", "joy alukkas", true, 4000000, items, branches, popularLocations,
				pricesOfItems, customers, employees);
		shop.displayDetails();

	}

}
