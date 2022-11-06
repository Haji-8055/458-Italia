package com.xworkz.encapsulation.things;

public class Engine {

	String name;
	String brand;
	String engineType;
	boolean isGood;
	int price;
	String types;
	private String model;
	private String mostlyUsed;
	private int pricesOfModel;
	private String buyer;
	private String supplier;

	public Engine(String name, String brand, String engineType, boolean isGood, int price, String types, String models,
			String mostlyUsed, int pricesOfModels, String buyers, String suppliers) {
		super();
		this.name = name;
		this.brand = brand;
		this.engineType = engineType;
		this.isGood = isGood;
		this.price = price;
		this.types = types;
		this.model = models;
		this.mostlyUsed = mostlyUsed;
		this.pricesOfModel = pricesOfModels;
		this.buyer = buyers;
		this.supplier = suppliers;
	}

	void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	void setMostlyUsed(String mostlyUsed) {
		this.mostlyUsed = mostlyUsed;
	}

	public String getMostlyUsed() {
		return mostlyUsed;
	}

	void setPricesOfModel(int pricesOfModel) {
		this.pricesOfModel = pricesOfModel;
	}

	public int getPricesOfModel() {
		return pricesOfModel;
	}

	void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getBuyer() {
		return buyer;
	}

	void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplier() {
		return supplier;
	}

}
