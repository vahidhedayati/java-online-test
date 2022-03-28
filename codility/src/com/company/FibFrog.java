package com.company;

import java.util.ArrayList;
import java.util.List;

public class FibFrog {


    //--- END GCD
    List<Integer> fibNums;
    int[] A;
    int target;

    List<Integer> positions = new ArrayList<>();

    public int fibFrog(int[] A) {
        this.A=A;
        target=A.length;

        fibNums = new ArrayList<>();
        fibNums.add(A[0]);
        fibNums.add(A[1]);
        for (int i=0;;i++) {
            int nextFibNum=fibNums.get(i)+fibNums.get(i+1);
            if (nextFibNum <= A.length+1) {
                fibNums.add(nextFibNum);
            } else {
                break;
            }
        }

        int steps = 0;
        positions.add(-1);
        while (!positions.isEmpty()) {
            steps++;
            if (attemptJump()) {
                return steps;
            }
        }
        return -1;
    }
    public boolean attemptJump() {
        List<Integer> newPositions = new ArrayList<>();
        for (int position:positions) {
            for (int i=fibNums.size()-1; i>=2; i--) {
                int fibNum = fibNums.get(i);
                int newPosition =position+fibNum;
                if (newPosition ==target) {
                    return true;
                }
                if (position+fibNum<target) {
                    if (A[newPosition]==1) {
                        A[newPosition] = 0;
                        newPositions.add(newPosition);
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
	    // write your code here
        FibFrog m = new FibFrog();

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
        System.out.println(m.fibFrog(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
    }
}
