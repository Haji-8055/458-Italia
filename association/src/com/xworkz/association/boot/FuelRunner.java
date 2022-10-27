package com.xworkz.association.boot;

import com.xworkz.association.constants.FuelType;
import com.xworkz.association.things.Fuel;

public class FuelRunner {

	public static void main(String[] args) {

		Fuel fuel =new Fuel(FuelType.PETROL, false, 104.70, 7);
		fuel.showOff();
	}

}
