package com.xworkz.codingquestions;

public class InvertedTriangle {

	public static void main(String[] args) {


		int n=4;
		//main loop
		for(int i=n; i>=1;i--) {
			
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
		
	}

}
