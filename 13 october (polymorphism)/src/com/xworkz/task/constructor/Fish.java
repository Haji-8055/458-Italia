package com.xworkz.task.constructor;

public class Fish {

	public String name;
	public String type;
	public int price;
	public double weight;
	public double length;

	public Fish(String name) {
		this.name=name;
	}
	
	public Fish(String type,int price) {
		this.type=type;
		this.price=price;
	}
	
	public Fish(int price,double weight) {
		this.price=price;
		this.weight=weight;
	}
	
	public Fish(double length,double weight) {
		this.length=length;
		this.weight=weight;
	}
	
	public Fish( String name,double length) {
		this.name=name;
		this.length=length;
	}
	
	public Fish(int price)
	{
		this.price=price;
	}
	public Fish(double length)
	{
		this.length=length;
	}
	public Fish(String name, String type,int price,double weight,double length) {
		this.name=name;
		this.type=type;
		this.price=price;
		this.weight=weight;
		this.length=length;



	}
	


}
