package com.praj.java8;

import java.util.stream.Stream;

// generate the sum of the fibonacci sum using java 8
public class FibonnaciNum {
    public static void main(String[] args) {
//        int n = 10;
        int sum = Stream.iterate(new int[] {0,1}, fib -> new int[]{
                fib[1] , fib[0] + fib[1]
        }).limit(15).map(fib -> fib[0]).peek(System.out::println).reduce(0, Integer::sum);
        System.out.println("Sum of the first 10 fibonnaci numbers: "+sum);

    }
}
