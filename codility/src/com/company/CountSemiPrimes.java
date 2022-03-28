package com.company;

import java.util.*;

public class CountSemiPrimes {


    public int[] countSemiPrimes(int N, int[] P, int[] Q) {
        boolean[] notPrimes = new boolean[N+1];
        for (int a=2; a <= N/2; a++) {
            for (int b=a*2; b<=N; b+=a) {
                notPrimes[b] = true;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int a=2; a <= N; a++) {
            if (!notPrimes[a]) {
                primes.add(a);
            }
        }
        int[] semiPrimes = new int[N+1];
        for (int a=0; a < primes.size()-1; a++) {
            for (int b=a;  b < primes.size()-1; b++) {
                int primea = primes.get(a);
                int primeb = primes.get(b);
                if ((long)primea*primeb >= semiPrimes.length) {
                    break;
                }
                semiPrimes[primea*primeb]= 1;
            }
        }
        int c = 0;
        for (int i=0; i < semiPrimes.length; i++) {
            c+=semiPrimes[i];
            semiPrimes[i]=c;
        }
        //return semiPrimes;
        int result[] = new int[P.length];
        for (int i=0; i < P.length; i++) {
            result[i]=semiPrimes[Q[i]] - semiPrimes[P[i]-1];
        }
        return result;
    }

    public static void main(String[] args) {
	    // write your code here
        CountSemiPrimes m = new CountSemiPrimes();

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
