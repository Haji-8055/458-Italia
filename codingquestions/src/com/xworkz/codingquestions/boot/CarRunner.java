package com.xworkz.codingquestions.boot;

import com.xworkz.codingquestions.things.Car;

public class CarRunner {
	public static void main(String[] args) {

		Car car = new Car("tata");

		Car car1 = new Car(car /* previous object */); 		// copy constructor: creating a new object using another object

	}

}
