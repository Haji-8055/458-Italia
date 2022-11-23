package com.xworkz.codingquestions.things;

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

		System.out.println("printing j values ");

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
		/*output for each for loop
		 *
1 1 1 1 1 H
2 2 2 2 2 H
3 3 3 3 3 H
4 4 4 4 4 H
5 5 5 5 5 H
printing j values 
1 2 3 4 5 H
1 2 3 4 5 H
1 2 3 4 5 H
1 2 3 4 5 H
1 2 3 4 5 H
================
1 1 1 1 1 
Haji Haji Haji Haji Haji 
3 3 3 3 3 
Haji Haji Haji Haji Haji 
5 5 5 5 5 
 */

	}

}