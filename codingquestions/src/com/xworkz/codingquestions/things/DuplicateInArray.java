package com.xworkz.codingquestions.things;

public class DuplicateInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 2, 7, 5, 8, 2, 5, 6, 6 };
		int ref = 1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == arr[ref]) {

				System.out.println(arr[i]);

			}

		}
		ref++;
	}

}
