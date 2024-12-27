package com.praj.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  write a java program to square the numbers and returns in the list using stream api
public class SquareNumber {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		
		List<Integer> squaredNumbers = num.stream().map(n -> n*n).collect(Collectors.toList());
		System.out.println("Squared of the numbers is: "+squaredNumbers);
	}
}
