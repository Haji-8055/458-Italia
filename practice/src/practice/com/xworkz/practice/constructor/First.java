package practice.com.xworkz.practice.constructor;

import practice.com.xworkz.practice.constants.ClassType;

public class First {

	public  String bookingType;
	public int noOfSeats;
	public ClassType seat;
	
	public First() {
	}
	
	public First(String a,int b,ClassType c)
	{
		bookingType=a;
		noOfSeats=b;
		seat=c;	
		
	}
	
	public void display()
	{
		System.out.println(bookingType);
		System.out.println(noOfSeats);
		System.out.println(seat);
	}
	
}
