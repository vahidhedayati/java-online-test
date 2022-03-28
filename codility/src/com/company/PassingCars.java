package com.company;

public class PassingCars {


    public int passingCars(int[] A) {
        int eastBoundCars = 0;
        int passingCars = 0;
        for (int a:A) {
            if (a == 0) {
                eastBoundCars++;
            } else {
                passingCars += eastBoundCars;
                if (passingCars > 100000000) {
                    return -1;
                }
            }
        }
        return passingCars;
    }

    public static void main(String[] args) {
	    // write your code here
        PassingCars m = new PassingCars();

        int passingCars = m.passingCars(new int[]{0,1,0,1,1});
        System.out.println("passingCars"+ passingCars);
    }
}
