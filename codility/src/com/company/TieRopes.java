package com.company;

import java.util.*;

public class TieRopes {


    public int tieRopes(int K, int[] A) {

        int currentLength=0;
        int ropes = 0;

        for (int i=0; i < A.length; i++) {
            currentLength+=A[i];
            if (currentLength>=K) {
                ropes++;
                currentLength=0;
            }

        }
        return ropes;
    }

    public static void main(String[] args) {
	    // write your code here
        TieRopes m = new TieRopes();


       // System.out.println(m.countDistinctSlices(6 , new int[] {1,2,3,4,5}));
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
        //System.out.println(m.fibFrog(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
     //   System.out.println(m.nailPlanks(new int[]{1,4,5,8},new int[]{4,5,9,10},new int[]{4,6,7,10,2}));
        //System.out.println(m.countDistinctSlices(6 , new int[] {3,4,5,5,2}));

      //  System.out.println(m.countTriangles( new int[] {10,2,5,1,8,12}));
        System.out.println(m.tieRopes( 4, new int[] {1,2,3,4,1,1,3}));
    }
}
