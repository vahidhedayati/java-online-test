package com.company;

public class MaxSliceSum {

    public int maxSliceSum(int[] A) {
        long sum = Integer.MIN_VALUE;
        long maxSum = Integer.MIN_VALUE;

        for (int a: A) {
            sum = Math.max(sum+a, a);
            maxSum = Math.max(sum, maxSum);
        }
        return (int)maxSum;
    }

    public static void main(String[] args) {
	    // write your code here
        MaxSliceSum m = new MaxSliceSum();

    }
}
