package com.dsa;
//
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class BuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("The Maximum profit is: "+maxProfit(prices));
    }
    public static int maxProfit(int[] num) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : num) {
            if(price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return  maxProfit;
    }
}
