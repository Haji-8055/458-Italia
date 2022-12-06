package com.xworkz.codingquestions.things;

public class VowelsAndConsonant {

	public static void main(String[] args) {


			String name = "checking for vowels and consonants ";
			int vowelCount = 0,consonantCount = 0;
			 name = name.toLowerCase();
			 for(int  i=0;i<name.length();i++)
			 {
				 if(name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u')
				 {
					 vowelCount++;
				 }
				 else
					 if(name.charAt(i)>='a'&&name.charAt(i)<='z')
					 {
						 consonantCount++;
					 }
			 }
			 System.out.println("Vowels:"+vowelCount);
			 System.out.println("consonants:"+consonantCount);	
		}
	}


