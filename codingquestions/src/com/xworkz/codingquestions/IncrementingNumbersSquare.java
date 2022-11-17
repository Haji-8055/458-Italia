package com.xworkz.codingquestions;

public class IncrementingNumbersSquare {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < 6; j++) {
				System.out.print(i + " ");
				if (j == 5) {
					System.out.print("H");
				}
			}

			System.out.println("");
		}

		System.out.println("print j values ");

		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < 6; j++) {
				System.out.print(j + " ");
				if (j == 5) {
					System.out.print("H");
				}
			}

			System.out.println();
		}

		System.out.println("================");
		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < 6; j++) {
				if (i == 2||i==4) {
					System.out.print("Haji ");
				}
				else {
					System.out.print(i + " ");

				}
			}

			System.out.println();
		}

	}

}