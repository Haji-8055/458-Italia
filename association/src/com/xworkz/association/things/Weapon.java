package com.xworkz.association.things;

public class Weapon {

	public String name;
	public String use;
	public double weight;

	public Weapon(String name, String use, double weight) {
		this.name = name;
		this.use = use;
		this.weight = weight;
	}
	public void showOff() {
		System.out.println("======printng weapons of god====");
		System.out.println("name : "+this.name);
		System.out.println("use : "+this.use);
		System.out.println("weight : "+this.weight);

	}

}
