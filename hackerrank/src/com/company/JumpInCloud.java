package com.company;

public class JumpInCloud {

    public static int jumpingOnCloud(int[] c) {
        int number_of_jumps = 0;
        int i = 0;

        while (i < c.length - 1) {
            int twoAhead = i+2;
            if (twoAhead == c.length || c[twoAhead] == 1) {
                number_of_jumps++;
                i++;
            } else {
                i +=  2;
                number_of_jumps++;
            }
        }
        return number_of_jumps;
    }

}
