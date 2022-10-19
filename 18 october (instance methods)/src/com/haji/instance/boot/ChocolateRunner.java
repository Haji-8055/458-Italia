package com.haji.instance.boot;

import com.haji.instance.constructor.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		String[] types = { "temptation", "crunchy", "bubbly", "diwali special" };
		String[] flavours = { "chocolate", "rum raisin", "almond" };
		String[] mostlyUsed = { "kids", "girls", "nibba's" };
		int[] pricesOfModels = { 120, 80, 160, 150 };
		String[] buyers = { "Ganesh", "pavan", "ravi" };
		String[] suppliers = { "haji", "furqan", "ayaz" };

		Chocolate chocolate = new Chocolate("diary milk", "cadbury", "normal", true, 20, types,
				flavours, mostlyUsed, pricesOfModels, buyers, suppliers);
		chocolate.displayDetails();

	}

}
