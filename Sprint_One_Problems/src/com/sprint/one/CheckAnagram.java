package com.sprint.one;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the second String");
		String s2 = sc.nextLine();
		boolean rs = isAnagram(s1, s2);
		if(rs == true)
			System.out.println("yes, It's an Anagram");
		else
			System.out.println("No, It's not an Anagram");
	}

	private static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll(" ", " ");
		s2 = s2.replaceAll(" ", " ");
		
		if(s1.length() != s2.length())
			return false;
		
		s1= s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		s1 = new String(c1);
		s2 = new String(c2);
		return s1.equals(s2);
	}
}
