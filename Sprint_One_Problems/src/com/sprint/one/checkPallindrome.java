package com.sprint.one;

import java.util.Scanner;

public class checkPallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String or a Number: ");
		String st = sc.next();
		boolean rs = isPallindrome(st);
		if(rs == true) 
			System.out.println("It's a Pallindrome!");
		else 
			System.out.println("It,s not Pallindrome!");
	}

	public  static boolean isPallindrome(String st) {
		int f=0, l= st.length()-1;
		while(f < l) {
			if(st.charAt(f) != st.charAt(l))
				return false;
			f++;
			l--;
		}
		return true;
	}
}
