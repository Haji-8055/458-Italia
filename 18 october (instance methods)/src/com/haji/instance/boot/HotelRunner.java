package com.haji.instance.boot;

import com.haji.instance.constants.RoomType;
import com.haji.instance.constructor.Hotel;

public class HotelRunner {

	public static void main(String[] args) {

		String[] differentRoooms = { "AC SINGLE BED", "AC DOUBLE BED", "NON AC SINGLE BED", "NON AC DOUBLE BED" };
		String[] branches = { "malleshwaram", "MG road", "Koramangala" };
		String[] popularLocations = { "Bangalore", "mumbai", "Hyderabad" };
		int[] pricesOfRooms = { 20000, 55000, 15000, 12000 };
		String[] customers = { "Furqan", "Ayaz", "Haji" };
		String[] employees = { "maruti", "rahul", "raju" };

		Hotel hotel = new Hotel("Oberoi", RoomType.AC_DOUBLE_BED, "Mr. Rai Bahadur Mohan Singh Oberoi", true, 400000,
				differentRoooms, branches, popularLocations, pricesOfRooms, customers, employees);
		hotel.displayDetails();

	}

}
