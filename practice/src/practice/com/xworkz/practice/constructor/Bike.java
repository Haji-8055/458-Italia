package practice.com.xworkz.practice.constructor;

import practice.com.xworkz.practice.constants.AllDataTypes;

public class Bike {

	public   String brand;
	public  String name;
	public  String type;
	public  int cc;
	public  AllDataTypes gettingvalue;
	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(String brand, String name, String type, int cc, AllDataTypes gettingvalue) {
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.cc = cc;
		this.gettingvalue = gettingvalue;

	}

	public  void displayDetails() {
		System.out.println("brand : "+brand);
		System.out.println("name : "+name);
		System.out.println("type : "+type);
		System.out.println("cc : "+cc);
		System.out.println("tyreSize : "+gettingvalue.tyreSize);
		System.out.println("colour : "+gettingvalue.colour);


	}
}
