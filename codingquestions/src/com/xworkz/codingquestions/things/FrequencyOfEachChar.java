package com.xworkz.codingquestions.things;

public class FrequencyOfEachChar {

	static String word = "programming";
	static int count = 0;

	public static void main(String[] args) {

		char[] array = word.toCharArray();
		int ref = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] != ' ') {
					if (array[i] == array[j]) {
						ref = j;
						count++;
					}
				}
			}

			if (count >= 1) {
				System.out.println(array[i] + " : " + count);
				array[ref] = ' ';

			}
			count = 0;
		}
		
		System.out.println("=========================================================");
		
		 String name ="programming";
	        int [] intArray= new int[26];
	        char [] chArray=name.toCharArray();
	       
	        for(int i=0;i<chArray.length;i++)
	        {
	            intArray[chArray[i]-'a']++;
	        }
	        
	        for(int i=0;i<chArray.length;i++)
	        {
	            System.out.println(chArray[i]+" : "+intArray[chArray[i]-'a']);
	        }
	}
}
