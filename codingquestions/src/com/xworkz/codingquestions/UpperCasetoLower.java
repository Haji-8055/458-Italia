package com.xworkz.codingquestions;

public class UpperCasetoLower {

	public static void main(String[] args) {

		System.out.println("\nupper to lower");
		String value = "SAYEDMURTUZA";

		char[] word = value.toCharArray();

		for (int i = 0; i < word.length; i++) {
			if (word[i] >= 'A' && word[i] <= 'Z') {
				word[i] = (char) ((int) word[i] + 32);
			}

		}

		System.out.println("String in lower case is:");
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
		
		
		//////////////////////////////////////

		System.out.println("\nlower to upper");
		String value1 = "sayedmurtuza";

		char[] word1 = value1.toCharArray();

		for (int i = 0; i < word1.length; i++) {
			if (word1[i] >= 'a' && word1[i] <= 'z') {
				word1[i] = (char) ((int) word1[i] - 32);
			}

		}

		System.out.println("String in upper case is:");
		for (int i = 0; i < word1.length; i++) {
			System.out.print(word1[i]);
		}

	}

}
