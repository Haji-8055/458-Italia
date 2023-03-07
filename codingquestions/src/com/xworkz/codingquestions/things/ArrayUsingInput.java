package com.xworkz.codingquestions.things;

import java.util.Scanner;

public class ArrayUsingInput {

	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		
		int arr[]=new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ref.nextInt();
			System.out.println("entered "+arr[i]);
			
		}
		ref.close();
	}
	
	
	

}
