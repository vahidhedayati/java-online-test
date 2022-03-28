package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

    public int missingNumber(int[] A) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i=1; i <=A.length+1;i++) {
            numbers.add(i);
        }
        for (int a : A) {
            numbers.remove(new Integer(a));
        }
        return numbers.iterator().next();
    }
    
    //More efficient than above
    public int missingNumber2(int[] A) {
        int result=1;
        Arrays.sort(A);
        int lastNumber =  A[A.length-1];
        if (lastNumber>=1) {
            for (int i=1; i< A.length; i++) {
                result++;
                if (A[i]!=result) {
                    break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
	    // write your code here
        MissingNumber m = new MissingNumber();
        System.out.println( m.missingNumber(new int [] {1,2,3,4,6}));
        System.out.println( m.missingNumber2(new int [] {1,2,3,4,6}));
        System.out.println( m.missingNumber(new int [] {-1,-2}));
        System.out.println( m.missingNumber2(new int [] {-1,-2}));
        System.out.println( m.missingNumber(new int [] {1,2,3,5,7}));
        System.out.println( m.missingNumber2(new int [] {1,2,3,5,7}));

    }
}
