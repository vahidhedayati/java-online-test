package com.company;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

    public int peaks(int[] A) {
        if (A.length<3) {
            return 0;
        }
        List<Integer> peaks = new ArrayList<>();
        for (int i=1; i < A.length-1; i++) {
            if (A[i - 1] < A[i] && A[i+1] < A[i]) {
                peaks.add(i);
            }
        }
        if (peaks.size()==0) {
            return 0;
        }
        for (int blockLength=3; blockLength <= A.length/2; blockLength++) {
            if (A.length % blockLength !=0) {
                continue;
            }
            int currentPeak = 0;
            boolean ok=true;
            for (int blockStart=0; blockStart< A.length; blockStart+=blockLength) {
                boolean foundPeak = false;

                while (currentPeak<peaks.size()) {
                    if (peaks.get(currentPeak) < blockStart+blockLength) {
                        foundPeak = true;
                        currentPeak++;
                    } else if (peaks.get(currentPeak)>=blockStart+blockLength) {
                        break;
                    }
                }
                if (!foundPeak) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return A.length / blockLength;
            }
        }
         return 1;
    }
    
    public static void main(String[] args) {
	    // write your code here
        Peaks m = new Peaks();

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
   //     System.out.println(m.flagsOnPeaks(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}));
    }
}
