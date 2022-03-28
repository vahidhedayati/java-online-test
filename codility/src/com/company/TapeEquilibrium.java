package com.company;

public class TapeEquilibrium {


    public int equilibrium(int[] A) {
            int numbersOnRight = 0;
            for (int i=0; i < A.length; i++) {
                numbersOnRight +=A[i];
            }
            int minDiff = Integer.MAX_VALUE;
            int numberOnLeft=0;
            for (int i=0; i < A.length-1; i++) {
                numbersOnRight -= A[i];
                numberOnLeft +=A[i];
                if (Math.abs(numberOnLeft - numbersOnRight) < minDiff) {
                    minDiff = Math.abs(numberOnLeft- numbersOnRight);
                }
            }
            return minDiff;
    }
    public static void main(String[] args) {
	    // write your code here
        TapeEquilibrium m = new TapeEquilibrium();

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
