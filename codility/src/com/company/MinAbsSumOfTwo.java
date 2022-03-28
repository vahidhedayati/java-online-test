package com.company;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    public int minAbsSumOfTwo(int[] A) {
        Arrays.sort(A);
        int startIndex=0;
        int endIndex = A.length-1;
        int minAbsSum=Integer.MAX_VALUE;

        while (startIndex < endIndex) {
            int absSum = Math.abs(A[startIndex] + A[endIndex]);
            if (absSum < minAbsSum) {
                minAbsSum = absSum;
            }
            if (Math.abs(A[startIndex]) > Math.abs(A[endIndex])) {
                startIndex++;
            } else {
                endIndex--;
            }
        }
        return minAbsSum;
    }

    public static void main(String[] args) {
	    // write your code here
        MinAbsSumOfTwo m = new MinAbsSumOfTwo();


        System.out.println(m.minAbsSumOfTwo( new int[] {-8,4,5,-10,3}));
    }
}
