package com.company;

import java.util.HashSet;

public class DistinctValues {


    public int distinctValues(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for (int a: A) {
            //if (!hs.contains((Integer)a)) {
                hs.add(a);
            //}
        }
        return hs.size();
    }
    public static void main(String[] args) {
	    // write your code here
        DistinctValues m = new DistinctValues();
        System.out.println(m.distinctValues(new int[] {2,4,5,5,3}));
    }
}
