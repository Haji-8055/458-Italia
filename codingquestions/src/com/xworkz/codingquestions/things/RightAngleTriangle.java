package com.xworkz.codingquestions.things;

public class RightAngleTriangle {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {

			for (int j = 3; j <= i; j++) {
				System.out.print(" @ ");
			}

			System.out.println("");
		}


	System.out.println("=====================");

		for (int i = 0; i < 6; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print(" @ ");
			}

			System.out.println();
		}

	}

}
/* @  @  @ 
   @  @ 
   @  
 */

