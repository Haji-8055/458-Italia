package com.haji.instance.boot;

import com.haji.instance.constants.BusNumber;
import com.haji.instance.constructor.Bus;

public class BusRunner {

	public static void main(String[] args) {

		String[] differentBuses = { "89c", "79k", "96g", "95g" };
		String[] stops = { "malleshwaram", "sri rampura", "star circle" };
		String[] reservedSeats = { "Ladies", "differently abled", "seniors above 60" };
		int[] pricesOfTickets = { 25, 20, 20, 15 };
		String[] customers = { "Furqan", "Ayaz", "Haji" };
		String[] drivers = { "maruti", "rahul", "raju" };

		Bus bus = new Bus(BusNumber.A89C, "local", "BMTC", true, 4000, differentBuses, stops, reservedSeats,
				pricesOfTickets, customers, drivers);
		bus.displayDetails();

	}

}
