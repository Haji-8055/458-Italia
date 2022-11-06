package com.xworkz.encapsulation.things;

public class Shoe {

	String brand;
	double size;
	String type;
	String shoeCompanyLocation;
	boolean famous = true;
	String brandAmbassador = "Harrdy Sandhu";
	long shoeCompanyRevenue = 1256896l;
	// Re-initializing below in another class using setter method methods
	private String material;
	private String color;
	private String owner;
	private boolean comfort;
	private int price;
	private int validity;

	public Shoe(String brand, double size, String type, String shoeCompanyLocation, String material, String color,
			String owner, boolean comfort, int price, int validity) {
		this.brand = brand;
		this.size = size;
		this.type = type;
		this.shoeCompanyLocation = shoeCompanyLocation;
		this.material = material;
		this.color = color;
		this.owner = owner;
		this.comfort = comfort;
		this.price = price;
		this.validity = validity;
	}

	void setMaterial(String material) {
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	void setValidity(int validity) {
		this.validity = validity;
	}

	public int getValidity() {
		return validity;
	}

	void setComfort(boolean comfort) {
		this.comfort = comfort;
	}

	public boolean isComfort() {
		return comfort;
	}

}
