package com.xworkz.codingquestions.things;

public class PalindromeNumber {

	public static void main(String[] args) {

		int givenNumber=6556;
		int ref=0;
		int reverse=0;
		int ref1=givenNumber;
		
		while(givenNumber>0)
		{
			ref=givenNumber%10;
			givenNumber=givenNumber/10;
			reverse=(reverse*10)+ref;
			
		}
		
		if(ref1==reverse)
		{
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
	}

}
