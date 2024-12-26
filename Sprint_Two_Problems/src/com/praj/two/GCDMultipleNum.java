package com.praj.two;

public class GCDMultipleNum {

	public static void main(String[] args) {
		int[] n = {12, 24, 36};
		int gcd = findGCD(n);
		
		System.out.println("The GCD of the given array is: "+gcd);
	}

	private static int findGCD(int[] n) {
		// TODO Auto-generated method stub
		int result = n[0];
		for(int i=0;i<n.length;i++) {
			result = gcd(result, n[i]);
			
//			if GCD becomes 1, then return 1;
			if(result == 1)
				return 1;
		}
		return result;
	}

//	 It's for calculate two numbers
	private static int gcd(int result, int i) {
		// TODO Auto-generated method stub
		if(i == 0) {
			return result;
		}
		return gcd(i , result % i);
	}
}
