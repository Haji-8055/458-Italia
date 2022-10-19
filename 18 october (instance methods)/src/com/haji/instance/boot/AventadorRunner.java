package com.haji.instance.boot;

import com.haji.instance.constructor.Aventador;

public class AventadorRunner {

	public static void main(String[] args) {

		String[] coloursAvailable = { "red", "blue", "white", "green", "purple" };
		String[] speed = { "0 to 100 kmph in just 2.8sec", "0 to 200 in 8.6 sec", "top speed 350km/h " };
		String[] exhaustsAvailable = { "Novitec", "Capristo", "Gintani", "Brilliant", "IPE" };
		int[] pricesInDifferentCountires = { 40000000, 42000000, 4600000, 60000000 };
		String[] lapTimes = { "3:42:06 at nurburgring", "3:12:06 at yas marina circuit" };
		String[] engineParts = { "a 12 cylinder v12 engine", "spark plugs", "exhaust", "manifold", "valves" };

		Aventador aventador = new Aventador("lamborghini", "convertible", "Red", "Novitec", true, coloursAvailable,
				speed, exhaustsAvailable, pricesInDifferentCountires, lapTimes, engineParts);
		aventador.displayDetails();

	}

}
