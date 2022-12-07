package com.xworkz.codingquestions.things;

public class DefaultValues {
	static byte age;
	static short rollNumber;
	static int usn;
	static long mobileNumber;
	static float percentage;
	static double price;
	static char divison;
	static boolean isPassed;

	static String num = "65";
	static int num2 = 20;

	static int sum = num2 + Integer.parseInt(num); // wrapper class

	public static void main(String[] args) {

		System.out.println(sum);
		System.out.println("byte  default value : " + age);
		System.out.println("short default value : " + rollNumber);
		System.out.println("int default value : " + mobileNumber);
		System.out.println("long default value : " + usn);
		System.out.println("float default value : " + percentage);
		System.out.println("double default value : " + price);
		System.out.println("char default value : " + divison);
		System.out.println("boolean default value : " + isPassed);

	}

}
