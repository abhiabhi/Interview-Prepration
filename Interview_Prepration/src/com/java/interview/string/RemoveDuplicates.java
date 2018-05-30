package com.java.interview.string;

/**
 * Program to remove duplicates from a given String. 
 * Time Complexity of the below program is O(n)
 * 
 * @author Abhilasha
 *
 */
public class RemoveDuplicates {
	public static void main(String args[]) {
		String input = "Helloabccc";
		System.out.println("Output after removing Duplicates : " + removeDuplicate(input));
	}

	private static String removeDuplicate(String input) {

		String output = "";
		// check if input if not null
		if (null != input) {
			boolean[] duplicateCheck = new boolean[256]; // default value in array would be false;
			char[] strArray = input.toCharArray();
			for (int i = 0; i < input.length(); i++) {
				int asciiValue = strArray[i]; // would return ASCII value of the character. {A=65, a=97}
				if (!duplicateCheck[asciiValue]) {
					duplicateCheck[asciiValue] = true;
					output = output + strArray[i];
				}
			}
		}
		return output;
	}
         
}
