package com.haji.instance.boot;

import com.haji.instance.constructor.Biryani;

public class BiryaniRunner {

	public static void main(String[] args) {

		String[] ingredients = { "chicken", "rice", "curd", "onion", "garam masala" };
		String[] types = { "tahari", "dum biryani", "handi biryani" };
		String[] popularLocations = { "Hyderabad", "delhi", "bangalore" };
		int[] prices = { 180, 120, 160, 680 };
		String[] hotelNames = { "Empire", "rajkumar donne biryani", "oberoi" };
		String[] riceTypes = { "jeera rice", "raw rice", "basmati" };

		Biryani biryani = new Biryani("hyderabadi biryani", "non veg", "basmati", true, 4, ingredients, types,
				popularLocations, prices, hotelNames, riceTypes);
		biryani.displayDetails();

	}

}
