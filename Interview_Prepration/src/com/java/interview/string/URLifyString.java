package com.java.interview.string;

/**
 * Input - I am girl Length - 9 Output - I%20am%20girl new Length - 13 Approach
 * 
 * @author Abhilasha
 *
 */
public class URLifyString {

	public static void main(String args[]) {
		String input = "I am girl";
		System.out.println("Output String : " + replaceSpaces(input, input.length()));

	}

	public static String replaceSpaces(String input, int length) {

		int spaceCount = 0;
		for (int i = 0; i < length; i++) {
			if (input.charAt(i) == ' ') {
				spaceCount++;
			}
		}

		int newLength = length + 2 * spaceCount;
		char[] newCharArr = new char[newLength];

		for (int i = length - 1; i >= 0; i--) {
			if (input.charAt(i) == ' ') {
				newCharArr[newLength - 1] = '0';
				newCharArr[newLength - 2] = '2';
				newCharArr[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				newCharArr[newLength - 1] = input.charAt(i);
				newLength--;
			}
		}

		return (String.valueOf(newCharArr));

	}
}
