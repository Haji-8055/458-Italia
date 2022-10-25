package com.xworkz.declaring.boot;

import com.xworkz.declaring.things.Flower;

public class FlowerRunner {

	public static void main(String[] args) {

		Flower flower = new Flower("red", 545.5d);
		flower.noOfTypes = 68;
		Flower.size = "small"; // static
		flower.setPrice();
		flower.display();

	}

}
