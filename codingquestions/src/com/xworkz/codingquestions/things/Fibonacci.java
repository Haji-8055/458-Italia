package com.xworkz.codingquestions.things;

public class Fibonacci {

	public static void main(String[] args) {

		int firstFibonacci = 0;
		int secondFibonacci = 1;
		System.out.println("0 fibonacci "+firstFibonacci);
		System.out.println("1 fibonacci "+secondFibonacci);



		int fibonacci;

		for (int i = 2; i < 9; i++) {

			fibonacci = firstFibonacci + secondFibonacci;
			
			System.out.println(i + " fibonacci " + fibonacci);

			firstFibonacci = secondFibonacci;
			secondFibonacci = fibonacci;

		}
	}

}
