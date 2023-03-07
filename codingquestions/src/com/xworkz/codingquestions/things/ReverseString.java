package com.xworkz.codingquestions.things;

public class ReverseString {

	public static void main(String[] args) {

		String originalString = "mom"
				+ "";
		String rev = "";

		char ch[] = originalString.toCharArray();

		for (int j = ch.length - 1; j >= 0; j--) {
			rev = rev + ch[j];

		}

		System.out.println("original string : " + originalString);
		System.out.println("reversed string : " + rev);

		if (originalString.equals(rev)) {
			System.out.println("the word is palindrome : " + originalString);
		} else
			System.out.println("the word is not palindrome : "+ originalString);

	}

}
