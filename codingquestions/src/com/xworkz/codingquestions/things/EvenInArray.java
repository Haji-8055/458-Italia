package com.xworkz.codingquestions.things;

public class EvenInArray {

	public static void main(String[] args) {

		int[] numArray = { 2, 4, 5, 8, 12, 10, 20, 50, 40, 42, 15, 19, 6 ,3};
		int count = 0;

		System.out.println("total numbers in array "+numArray.length);
		
		System.out.println("printing even  numbers in array ");


		for (int i = 0; i < numArray.length; i++) {

			if (numArray[i] % 2 == 0) {
				count++;
				System.out.println(numArray[i]);

			}
		}
		System.out.println("even numbers in array "+count);

	}

}
