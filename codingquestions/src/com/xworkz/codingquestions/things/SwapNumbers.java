package com.xworkz.codingquestions.things;

public class SwapNumbers {

	public static void main(String[] args) {

		//using third variable
		int a=20;
		int b=5;
		int temp=0;
		System.out.println("before swapping value of a :"+a +" and b :"+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping value of a :"+a +" and b :"+b);

		
		
		
		//without using third variable
		System.out.println(System.lineSeparator());
		int c=18;
		int d=7;
		System.out.println("before swapping value of c :"+c +" and d :"+d);

		c=c+d;// c=18+7-->25
		d=c-d; //d=25-7-->18
		c=c-d;  //c=25-18-->7
		System.out.println("after swapping value of c :"+c +" and d :"+d);

		
		
		


		
	}

}
