package com.company;

import java.util.*;

public class CountTriangles {

    public int countTriangles(int[] A) {
        Arrays.sort(A);
        int triangles=0;
        for (int catBack=0; catBack < A.length-2; catBack++) {
            int catFront = catBack +2;
            for (int m = catBack+1; m < A.length-1; m++) {
                while (catFront < A.length && A[catBack] + A[m] > A[catFront]) {
                    catFront++;
                }
                triangles += catFront - m - 1;
            }
        }
        return triangles;
    }

    public static void main(String[] args) {
	    // write your code here
        CountTriangles m = new CountTriangles();

        System.out.println(m.countTriangles( new int[] {10,2,5,1,8,12}));
    }
}
