package com.company;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

    public int equileader(int[] A) {
        int dominator =0;
        int dominatorCount=0;
        Map<Integer,Integer> counters = new HashMap<>();
        for (int i=0; i < A.length; i++) {
            int a=A[i];
            if (!counters.containsKey(a)) {
                counters.put(a,1);
            } else {
                counters.put(a, counters.get(a)+1);
            }
            if (counters.get(a)> A.length/2) {
                dominator=a;
                dominatorCount=counters.get(a);
            }
        }
        int equiLeader =0;
        int leadersInRightSide=dominatorCount;
        int countRightSide=A.length;
        int leadersOnLeftSide=0;
        int countLeftSide=0;
        for (int i=0; i < A.length; i++) {
            if (A[i]==dominator) {
                leadersInRightSide--;
                leadersOnLeftSide++;
            }
            countLeftSide++;
            countRightSide--;
            if (leadersOnLeftSide > countLeftSide/2) {
                if (leadersInRightSide > countRightSide/2) {
                    equiLeader++;
                }

            }

        }
        return equiLeader;
    }

    public static void main(String[] args) {
	    // write your code here
        EquiLeader m = new EquiLeader();

    }
}
