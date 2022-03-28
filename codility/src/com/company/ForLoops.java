package com.company;

import java.math.BigDecimal;

public class ForLoops {

    public static int[] NUMBERS = { 1,2,3,4,5,6,7,8,9};

    public static int[] UNSORTED_NUMBERS = { 5,4,1,2,9,3,6,8,7,10};


    /**
     * | FORWARD At Array position 0 value=1
     * ..
     * | FORWARD At Array position 8 value=9
     */

    public void forward() {
        for (int i=0; i < NUMBERS.length; i++) {
            System.out.println("| FORWARD At Array position "+i+" value="+NUMBERS[i] );
        }

    }

    /**
     * | BACKWARDS At Array position 8 value=9
     *..
     *  | BACKWARDS At Array position 0 value=1
     *
     *  | BACKWARDS2 At Array position 8 value=9
     *  ..
     *  | BACKWARDS2 At Array position 0 value=1
     */
    public void backwards() {
        // You can use this in conjunction with above or whilst going forward to look backwards at the same time
        //loop is actually going forward numbers selected in reverse
        for (int i=0; i < NUMBERS.length; i++) {
            int descending = NUMBERS.length - 1 - i;
            System.out.println(" | BACKWARDS At Array position " + descending + " value=" + NUMBERS[descending]);
        }

        //This is counting backwards
        for (int i=NUMBERS.length-1; i >= 0; i--) {
            System.out.println(" | BACKWARDS2 At Array position " + i + " value=" + NUMBERS[i]);
        }
    }

    /**
     * Compare 2 At Array position 1 previous: 1 current: 2
     * ..
     * Compare 2 At Array position 8 previous: 8 current: 9
     */
    public void compareLastWithCurrent() {
        for (int i=1; i < NUMBERS.length; i++) {
            System.out.println("Compare 2 At Array position "+i+" previous: "+NUMBERS[i-1]+ " current: "+NUMBERS[i] );
        }

    }

    /**
     *  Backwards compare 2 At Array position 8 previous: 8 current: 9
     *  ..
     *  Backwards compare 2 At Array position 1 previous: 1 current: 2
     */
    public void compareLastWithCurrentBackwards() {
        for (int i=NUMBERS.length-1; i > 0; i--) {
            System.out.println(" Backwards compare 2 At Array position "+i+" previous: "+NUMBERS[i-1]+ " current: "+NUMBERS[i] );
        }
        for (int i=NUMBERS.length-2; i >=0; i--) {
            System.out.println("Backwards Compare 3 At Array position "+i+" previous: "+NUMBERS[i+1]+ " current: "+NUMBERS[i] );

        }
    }
    public void sortMinMaxManually() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i < UNSORTED_NUMBERS.length; i++) {
            min = Math.min(UNSORTED_NUMBERS[i],min );
            max = Math.max(UNSORTED_NUMBERS[i],max );
        }
        int middle =min+max/2;
        int middle2 = (int)Math.floor(Double.valueOf(min+max) / Double.valueOf(2));

        System.out.println(" middle 1  " +middle+" middle2 = "+middle2 );
        //while (min <= max) {
         //   int middle =min+max/2;
          //  Double dd = Double.valueOf(min+max) / Double.valueOf(2);
          //  System.out.println("Middle "+middle+" Max " +max+" min = "+min + " "+Math.floor(dd) );
          // min++ ;

        //}
    }
    public void ah() {
        for (int i=0; i < NUMBERS.length; i++) {
            for (int j = i + 1; j < NUMBERS.length; j++) {
                int one = NUMBERS[i];
                int two = NUMBERS[j];
                System.out.println(" I:  " +one+" J: "+two );
            }
        }
    }


    public static void main(String[] args) {
        ForLoops fl = new ForLoops();
        fl.forward();
        fl.backwards();
        fl.compareLastWithCurrent();
        fl.compareLastWithCurrentBackwards();
        fl.sortMinMaxManually();
        fl.ah();


    }
}
