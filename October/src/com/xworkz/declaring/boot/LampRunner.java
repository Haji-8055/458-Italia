package com.xworkz.declaring.boot;

import com.xworkz.declaring.things.Lamp;

public class LampRunner {

	public static void main(String[] args) {

		Lamp lamp = new Lamp("yellow");
		lamp.working = true;
		lamp.setPrice(85);
		Lamp.lampMaterial = "paper"; // static
		lamp.display();

	}

}
