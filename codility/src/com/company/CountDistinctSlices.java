package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class CountDistinctSlices {

    HashSet<Integer> caterpillar = new HashSet<>();
    int catFront=0;
    int catRear=0;
    int[] A;
    public int countDistinctSlices(int M, int[] A) {
        this.A=A;
        int count =0;
        while (A.length > catFront || A.length > catRear) {
            if (A.length > catFront && !caterpillar.contains(A[catFront])) {
                moveHeadForward();
                outputCat(">");
                count += caterpillar.size();
                if (count >100000000) {
                    return 1000000000;
                }
            } else {
                moveTailForward();
                outputCat("<");
            }
        }
        return count;
    }
    public void moveHeadForward() {
        caterpillar.add(A[catFront]);
        catFront++;
    }

    public void moveTailForward() {
        caterpillar.remove(A[catRear]);
        catRear++;
    }
    public void outputCat(String dir) {
        Iterator<Integer> iCat = caterpillar.iterator();
        String s=dir;
        while (iCat.hasNext()) {
            s +=iCat.next()+" : ";
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
	    // write your code here
        CountDistinctSlices m = new CountDistinctSlices();

        System.out.println(m.countDistinctSlices(6 , new int[] {3,4,5,5,2}));

    }
}
