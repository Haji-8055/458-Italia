package com.xworkz.association.things;

import com.xworkz.association.constants.FuelType;

public class Fuel {

	public FuelType fuel;
	public boolean special;
	public double price;
	public int quantity;

	FuelBrand fuelBrand=new FuelBrand();
	
	public Fuel(FuelType fuel, boolean special, double price, int quantity) {
		this.fuel = fuel;
		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void totalPrice()
	{
		Double totalPrice=price*quantity;
		System.out.println("totalPrice : "+totalPrice);
		
	}
	public void showOff()
	{
		System.out.println("===printing fuel details");
		System.out.println("fuel : "+fuel);
		System.out.println("special : "+special);
		System.out.println("price : "+price);
		System.out.println("quantity : "+quantity);
		totalPrice();
		fuelBrand.showOff();

	}
	

}
