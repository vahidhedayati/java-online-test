package com.company;

import java.util.HashSet;

public class OddOccurance {

    HashSet<Integer> aList= new HashSet<Integer>();


    public int oddOccurance(int[] A) {
        for (int i=0; i < A.length; i++) {
            int a = A[i];
            if (aList.contains(a)) {
                aList.remove(new Integer(a));
            } else{
                aList.add(a);
            }
        }
        return aList.iterator().next();
    }

    public int oddOccurance2(int[] A) {
        int nonDuplicate = 0;
        for (int i = 0; i < A.length; i++) {
            nonDuplicate ^= A[i];
        }
        return nonDuplicate;
    }

    public static void main(String[] args) {
	    // write your code here
        OddOccurance m = new OddOccurance();

        //oddOccurance
        System.out.println(m.oddOccurance(new int[] {3,8,3,8,9,7,9,7,6}));
        System.out.println(m.oddOccurance2(new int[] {3,8,3,8,9,7,9,7,6}));



    }
}
