package com.xworkz.codingquestions.things;

import java.util.Scanner;

public class ReversingSingleWordInString {

	public static void main(String[] args) {

		String str = "Hands on learning happens here";
		String s[] = str.split(" ");

		String ref = "learning";
		System.out.println("entered  word is :" + ref);

		String name = "";

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(ref)) {
				char ch[] = ref.toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					name = name + ch[j];
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(ref)) {
				s[i] = name;
			}
		}
		System.out.println(name);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

}
