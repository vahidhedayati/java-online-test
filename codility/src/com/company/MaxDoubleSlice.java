package com.company;

import java.util.*;

public class MaxDoubleSlice {


    public int maxDoubleSlice(int[] A) {
        int[] s = new int[A.length];
        int[] e = new int[A.length];
        for (int i=1; i < A.length-1; i++) {
            s[i] = Math.max(A[i],s[i-1]+A[i]);
        }
        for (int i=A.length-2; i >0; i--) {
            e[i]=Math.max(A[i], e[i+1]+A[i]);
        }
        int max=0;
        for (int i=1; i < A.length-1; i++) {
            max = Math.max(s[i-1]+e[i+1], max);
        }
        return max;
    }
    public static void main(String[] args) {
	    // write your code here
        MaxDoubleSlice m = new MaxDoubleSlice();



    }
}
