package com.haji.instance.boot;

import com.haji.instance.constructor.Engine;

public class EngineRunner {

	public static void main(String[] args) {

		String[] types = { "V arrangement", "flat arrangement", "turbo charged", "W arrangement" };
		String[] models = { "v12 engines", "amg", "ferrari" };
		String[] mostlyUsed = { "lamborghini", "porsche", "ferrari" };
		int[] pricesOfModels = { 10000000, 8000000, 6500000 };
		String[] buyers = { "haji", "furqan", "ayaz" };
		String[] suppliers = { "haji", "furqan", "ayaz" };

		Engine engine = new Engine("flat six engine", "porsche", "high performance", true, 8000000, types, models,
				mostlyUsed, pricesOfModels, buyers, suppliers);
		engine.displayDetails();
	}

}
