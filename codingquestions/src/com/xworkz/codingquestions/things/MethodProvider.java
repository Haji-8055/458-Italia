package com.xworkz.codingquestions.things;

public class MethodProvider {

	public void display() {
		display1();
		
		System.out.println("hgshb");//running method in CallingMethods class,to get StackOverFlowError
	}

	public void display1() {
		display();

		
	}
}
