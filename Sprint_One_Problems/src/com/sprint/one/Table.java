package com.sprint.one;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
//		Logic for the multiplication table
		for(int i=0;i<=10;i++) {
			System.out.println(n+" * "+i+ " = "+ (n*i));
		}
	}
}
