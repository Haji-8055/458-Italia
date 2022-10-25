package com.xworkz.declaring.boot;

import com.xworkz.declaring.things.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {

		Saloon hajam = new Saloon("loreal");
		hajam.acRoom = true;
		hajam.setSalonRent();
		Saloon.noOfHairCutstyles = 20; // static
		hajam.display();

	}

}
