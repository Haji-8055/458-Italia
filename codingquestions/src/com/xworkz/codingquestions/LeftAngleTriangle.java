package com.xworkz.codingquestions;

public class LeftAngleTriangle {

	public static void main(String[] args) {

		int n=6;
		//main loop
		for(int i=0; i<=n;i++) {
			//printing space
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		int d=6;  
		//main loop
		for(int i=0; i<=d;i++) {
			//printing space
			for(int j=d-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
