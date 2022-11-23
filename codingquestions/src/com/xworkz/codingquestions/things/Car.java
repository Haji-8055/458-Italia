package com.xworkz.codingquestions.things;

public class Car {
	String brand;
	public Car(String name) {
		brand=name;
		System.out.println(brand);
		
		System.out.println("running");
	}

	public Car(Car car) {
		
		System.out.println(car.brand);
		
		
	}
	

}
