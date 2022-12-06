package com.haji.instance.constants;

public enum AllDatatypes {

	BIKE1(1000, "kawasaki"), BIKE2(600, "benelli");
	
	public int cc ; 
	public String name ;

	AllDatatypes(int cc, String name) {
         this.cc = cc ; 
         this.name=  name ; 
	}

	
}
