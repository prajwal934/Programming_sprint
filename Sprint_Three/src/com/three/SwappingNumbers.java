package com.three;

import java.lang.annotation.RetentionPolicy;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 10 , b= 20;
//
        a = a  + b;
        b= a - b;
        a = a - b;

        System.out.println("After swapping the numbers: "+ a + " ,b = " + b);

//
//        @Rentention(RetentionPolicy.RUNTIME)
//        @Target(ElementType.METHOD)
////         public @Interface LogExecutionTime {
////         }
////        public class MySolution {
//        @LogExecutionTime
//                public void process() {
//            System.out.println("The Solution is processing ");
//        }
//
//        public void anotherMethod() {
//            System.out.println("Without annotation");
//        }
////        }
//
////         second hihest salary
//
//        SELECT DISTINCT salary FROM emp ORDER BY salary DESC LIMIT 1 OFFSET 1


    }
}
