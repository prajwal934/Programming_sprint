package com.sprint.one;

import java.util.Scanner;

public class CountVowelsConson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid String: ");
		String st = sc.nextLine();
		
		String v = "AEIOUaeiou";
		
		int vc=0 , cc= 0;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if(v.indexOf(ch) != -1)
				vc++;
			else
				cc++;
		}
		System.out.println("The number of Vowels: "+vc);
		System.out.println("The number of Consonats: "+cc);
	}
}
