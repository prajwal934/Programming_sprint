package com.praj.two;

// wajp to extract and sum of all numbers present in the given string
public class SumOfStringNumbers {

    public static void main(String[] args) {
        String input = "The numbers are 10 and 20";
        int s = extractNumSum(input);
        System.out.println("The Sum of  Extracted Numbers is: "+s);
    }
    public static int extractNumSum(String str) {
        int sum =0;
        String temp=""; //for storing the number

        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) {
//                 if characters are digit , stored in the temp
                temp += ch;
            } else {
//                If not , convert temp to number and find the sum
                if(!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
//         for the last digit if present
        if(!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
}
