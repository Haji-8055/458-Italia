package com.xworkz.codingquestions.boot;

public class CloneRunner {

	public static void main(String[] args) throws CloneNotSupportedException {

		BikeDTO bikeDTO = new BikeDTO(1, "pulsar", "white");
		System.out.println("bike dto 1 :   "+bikeDTO);

		BikeDTO bikeDTO2 = bikeDTO.clone();
		System.out.println("bike dto 2 :   "+bikeDTO2);
		
		
		
		//shallow copy

		BikeDTO bikeDTO3=bikeDTO2;
		
		bikeDTO3.setColour("red");
		System.out.println("bike dto 2 :   "+bikeDTO2);

		System.out.println("shallow copy bike dto 3 :   "+bikeDTO3);
	}

}
