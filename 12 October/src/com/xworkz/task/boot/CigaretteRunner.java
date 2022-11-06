package com.xworkz.task.boot;

import com.xworkz.task.constructor.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {

		Cigarette beedi=new Cigarette();
		System.out.println("values assigned using literals");
		System.out.println("brand: "+beedi.brand);
		System.out.println("name: "+beedi.name);
		System.out.println("colour: "+beedi.colour);
		System.out.println("content: "+beedi.content);
		System.out.println("company: "+beedi.company);
		System.out.println("appearance: "+beedi.appearance);
		System.out.println("quantity: "+beedi.quantity);
		System.out.println("price: "+beedi.price);
		System.out.println("manufactured year: "+beedi.mfgYear);
		
		//Assigning values using ref of copy
		beedi.expiryYear=2024;
		beedi.harmful=true;
		beedi.available=true;
		beedi.famousIn="India";
		beedi.plantLocation="goa";
		beedi.harmedPersons=100000000;
		beedi.quality="good";
		beedi.smell="too strong";
		beedi.companyRevenue=8000000000d;
	
		System.out.println("----------------------------------------------------");
		System.out.println("values assigned using instantiation");
		System.out.println("Expiry year: "+beedi.expiryYear);
		System.out.println("is harmful: "+beedi.harmful);
		System.out.println("is available: "+beedi.available);
		System.out.println("famousIn: "+beedi.famousIn);
		System.out.println("plantLocation: "+beedi.plantLocation);
		System.out.println("harmedPersons: "+beedi.harmedPersons);
		System.out.println("quality: "+beedi.quality);
		System.out.println("smell: "+beedi.smell);
		System.out.println("companyRevenue: "+beedi.companyRevenue);



	}

}
