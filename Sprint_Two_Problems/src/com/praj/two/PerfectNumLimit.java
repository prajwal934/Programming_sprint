	package com.praj.two;
	
	import java.util.Scanner;
	
	public class PerfectNumLimit {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the limit: ");
			int n = sc.nextInt();
			
			int count = countPerfectNumbers(n);
			System.out.println("Number of perfect numbers up to " + n + ": " + count);
		}
	
		private static int countPerfectNumbers(int n) {
			// TODO Auto-generated method stub
			int count = 0;
	        for (int i = 2; i <= n; i++) {
	            if (isPerfectNumber(i)) {
	                count++;
	            }
	        }
	        return count;
		}

		private static boolean isPerfectNumber(int n) {
			// TODO Auto-generated method stub
			int sum = 0;
	        for (int i = 1; i <= n / 2; i++) {
	            if (n % i == 0) {
	                sum += i;
	            }
	        }
	        return sum == n;
	    }
	}
