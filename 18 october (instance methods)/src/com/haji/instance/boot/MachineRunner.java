package com.haji.instance.boot;

import com.haji.instance.constructor.Machine;

public class MachineRunner {

	public static void main(String[] args) {

		String[] types = { "table less", "tabled", "light weight", "portable" };
		String[] models = { "janome", "wonder stitch", "butterfly" };
		String[] mostlyUsed = { "karnataka", "mumbai", "raichur" };
		int[] pricesOfModels = { 12000, 9500, 14000, 15000 };
		String[] buyers = { "Ganesh", "pavan", "ravi" };
		String[] suppliers = { "haji", "furqan", "ayaz" };

		Machine machine = new Machine("Janome", "usha", "portable", true, 12300, types, models, mostlyUsed,
				pricesOfModels, buyers, suppliers);
		machine.displayDetails();

	}

}
