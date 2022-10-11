package com.xworkz.bus.boot;

import com.xworkz.bus.constructor.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector DC=new DistrictCollector();
		System.out.println("Printing default values");
		System.out.println("Name of DC: "+DC.name);
		System.out.println("age of DC: "+DC.age);
		System.out.println("district: "+DC.district);
		System.out.println("batch number: "+DC.batchNo);

		DC.name="Sunil";
		DC.age=32;
		DC.district="Bagalkot";
		DC.batchNo=2018;
		System.out.println("*********************************");
		System.out.println("Printing assigned values");
		System.out.println("Name of DC: "+DC.name);
		System.out.println("age of DC: "+DC.age);
		System.out.println("district: "+DC.district);
		System.out.println("batch number: "+DC.batchNo);
		
	}

}
