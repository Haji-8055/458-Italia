package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.VegCatering;

public class CateringRunner {

	public static void main(String[] args) {
		VegCatering batting=new VegCatering("private", "Ayaz", 150);
		
		System.out.println(batting.type);
		System.out.println(batting.owner);
		System.out.println(batting.pricePerPlate);

	}

}
