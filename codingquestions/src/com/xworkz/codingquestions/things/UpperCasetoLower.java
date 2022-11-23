package com.xworkz.codingquestions.things;

public class UpperCasetoLower {

	public static void main(String[] args) {

		System.out.println("\nupper to lower");

		String value = "SAYEDMURTUZA";
		System.out.println("Entered String " + value);

		char[] word = value.toCharArray(); // internally :word[]={'S','A','Y','E',D'};

		for (int i = 0; i < word.length; i++) {
			if (word[i] >= 'A' && word[i] <= 'Z') {
				word[i] = (char) ((int) word[i] + 32);
				System.out.print(word[i]);
			}
		}

		System.out.println("--> Converted String to lower case ");

		///////////////////////////////////////////////////////////

		System.out.println("\nlower to upper");
		String value1 = "sayedmurtuza";

		System.out.println("Entered String " + value1);

		char[] word1 = value1.toCharArray();

		for (int i = 0; i < word1.length; i++) {
			if (word1[i] >= 'a' && word1[i] <= 'z') {
				word1[i] = (char) ((int) word1[i] - 32);
				System.out.print(word1[i]);
			}
		}
		System.out.println("-->Converted String to upper case ");
	}
}
