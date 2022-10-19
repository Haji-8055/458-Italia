package com.haji.instance.boot;

import com.haji.instance.constants.TeaBrand;
import com.haji.instance.constructor.Tea;

public class TeaRunner {

	public static void main(String[] args) {

		String[] types = { "lemon tea", "green tea", "black tea", "sugar less" };
		String[] differentBrands = { "Tata", "red label", "taj" };
		String[] availableLocations = { "Bangalore", "kerala", "Hyderabad" };
		int[] pricesOfTypes = { 20, 15, 10, 10 };
		String[] customers = { "Ganesh", "pavan", "ravi" };
		String[] employees = { "maruti", "rahul", "raju" };

		Tea tea = new Tea("Brown tea", TeaBrand.TATA, "cook", true, 20, types, differentBrands, availableLocations,
				pricesOfTypes, customers, employees);
		tea.displayDetails();
	}

}
