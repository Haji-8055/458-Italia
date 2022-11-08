package com.xworkz.inheritance.things;

public class VegCatering extends Catering{

	public VegCatering(String type, String owner, int pricePerPlate) {
		super(type, owner, pricePerPlate);
		System.out.println("parameterized constructor of child class");

	}
	
	
	

}
