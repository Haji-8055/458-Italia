package com.xworkz.bus.boot;

import com.xworkz.bus.constructor.BusInfo;

public class BusInfoRunner {

	public static void main(String[] args) {
		
		BusInfo Bus=new BusInfo();		 	 //instantiation
		System.out.println("Printing default values");
		System.out.println("Bus number: "+Bus.number);
		System.out.println("Starting point of bus: "+Bus.starting);
		System.out.println("Destination of bus: "+Bus.destination);
		
		System.out.println("*********************************");
		System.out.println("Printing assigned values");
		Bus.number=89;
		Bus.starting= "Majestic";
		Bus.destination="Kaveri Nagar";	
		
		System.out.println("Bus number: "+Bus.number);
		System.out.println("Starting point of bus: "+Bus.starting);
		System.out.println("Destination of bus: "+Bus.destination);

	}

}
