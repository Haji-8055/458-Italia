package com.xworkz.declaring.boot;

import com.xworkz.declaring.things.Mango;

public class MangoRunner {

	public static void main(String[] args) {

		Mango aam = new Mango(850);
		aam.quantity = 1000d;
		aam.setTaste();
		Mango.color = "orange"; // static
		aam.display();

	}

}
