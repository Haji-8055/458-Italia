package com.xworkz.bus.boot;

import com.xworkz.bus.constructor.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		Chocolate choco1= new Chocolate();
		System.out.println("Printing default values");
		System.out.println("Name of the chocolate: "+choco1.name);
		System.out.println("Brand of the chocolate: "+choco1.brand);
		System.out.println("Price of the chocolate: "+choco1.price);
		System.out.println("Flavour of the chocolate: "+choco1.flavour);
		
		choco1.name="KitKat";
		choco1.brand="Nestle";
		choco1.price=20;
		choco1.flavour="Rum Raisin";
		
		System.out.println("*********************************");
		System.out.println("Printing assigned values");
		System.out.println("Name of the chocolate: "+choco1.name);
		System.out.println("Brand of the chocolate: "+choco1.brand);
		System.out.println("Price of the chocolate: "+choco1.price);
		System.out.println("Flavour of the chocolate: "+choco1.flavour);
		



	}

}
