package com.xworkz.bus.boot;

import com.xworkz.bus.constructor.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		Developer engineer=new Developer();
		System.out.println("Printing default values");
		System.out.println("Name of Developer: "+engineer.name);
		System.out.println("Education of Developer: "+engineer.education);
		System.out.println("expeirence of Developer: "+engineer.experience);
		System.out.println("salary of Developer: "+engineer.salary);
		System.out.println("company of Developer: "+engineer.company);

		engineer.name="Haji";
		engineer.education="BE (Mechanical)";
		engineer.experience=2;
		engineer.salary=38000d;
		engineer.company="Amiti";
		
		System.out.println("*********************************");
		System.out.println("Printing assigned values");
		System.out.println("Name of Developer: "+engineer.name);
		System.out.println("Education of Developer: "+engineer.education);
		System.out.println("expeirence of Developer: "+engineer.experience);
		System.out.println("salary of Developer: "+engineer.salary);
		System.out.println("company of Developer: "+engineer.company);


	}

}
