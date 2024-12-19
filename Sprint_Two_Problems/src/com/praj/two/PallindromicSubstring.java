package com.praj.two;

public class PallindromicSubstring {

	public static void main(String[] args) {
		String input = "aaa";
		int count = countPallindromicSubstring(input);
		System.out.println("Number of Pallindromic Substring: "+count);
	}

	private static int countPallindromicSubstring(String s) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<s.length();i++) {
			count += countCenters(s , i,i);
			count += countCenters(s , i , i+1);
		}
		
		return count;
	}

	private static int countCenters(String s, int left, int right) {
		// TODO Auto-generated method stub
		int count =0;
		
		while(left >=0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
			count++;
			left--;
			right++;
		}
		return count;
	}
}
