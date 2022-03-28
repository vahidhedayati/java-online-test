package com.company;

public class MaxCounters {


    public int[] maxCounters(int N, int[] A) {
        int minValue = 0;
        int maxValue = 0;
        int[] counters = new int[N];

        for (int i=0; i < A.length; i++) {
            int current = A[i];
            if (current == N+1) {
                minValue = maxValue;
            } else {
                current--;
                counters[current]=Math.max(counters[current]+1,minValue+1);
                maxValue = Math.max(maxValue,counters[current]);
            }

        }
        for (int i=0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], minValue);
        }

        return counters;
    }

    public static void main(String[] args) {
	    // write your code here
        MaxCounters m = new MaxCounters();

        /*
        //Missing number
        System.out.println( m.missingNumber(new int [] {1,2,3,4,6}));
        System.out.println( m.missingNumber2(new int [] {1,2,3,4,6}));
        System.out.println( m.missingNumber(new int [] {-1,-2}));
        System.out.println( m.missingNumber2(new int [] {-1,-2}));
        System.out.println( m.missingNumber(new int [] {1,2,3,5,7}));
        System.out.println( m.missingNumber2(new int [] {1,2,3,5,7}));
        */

        /*
        //binaryGap
        System.out.println(m.binaryGap(542));
        System.out.println(m.binaryGap2(542));

         */

        /*
        //cyclicRotation
        int[] result = m.cyclicRotation(new int[] {3,8,9,7,6}, 3);
        for (int i: result) {
            System.out.print(i+" ");
        }
        */


       /*
        //oddOccurance
        System.out.println(m.oddOccurance(new int[] {3,8,3,8,9,7,9,7,6}));
        System.out.println(m.oddOccurance2(new int[] {3,8,3,8,9,7,9,7,6}));
        */


         /*
        //frogJump
        System.out.println(m.frogJump(10,85,30));
        m.frogJump2(10,85,30);
        //System.out.println();

       */

        /*
        // permMissingElement
            System.out.println(m.permMissingElement(new int[] {1,2,3,5}));
         */

    }
}
