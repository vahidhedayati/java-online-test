package com.company;

import java.util.*;

public class NailPlanks {


    class Nail implements Comparable<Nail>{

        int index;
        int value;

        public Nail(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Nail{" +
                    "index=" + index +
                    ", value=" + value +
                    '}';
        }

        @Override
        public int compareTo(Nail nail) {
            return value - nail.value;
        }
    }
    class Plank implements Comparable<Plank>{
        int start;
        int end;

        public Plank(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Plank{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        @Override
        public int compareTo(Plank plank) {
            return start - plank.start;
        }
    }
    public int nailPlanks(int[] A, int[] B, int[] C) {
        Set<Integer> nailsSeen = new HashSet<>();
        List<Nail> nails = new ArrayList<>();
        for (int i=0; i<C.length; i++) {
            if (!nailsSeen.contains(C[i])) {
                nails.add(new Nail(i+1,C[i]));
                nailsSeen.add(C[i]);
            }
        }
        Collections.sort(nails);

        List<Plank> planks = new ArrayList<>();
        for (int i=0; i < A.length; i++) {
            planks.add(new Plank(A[i],B[i]));
        }
        Collections.sort(planks);
        for (int i=0; i < planks.size()-2; i++) {

            while (i>0 && planks.get(i).end > planks.get(i+1).end) {
                planks.remove(i--);
            }
        }
        int maxMin = 0;
        for (Plank plank: planks) {
            int minIndex = getMinNailIndex(nails,plank);
            if (minIndex==-1) {
                return -1;
            }
            maxMin = Math.max(maxMin, minIndex);

        }
        return maxMin;
    }
    public int getMinNailIndex(List<Nail> nails, Plank plank) {
        int start = 0;
        int end = nails.size()-1;
        int result = -1;
        while (start<=end) {
            int centre = (start+end)/2;
            if (nails.get(centre).value < plank.start) {
                start = centre+1;
            } else if (nails.get(centre).value > plank.end) {
                end = centre-1;
            } else {
                result = centre;
                end = centre -1;
            }
        }
        if (result==-1) {
            return -1;
        }
        int minIndex = nails.get(result).index;
        for (int i=result+1; i < nails.size(); i++) {
            if (nails.get(i).value < plank.end) {
                minIndex = Math.min(minIndex, nails.get(i).index);
            } else {
                return minIndex;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
	    // write your code here
        NailPlanks m = new NailPlanks();

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
     //   System.out.println(m.fibFrog(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
        System.out.println(m.nailPlanks(new int[]{1,4,5,8},new int[]{4,5,9,10},new int[]{4,6,7,10,2}));
    }
}
