package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class LuckBalance {

    static int luckBalance(int k, int[][] contests) {
        int luck_balance = 0;

        //This is reversing using -1 * without -1 * it will be standard
        Arrays.sort(contests, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return -1 * Integer.compare(a[0],b[0]);
            }
        });
        for (int i=0; i < contests.length; i++) {
            int luck  = contests[i][0];
            int importance = contests[i][1];

            System.out.println ("Luck "+luck+" Importance "+importance);
            if (importance == 1 && k >0 ) {
                k--;
                luck_balance +=luck;
            } else if (importance == 1 && k ==0) {
                luck_balance -= luck;
            }

            if (importance==0) {
                luck_balance += luck;
            }
        }
        return luck_balance;
    }

}
