package com.company;

import java.util.ArrayList;
import java.util.List;

public class FlagPeaks {


    public int flagsOnPeaks(int[] A) {
        List<Integer> peaks = new ArrayList<>();
        for (int i=1; i < A.length-1; i++) {
            if (A[i-1] < A[i]) {
                if (A[i+1] < A[i]) {
                    peaks.add(i);
                }
            }
        }
        if (peaks.size()<=1) {
            return peaks.size();
        }
        int maxFlags = (int)Math.ceil(Math.sqrt(peaks.get(peaks.size()-1)-peaks.get(0)));

        for (int flags = maxFlags; flags> 1; flags--) {
            int startIndex = 0;
            int endIndex = peaks.size()-1;

            int startFlag = peaks.get(startIndex);
            int endFlag = peaks.get(endIndex);

            int flagsPlaced = 2;
            while (startIndex < endIndex) {
                startIndex++;
                endIndex--;
                if (peaks.get(startIndex) >= startFlag+flags) {
                    if (peaks.get(startIndex) <= endFlag-flags) {
                        flagsPlaced++;
                        startFlag = peaks.get(startIndex);
                    }

                }
                if (peaks.get(endIndex) >= startFlag+flags) {
                    if (peaks.get(endIndex) <= endFlag - flags) {
                        flagsPlaced++;
                        endFlag = peaks.get(endIndex);
                    }
                }
                if (flagsPlaced == flags) {
                    return flags;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
	    // write your code here
        FlagPeaks m = new FlagPeaks();

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
        System.out.println(m.flagsOnPeaks(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}));
    }
}
