package com.haji.instance.constructor;

import com.haji.instance.constants.RoomType;

public class Hotel {

	public String name;
	public RoomType roomType;
	public String ownerName;
	public boolean isGood;
	public int dailyincome;
	public String[] differentRoooms;
	public String[] branches;
	public String[] popularLocations;
	public int[] pricesOfRooms;
	public String[] customers;
	public String[] employees;

	public Hotel(String name, RoomType roomType, String ownerName, boolean isGood, int dailyincome,
			String[] differentRoooms, String[] branches, String[] popularLocations, int[] pricesOfRooms,
			String[] customers, String[] employees) {

		this.name = name;
		this.roomType = roomType;
		this.ownerName = ownerName;
		this.isGood = isGood;
		this.dailyincome = dailyincome;
		this.differentRoooms = differentRoooms;
		this.branches = branches;
		this.popularLocations = popularLocations;
		this.pricesOfRooms = pricesOfRooms;
		this.customers = customers;
		this.employees = employees;

	}

	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("roomType : " + roomType);
		System.out.println("ownerName : " + ownerName);
		System.out.println("dailyincome: " + dailyincome);
		System.out.println("isGood : " + isGood);

		System.out.println("printing differentRoooms  ");
		for (int i = 0; i < differentRoooms.length; i++) {
			System.out.println(differentRoooms[i]);
		}

		System.out.println("printing branches ");
		for (int i = 0; i < branches.length; i++) {
			System.out.println(branches[i]);
		}

		System.out.println("printing popularLocations ");
		for (int i = 0; i < popularLocations.length; i++) {
			System.out.println(popularLocations[i]);
		}

		System.out.println("printing pricesOfRooms ");
		for (int i = 0; i < pricesOfRooms.length; i++) {
			System.out.println(pricesOfRooms[i]);
		}

		System.out.println("printing customers ");
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i]);
		}

		System.out.println("printing employees ");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

}
