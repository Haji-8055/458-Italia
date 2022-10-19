package com.haji.instance.boot;

import com.haji.instance.constructor.Mobile;

public class MobileRunner {

	public static void main(String[] args) {

		String[] types = {  "Android", "windows", "ios" };
		String[] models = { "note 8", "Z fold", "Z flip" };
		String[] mostlyUsed = { "samsung", "apple", "one plus" };
		int[] pricesOfModels = { 73000, 145000, 132000 };
		String[] buyers = { "haji", "furqan", "ayaz" };
		String[] suppliers = { "haji", "furqan", "ayaz" };

		Mobile mobile = new Mobile("s20 Ultra", "samsung", "high performance", true, 120000, types, models,
				mostlyUsed, pricesOfModels, buyers, suppliers);
		mobile.displayDetails();
	}

}
