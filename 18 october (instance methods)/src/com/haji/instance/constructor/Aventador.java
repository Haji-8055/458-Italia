package com.haji.instance.constructor;

public class Aventador {

	public String company;
	public String type;
	public String colour;
	public String wheelsOnCar;
	public boolean isFast;
	public String[] coloursAvailable;
	public String[] speed;
	public String[] exhaustsAvailable;
	public int[] pricesInDifferentCountires;
	public String[] lapTimes;
	public String[] engineParts;

	public Aventador(String company, String type, String colour, String wheelsOnCar, boolean isFast,
			String[] coloursAvailable, String[] speed, String[] exhaustsAvailable, int[] pricesInDifferentCountires,
			String[] lapTimes, String[] engineParts) {

		this.company = company;
		this.type = type;
		this.colour = colour;
		this.wheelsOnCar = wheelsOnCar;
		this.isFast = isFast;
		this.coloursAvailable = coloursAvailable;
		this.speed = speed;
		this.exhaustsAvailable = exhaustsAvailable;
		this.pricesInDifferentCountires = pricesInDifferentCountires;
		this.lapTimes = lapTimes;
		this.engineParts = engineParts;

	}

	public void displayDetails() {
		System.out.println("company: " + company);
		System.out.println("type : " + type);
		System.out.println("colour : " + colour);
		System.out.println("wheelsOnCar: " + wheelsOnCar);
		System.out.println("isFast : " + isFast);

		System.out.println("printing colours Available ");
		for (int i = 0; i < coloursAvailable.length; i++) {
			System.out.println(coloursAvailable[i]);
		}

		System.out.println("printing speed ");
		for (int i = 0; i < speed.length; i++) {
			System.out.println(speed[i]);
		}

		System.out.println("printing exhaustsAvailable ");
		for (int i = 0; i < exhaustsAvailable.length; i++) {
			System.out.println(exhaustsAvailable[i]);
		}

		System.out.println("printing pricesInDifferentCountires ");
		for (int i = 0; i < pricesInDifferentCountires.length; i++) {
			System.out.println(pricesInDifferentCountires[i]);
		}

		System.out.println("printing lapTimes ");
		for (int i = 0; i < lapTimes.length; i++) {
			System.out.println(lapTimes[i]);
		}

		System.out.println("printing engineParts ");
		for (int i = 0; i < engineParts.length; i++) {
			System.out.println(engineParts[i]);
		}

	}

}
