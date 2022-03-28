package com.company;

public class FrogJump {


    public int frogJump(int X,int Y, int D) {
      int distance  = Y - X;
      return (int) Math.ceil(distance/(double)D);
    }

    public static void frogJump2(int X, int Y, int D) {
        int a = 0, r = 0;
        a = Y - X;
        r = a % D;
        a = a / D;
        if (r > 0) {
            a = a + 1;
        }
        System.out.println("Total jumps are: " + a);
    }

    public static void main(String[] args) {
	    // write your code here
        FrogJump m = new FrogJump();



        System.out.println(m.frogJump(10,85,30));
        m.frogJump2(10,85,30);
        //System.out.println();
    }
}
