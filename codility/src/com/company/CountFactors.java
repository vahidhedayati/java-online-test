package com.company;

public class CountFactors {

    public int countFactors(int N) {
        int factors = 0;
        for (int i =1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i < Math.sqrt(N)) {
                    factors +=2;
                } else {
                    factors++;
                }
            }
        }
        return factors;
    }

    public static void main(String[] args) {
	    // write your code here
        CountFactors m = new CountFactors();

    }
}
