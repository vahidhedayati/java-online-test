package com.company;

public class CountDiv {


    //6, 11, 2
    public int countDiv(int A, int B, int K) {
        //6 / 2 = 3
        int base = (int)Math.ceil((double)A/K);
        // 3 * 2 = 6
        base *= K;
        // 11 - 6 = 5
        B -=base;
        // 5 / 2 = floor of it which = 2
        int count = (int)Math.floor((double)B/K);
        // increment count and that is what we requi
        count++;
        // amount of numbers between 6 - 11 divisible by 2 = 8 & 10
        return count;
    }

    public static void main(String[] args) {
	    // write your code here
        CountDiv m = new CountDiv();

        int countedDivisions = m.countDiv(6,11,2);
        System.out.println(countedDivisions);
    }
}
