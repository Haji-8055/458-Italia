package com.xworkz.declaring.boot;

import com.xworkz.declaring.things.Milk;

public class MilkRunner {

	public static void main(String[] args) {

		Milk haalu = new Milk("rasgulla");
		haalu.setpackagingMaterial("tetraPack");
		haalu.price = 45;
		Milk.brand = "amul"; // static
		haalu.display();

	}

}
