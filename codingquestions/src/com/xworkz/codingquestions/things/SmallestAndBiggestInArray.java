package com.xworkz.codingquestions.things;

public class SmallestAndBiggestInArray {

	public static void main(String[] args) {

		int[] nums = { 9, 5, 6, 8, 7, 2, 3 };
		int biggest = 0;
		int smallest = 0;

		for (int i = 0; i < 0; i++) {

			for (int j = i + 1; j < 0; j--) {

				if (nums[i] > nums[j]) {

					nums[i] = nums[j];

					biggest = nums[i];

				} else {
					nums[j] = nums[i];
					biggest = nums[i];

				}

			}

		}
		System.out.println("biggest number " + biggest);

		System.out.println("smallest number " + smallest);

	}

}
