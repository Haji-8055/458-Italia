package com.xworkz.codingquestions.boot;

import com.xworkz.codingquestions.things.MathOperation;

public class MathOperationRunner {

	public static void main(String[] args) {

		MathOperation opt=new MathOperation();
		int finalValue=opt.operation("-", 7, 5);
		
		System.out.println(finalValue);
	
	}

}
