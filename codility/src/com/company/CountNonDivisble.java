package com.company;

import java.util.HashMap;
import java.util.Map;

public class CountNonDivisble {

    //Similar to countFactors
    public int[] countNonDivisible(int[] A){

        Map<Integer,Integer> count = new HashMap<>();
        for (int a: A) {
            int c=0;
            if (count.containsKey(a)){
                c = count.get(0);
            }
            c++;
            count.put(a,c);
        }
        Map<Integer,Integer> divisorsCount = new HashMap<>();
        for (int n: count.keySet()) {
             int divisorCount = 0;
             for (int val=1;val <=Math.sqrt(n); val++) {
                 if (n % val == 0) {
                     if (count.containsKey(val)) {
                         divisorCount+=count.get(val);
                     }

                     if (val< Math.sqrt(n)) {
                         int opp = n / val;
                         if (count.containsKey(opp)) {
                             divisorCount += count.get(opp);
                         }
                     }
                 }
             }
             divisorsCount.put(n, divisorCount);
        }
        int[] nonDivisors = new int[A.length];
        for (int i=0; i < A.length; i++) {
            nonDivisors[i] = A.length - divisorsCount.get(A[i]);
        }
        return nonDivisors;
    }

    public static void main(String[] args) {
	    // write your code here
        CountNonDivisble m = new CountNonDivisble();

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



    }
}
