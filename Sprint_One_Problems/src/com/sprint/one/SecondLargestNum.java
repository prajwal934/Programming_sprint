package com.sprint.one;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] arr = {13,42,45,23,12,90};
		int sLag = getSecondLargest(arr);
		System.out.println("The Second largest number is: "+sLag);
	}

	 private static int getSecondLargest(int[] arr) {
	        int fLarge = Integer.MIN_VALUE;
	        int sLarge = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > fLarge) {
	                sLarge = fLarge;  // Update second largest before updating first largest
	                fLarge = arr[i];  // Update first largest
	            } else if (arr[i] > sLarge && arr[i] != fLarge) {
	                sLarge = arr[i];  // Update second largest
	            }
	        }

	        return sLarge;
	    }
}
