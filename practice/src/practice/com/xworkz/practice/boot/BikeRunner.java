package practice.com.xworkz.practice.boot;

import practice.com.xworkz.practice.constants.AllDataTypes;
import practice.com.xworkz.practice.constructor.Bike;

public class BikeRunner {

	public static void main(String[] args) {

		Bike bike = new Bike("Kawasaki", "ZX10r", "super bike", 1000, AllDataTypes.VALUE1);
		System.out.println("======printing instance bike=====");
		bike.displayDetails();
		
		
		Bike bike1 = new Bike("Ducati", "V4", "hyper bike", 998, AllDataTypes.VALUE2);
		System.out.println("creating a new instance of bike as bike1");
		bike1.displayDetails();
		System.out.println("======printing instance bike again=====");
		bike.displayDetails();
	/* output will be this if variables are instance ,as instance can have many copy everytime when we declare a new instance or make a new copy,
	 * a new memory is created in instance pool which will be having all the instance variables which are not referring or directing to any address,
	 * basically primitives have 0 and non primitives have null as value
	brand : Kawasaki
	name : ZX10r
	type : super bike
	cc : 1000	
	tyreSize : R225
	colour : RED
	creating a new instance of bike as bike1 
	brand : Ducati
	name : V4
	type : hyper bike
	cc : 998
	tyreSize : R215
	colour : BLACK
	brand : Kawasaki
	name : ZX10r
	type : super bike
	cc : 1000
	tyreSize : R225
	colour : RED
		 */
		
		/* output will be this if variables are static ,as static variable can have only one copy ,the initial value in
		 *  metaspace will be updated to the latest values, if we call the previous instance "bike"  after initializing
		 *    "bike1", the values of bike instance will not be printed instead of that the latest values gets printed
		 *    ======printing instance bike=====
		brand : Kawasaki
		name : ZX10r
		type : super bike
		cc : 1000
		tyreSize : R225
		colour : RED
		creating a new instance of bike as bike1
		brand : Ducati
		name : V4
		type : hyper bike
		cc : 998
		tyreSize : R215
		colour : BLACK
		======printing instance bike again=====
		brand : Ducati
		name : V4
		type : hyper bike
		cc : 998
		tyreSize : R215
		colour : BLACK
	 
		 */
		 

	}

}
