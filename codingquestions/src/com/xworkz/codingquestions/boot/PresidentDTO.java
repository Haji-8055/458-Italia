package com.xworkz.codingquestions.boot;

public class PresidentDTO {
	
	
	private int id;
	private String name;
	
	public PresidentDTO() {
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
		return "PresidentDTO [id=" + id + ", name=" + name + "]";
	}

	public PresidentDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
