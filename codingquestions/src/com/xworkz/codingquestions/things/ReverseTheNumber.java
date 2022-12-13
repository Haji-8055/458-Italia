package com.xworkz.codingquestions.things;

public class ReverseTheNumber {

	public static void main(String[] args) {

		int number=58632;
		int rev=0;
		int reminder=0;
		System.out.println("entered number is  : "+number);

		
		while(number>0)
		{
			reminder=number%10;
			number=number/10;
			rev=(rev*10)+reminder;
			
		}

		System.out.println("reverse number is : "+rev);
		
	}

}
