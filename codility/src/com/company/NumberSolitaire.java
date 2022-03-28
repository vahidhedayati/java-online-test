package com.company;

public class NumberSolitaire {

    public int numberSolitaire(int[] A) {
        int[] r = new int[A.length];
        for (int i=0; i < r.length; i++) {
            if (i==0) {
                r[i] = A[i];
            } else {
                int maxOnThisSquare = Integer.MIN_VALUE;
                for (int j=1; j<=6; j++) {
                    if (i-j >=0) {
                        maxOnThisSquare = Math.max(maxOnThisSquare,r[i-j]+A[i]);
                    }
                }
                r[i]=maxOnThisSquare;
            }
        }
        return r[r.length-1];
    }
    public static void main(String[] args) {
	    // write your code here
        NumberSolitaire m = new NumberSolitaire();

        System.out.println(m.numberSolitaire( new int[] {1,-2,0,9,-1,-2}));
    }
}
