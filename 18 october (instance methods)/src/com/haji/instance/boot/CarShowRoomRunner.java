package com.haji.instance.boot;

import com.haji.instance.constructor.CarShowRoom;

public class CarShowRoomRunner {

	public static void main(String[] args) {

		String[] models = { "Harrier", "tiago", "Altroz", "Safari" };
		String[] branches = { "Bijapur", "Bagalkot", "Bangalore" };
		String[] popularLocations = { "Bangalore", "kerala", "Hyderabad" };
		int[] pricesOfModels = { 1250000, 500000, 900000, 2300000 };
		String[] customers = { "Ganesh", "pavan", "ravi" };
		String[] employees = { "maruti", "rahul", "raju" };

		CarShowRoom carShowRoom = new CarShowRoom("bijjargi motors", "Tata", "Bijjargi", true, 4000000, models,
				branches, popularLocations, pricesOfModels, customers, employees);
		carShowRoom.displayDetails();

	}

}
