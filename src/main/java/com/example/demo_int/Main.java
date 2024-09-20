package com.example.demo_int;

public class Main {
    public static void main(String[] args) {
        System.out.println("Max Stock");
        System.out.println("---------");
        System.out.println(maxProfit(new int[] {5, 9, 6, 2, 5, 1, 8}));
    }

    /*
    PROBLEM: Stock maximize

    You have an array for which the ith element is the price of a given stock on day i.
    If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
    */
    //bruteforce
    public static int maxProfit1(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int val = prices[i];
            for (int j = i; j < prices.length; j++) {
                if (profit < prices[j] - prices[i]) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;

    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

}