package com.sprint.one;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vailid string: ");
		String st = sc.next();
		String str = reverseString(st);
		System.out.println("The reverse string is: "+ str);
	}

	public  static String reverseString(String st) {
		char[] ch = st.toCharArray();
		int f=0 , l=st.length() - 1;
		
		while(f < l) {
			char temp = ch[f];
			ch[f] = ch[l];
			ch[l] = temp;
			f++;
			l--;
		}
		st = new String(ch);
		return st;
	}
}
