package com.xworkz.codingquestions.things;

public class NoOfCharInString {

	public static void main(String[] args) {

		String word = "sayedmurtuza";
		char letter = 'u';
		int count = 0;

		char[] arr = word.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == letter) {
				count++;

			}
		}

		System.out.println("the letter is present " + count + " times in the word");
	}

}
