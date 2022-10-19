package com.haji.instance.boot;

import com.haji.instance.constructor.Juice;

public class JuiceRunner {

	public static void main(String[] args) {
		
		String[] types = { "soft", "sharbat", "danceMaker"};
		String[] flavours = { "orange", "mango", "blueberry" };
		String[] mostlyUsed = { "karnataka", "mumbai", "raichur" };
		int[] pricesOfModels = { 90, 95, 160, 150 };
		String[] buyers = { "Ganesh", "pavan", "ravi" };
		String[] suppliers = { "haji", "furqan", "ayaz" };

		Juice juice = new Juice("fanta", "parle", "lemon", true, 20, types,
				flavours, mostlyUsed, pricesOfModels, buyers, suppliers);
		juice.displayDetails();


		
	}

}
