package com.xworkz.codingquestions.things;

public class MathOperation {

	public int operation(String operation, int value1, int value2) {
		
		if (operation == "+") {
			return value1 + value2;
		}

		if (operation == "-") {
			return value1 - value2;
		}

		if (operation == "*") {
			return value1 * value2;
		}

		if (operation == "/") {
			return value1 / value2;
		}
		return 0;

	}

	public static void main(String[] args) {

		MathOperation opt = new MathOperation();
		
		int finalValue = opt.operation("-", 7, 5);

		System.out.println("after performing operation final value :" + finalValue);

	}

}
