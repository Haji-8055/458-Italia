package com.xworkz.task.constructor;

public class Chain {

	public String type;
	public int price;
	public double length;
	public String material;
	public double weight;
	public boolean isStolen;
	public String usedFor;
	public boolean isFresh;

	public Chain() {//default

	}

	public Chain(String type, int price, double length, String material, double weight, boolean isStolen,
			String usedFor, boolean isFresh) {
		this(type, price, length, material, weight, isStolen, usedFor);
		this.isFresh = isFresh;

	}

	public Chain(String type, int price, double length, String material, double weight, boolean isStolen,
			String usedFor) {
		this(type, price, length, material, weight, isStolen);
		this.usedFor = usedFor;

	}

	public Chain(String type, int price, double length, String material, double weight, boolean isStolen) {
		this(type, price, length, material, weight);
		this.isStolen = isStolen;

	}

	public Chain(String type, int price, double length, String material, double weight) {
		this(type, price, length, material);
		this.weight = weight;

	}

	public Chain(String type, int price, double length, String material) {
		this(type, price, length);
		this.material = material;

	}

	public Chain(String type, int price, double length) {
		this(type, price);
		this.length = length;

	}
	
	public Chain(String type, int price) {
		this(type);
		this.price = price;

	}
	
	public Chain(String type) {
		this();
		this.type = type;

	}

}
