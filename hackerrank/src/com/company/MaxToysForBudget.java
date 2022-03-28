package com.company;

import java.util.Arrays;

public class MaxToysForBudget {

    static int maxAmountOfToys(int[] prices, int budget) {
        int maxToys = 0;
        if (prices.length==0|budget==0) return maxToys;

        Arrays.sort(prices);

        for (int i=0; i < prices.length; i++) {
            if (budget>=0) {
               // budget = budget - prices[i];
                budget -= prices[i];
                maxToys++;
            }
            //Or
            //    budget -= prices[i];
            //    if (budget <0) return maxToys;
            //    maxToys++;

        }
        return maxToys;
    }
}
