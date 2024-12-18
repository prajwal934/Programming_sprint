package com.sprint.one;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid string: ");
		String st = sc.next();
		
//		 iterate through the string character by character
		int length= 0;
		
		for(char c: st.toCharArray()) {
			length++;
		}
		System.out.println("The length of the given string is: "+length);
	}
}
