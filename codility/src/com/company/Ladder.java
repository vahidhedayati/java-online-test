package com.company;

public class Ladder {


    public int[] ladder(int[] A, int[] B) {
        int[] result = new int[A.length];

        int[] fibs = new int[A.length+1];
        fibs[0] = 1;
        fibs[1] = 1;
        for (int i=2; i < A.length; i++) {
            fibs[i] = (fibs[i-2] + fibs[i=1]) % (int)Math.pow(2,30);
        }
        for (int i=0; i< A.length;i++) {
            int m = (int)Math.pow(2,B[i]);
            result[i] = fibs[A[i]] %m;
        }
        return result;
    }


    public static void main(String[] args) {
	    // write your code here
        Ladder m = new Ladder();

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
   //     System.out.println(m.fibFrog(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
    }
}
