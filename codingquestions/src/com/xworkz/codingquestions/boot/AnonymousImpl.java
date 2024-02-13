package com.xworkz.codingquestions.boot;

public class AnonymousImpl implements Anonymous {

	public static void main(String[] args) {

		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println(100 + 100 + " xworkz");//200 xworkz
		System.out.println("E-Learning Company "+ 100 + 100);// output->E-Learning Company 100 100

		System.out.println("E-Learning Company "+ (100 + 100));// output->E-Learning Company 200
	}

	@Override
	public void run() {

		System.out.println();

	}

}
