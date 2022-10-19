package com.haji.instance.constructor;

import com.haji.instance.constants.BusNumber;

public class Bus {

	public BusNumber number;
	public String busType;
	public String ownerName;
	public boolean isGood;
	public int dailyincome;
	public String[] differentBuses;
	public String[] stops;
	public String[] reservedSeats;
	public int[] pricesOfTickets;
	public String[] customers;
	public String[] drivers;

	public Bus(BusNumber number, String busType, String ownerName, boolean isGood, int dailyincome,
			String[] differentBuses, String[] stops, String[] reservedSeats, int[] pricesOfTickets, String[] customers,
			String[] drivers) {

		this.number = number;
		this.busType = busType;
		this.ownerName = ownerName;
		this.isGood = isGood;
		this.dailyincome = dailyincome;
		this.differentBuses = differentBuses;
		this.stops = stops;
		this.reservedSeats = reservedSeats;
		this.pricesOfTickets = pricesOfTickets;
		this.customers = customers;
		this.drivers = drivers;

	}

	public void displayDetails() {
		System.out.println("number: " + number);
		System.out.println("busType : " + busType);
		System.out.println("ownerName : " + ownerName);
		System.out.println("dailyincome: " + dailyincome);
		System.out.println("isGood : " + isGood);

		System.out.println("printing differentBuses  ");
		for (int i = 0; i < differentBuses.length; i++) {
			System.out.println(differentBuses[i]);
		}

		System.out.println("printing stops ");
		for (int i = 0; i < stops.length; i++) {
			System.out.println(stops[i]);
		}

		System.out.println("printing reservedSeats ");
		for (int i = 0; i < reservedSeats.length; i++) {
			System.out.println(reservedSeats[i]);
		}

		System.out.println("printing pricesOfTickets ");
		for (int i = 0; i < pricesOfTickets.length; i++) {
			System.out.println(pricesOfTickets[i]);
		}

		System.out.println("printing customers ");
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i]);
		}

		System.out.println("printing drivers ");
		for (int i = 0; i < drivers.length; i++) {
			System.out.println(drivers[i]);
		}

	}

}
