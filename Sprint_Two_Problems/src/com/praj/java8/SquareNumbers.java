package com.praj.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// write a java program to find the square of the numbers present in the array element by using java 8
public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4);
        List<Integer> squaredNum =arr.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("The Squared numbers are: "+ squaredNum);
    }
}
