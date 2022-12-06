package com.xworkz.codingquestions.things;

public class RemoveWhiteSpace {

	public static void main(String[] args) {


		String remove = "Remove White Spaces";
		
		System.out.println(remove);
		
		System.out.println(System.lineSeparator());
		
		remove = remove.replaceAll(" ","");
		
		System.out.println("String after removing the all white spaces:"+remove);
		
	}

}
