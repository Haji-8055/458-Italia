package com.xworkz.codingquestions.things;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 17;
		int count = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");

		}
		
		
		System.out.println("====using while loop====");
		int i = 23;
		
		int j = 2;
		int ch = 0;
		if (i <= 1) {
			ch = 1;
		}

		while (j <= i / 2) {
			if (i % j == 0) {
				ch = 1;
			} else {
				j++;
			}
		}

		if (ch == 0) {
			System.out.println(i + " is prime number");
		} else {
			System.out.println(i + " is not a prime number");
		}

	}

}
