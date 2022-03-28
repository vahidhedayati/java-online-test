package com.company;

import java.util.*;

public class MinMaxDivision {


    public int minMax(int K, int M, int[] A) {
        int min = 0;
        int max=0;
        for (int a: A) {
            max+=a;
            //maximum or highest value in array
            min = Math.max(min, a);
        }
        int bestAnswer = max;

        while (min<=max) {
            int mid = (min+max)/2;
            int blocks=checkBlocks(A, mid);
            if (blocks > K) {
                min = mid+1;
            } else {
                max = mid -1;
                if (mid < bestAnswer ) {
                    bestAnswer = mid;
                }
            }
        }
        return bestAnswer;

    }
    public int checkBlocks(int[] A, int guess) {
        int blocks=1;
        int blockSum =0;
        for (int a:A) {
            blockSum+=a;
            if (blockSum>guess) {
                blockSum=a;
                blocks++;
            }
        }
        return blocks;
    }

    public static void main(String[] args) {
	    // write your code here
        MinMaxDivision m = new MinMaxDivision();

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

 /*
        // countedDivisions
        int countedDivisions = m.countDiv(6,11,2);
        System.out.println(countedDivisions);

  */

 /*
        // genomicRange
        int[] result=m.genomicRange("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6});
        for (int i:result) {
            System.out.println(i);
        }
  */
/*
        // minAvgOfTwoSlices
        int minAvSlice = m.minAvgOfTwoSlices(new int[]{4,2,2,5,1,5,8});
        System.out.println("minAvgSlice"+ minAvSlice);
*/

/*
        // passingCars
        int passingCars = m.passingCars(new int[]{0,1,0,1,1});
        System.out.println("passingCars"+ passingCars);

 */


        //System.out.println(m.bracketStack("{[(]}"));
        //System.out.println(m.flagsOnPeaks(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}));
        //System.out.println(m.chocolateByNumbers(10,4));
        //System.out.println(m.commonPrimeDivisors(new int[]{15,10,9}, new int[] {75,30,5}));#
       // System.out.println(m.fibFrog(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
    }
}
