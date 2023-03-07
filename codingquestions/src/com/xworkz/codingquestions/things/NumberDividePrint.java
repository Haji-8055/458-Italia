package com.xworkz.codingquestions.things;

public class NumberDividePrint {

	public static void main(String[] args) {

		int a = 16;
		int b = 4;
		int rem = a % b;

		for (int i = 1; i <= a - (rem); i++) {

			if (i % b == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}

		}
		while (rem >= 1) {
			System.out.print(0 + " ");
			rem--;
		}
	}

}
