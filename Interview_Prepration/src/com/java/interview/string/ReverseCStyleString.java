package com.java.interview.string;

import java.util.Stack;

/**
 * We are using Stacks in this case as we want LIFO that is Reverse of String.
 * 
 * @author Abhilasha
 *
 */
public class ReverseCStyleString {

	public static void main(String args[]) {

		String input = "Hello";
		System.out.println("Reversed String:" + reverseString(input));

	}

	public static String reverseString(String testString) {
		char[] charString = testString.toCharArray();
		Stack<Character> stack = new Stack<>();
		String outputString = null;

		// Iterate and push items to stack(LIFO ).
		for (int i = 0; i < testString.length(); i++) {
			char c = charString[i];
			stack.push(c);
		}
		// Pop out items from stack and print.
		while (!stack.isEmpty()) {
			System.out.println(stack.pop().toString());
		}

		return outputString;
	}

}
