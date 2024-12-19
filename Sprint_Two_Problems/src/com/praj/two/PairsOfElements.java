package com.praj.two;

public class PairsOfElements {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int target = 5;
		
		for(int i=0;i<nums.length;i++) {
			for(int j = i+1 ; j<nums.length;j++) {
				if(nums[i] + nums[j] == target) {
					 System.out.println("(Elements: "  + nums[i] + ", " + nums[j] + ")");
				}
			}
		}
	}

}
