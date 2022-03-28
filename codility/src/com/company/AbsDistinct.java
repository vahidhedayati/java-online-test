package com.company;

import java.util.HashSet;

public class AbsDistinct {



    public int absDistinct(int[] A) {
        HashSet<Long> distinctValues = new HashSet<>();
        //int count =0;
        for (int a:A) {
            if (!distinctValues.contains(Math.abs((long)a))) {
                distinctValues.add(Math.abs((long)a));
                //count++;
            }
        }
        return distinctValues.size();
    }
    public static void main(String[] args) {
	    // write your code here
        AbsDistinct m = new AbsDistinct();
;
    }
}
