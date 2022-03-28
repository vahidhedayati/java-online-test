package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class CyclicRotation {

    public int[] cyclicRotation(int[] A, int K) {
        if (A.length==0||A.length==K) {
            return A;
        }
        for (int i=0; i<K; i++) {
            int lastValue = A[A.length-1];
            for (int j=A.length-2; j>=0; j--) {
               // System.out.println("A "+(j+1)+"= "+j+"="+A[j] );
                A[j+1] = A[j];
            }
            A[0]=lastValue;

        }
        return A;
    }
    public static void main(String[] args) {
	    // write your code here
        CyclicRotation m = new CyclicRotation();



        int[] result = m.cyclicRotation(new int[] {3,8,9,7,6}, 3);
        for (int i: result) {
            System.out.print(i+" ");
        }


    }
}
