package practice.com.xworkz.practice.boot;

import practice.com.xworkz.practice.constants.ClassType;
import practice.com.xworkz.practice.constructor.First;

public class FirstRunner {

	public static void main(String[] args) {

		First first=new First();
		first.display();
		
		
		First first1=new First("plane ticket",5,ClassType.ECONOMICAL);
		first1.display();
		
		first1=new First("plane ticket",5,ClassType.SUPEBUSINESS);
		first1.display();

	}
	

}
