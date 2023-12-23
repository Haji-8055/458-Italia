package com.xworkz.codingquestions.boot;

public class BikeDTO implements Cloneable {
	
	private int bikeNo;
	private String name;
	private String colour;
	
	@Override
	public BikeDTO clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (BikeDTO) super.clone();
	}
	
	
	@Override
	public String toString() {
		return "BikeDTO [bikeNo=" + bikeNo + ", name=" + name + ", colour=" + colour + "]";
	}
	
	
	
	public BikeDTO(int bikeNo, String name, String colour) {
		super();
		this.bikeNo = bikeNo;
		this.name = name;
		this.colour = colour;
	}



	public int getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	

}
