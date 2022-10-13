package com.xworkz.task.boot;

import com.xworkz.task.constructor.Boat;

public class BoatRunner {

	public static void main(String[] args) {
	
		Boat boat=new Boat("Aquador","yellow");
		System.out.println("boat.name: "+boat.name);
		System.out.println("boat.color: "+boat.color);
		System.out.println("boat.companyName: "+boat.companyName);
		System.out.println("boat.type: "+boat.type);
		System.out.println("boat.owner: "+boat.owner);
		System.out.println("******************************************");
		
	     boat=new Boat("Aquador","yellow","SunnyBoats");
		System.out.println("boat.name: "+boat.name);
		System.out.println("boat.color: "+boat.color);
		System.out.println("boat.companyName: "+boat.companyName);
		System.out.println("boat.type: "+boat.type);
		System.out.println("boat.owner: "+boat.owner);
		System.out.println("******************************************");

		boat=new Boat("Aquador","yellow","SunnyBoats","goods");
		System.out.println("boat.name: "+boat.name);
		System.out.println("boat.color: "+boat.color);
		System.out.println("boat.companyName: "+boat.companyName);
		System.out.println("boat.type: "+boat.type);
		System.out.println("boat.owner: "+boat.owner);
		System.out.println("******************************************");
		
		boat=new Boat("Aquador","yellow","goods",2);
		System.out.println("boat.name: "+boat.name);
		System.out.println("boat.color: "+boat.color);
		System.out.println("boat.companyName: "+boat.companyName);
		System.out.println("boat.type: "+boat.type);
		System.out.println("boat.owners: "+boat.owner);
		System.out.println("******************************************");
		
		boat=new Boat("Aquador");
		System.out.println("boat.name: "+boat.name);
		System.out.println("boat.color: "+boat.color);
		System.out.println("boat.companyName: "+boat.companyName);
		System.out.println("boat.type: "+boat.type);
		System.out.println("boat.owner: "+boat.owner);
		System.out.println("******************************************");
		
		boat=new Boat("Aquador",2);
		System.out.println("boat.name: "+boat.name);
		System.out.println("boat.color: "+boat.color);
		System.out.println("boat.companyName: "+boat.companyName);
		System.out.println("boat.type: "+boat.type);
		System.out.println("boat.owner: "+boat.owner);
		System.out.println("******************************************");
		
		boat=new Boat("Aquador",2,"SunnyBoats");
		System.out.println("boat.name: "+boat.name);
		System.out.println("boat.color: "+boat.color);
		System.out.println("boat.companyName: "+boat.companyName);
		System.out.println("boat.type: "+boat.type);
		System.out.println("boat.owner: "+boat.owner);
		System.out.println("******************************************");
		
		boat=new Boat("Aquador","yellow","SunnyBoats","goods",2);
		System.out.println("boat.name: "+boat.name);
		System.out.println("boat.color: "+boat.color);
		System.out.println("boat.companyName: "+boat.companyName);
		System.out.println("boat.type: "+boat.type);
		System.out.println("boat.owner: "+boat.owner);
	}



	}


