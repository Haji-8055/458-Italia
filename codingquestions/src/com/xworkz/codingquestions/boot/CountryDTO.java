package com.xworkz.codingquestions.boot;

public class CountryDTO {
	
	
	private int id;
	private String name;
	
	public CountryDTO() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + "]";
	}

	public CountryDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	

}
