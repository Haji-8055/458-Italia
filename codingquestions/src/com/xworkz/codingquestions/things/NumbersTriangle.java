package com.xworkz.codingquestions.things;

public class NumbersTriangle {

	public static void main(String[] args) {

		int d = 6;
		// main loop
		for (int i = 1; i <= d; i++) {
			// printing space
			for (int j = d - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (i == 2) {
					System.out.print("haji");
				} else {
					System.out.print(i);

				}
			}
			System.out.println();
		}

		// main loop
		for (int i = 0; i <= d; i++) {
			// printing space
			for (int j = d - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print("haji");
				} else {
					System.out.print(k);
				}
			}
			System.out.println();
		}
		
		System.out.println("\n====printing j====");
		for (int i = 0; i <= d; i++) {
			// printing space
			for (int j = d - 1; j >= i; j--) {
				if (j == 2) {
					System.out.println("haji");
				} else
					System.out.print(j);
			}
	}

}
}
