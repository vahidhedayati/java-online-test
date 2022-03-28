package com.company;

import java.util.HashSet;
import java.util.Set;

public class CountPairs {

    static int sockMerchant(int n, int[] ar) {
        int num_of_pairs = 0;
        if (ar.length == 0) return num_of_pairs;
        Set<Integer> set = new HashSet();
        for (int i=0; i < ar.length; i++) {
            if (!set.contains(ar[i])) {
                set.add(ar[i]);
            } else {
                num_of_pairs++;
                set.remove(ar[i]);
            }
        }
        return num_of_pairs;
    }

}
