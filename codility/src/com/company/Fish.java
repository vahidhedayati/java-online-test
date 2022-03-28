package com.company;

import java.util.Stack;

public class Fish {


    public int fishSurvival(int[] A, int[] B) {
        int survivors = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i < A.length; i++) {
            int fish = A[i];
            int direction = B[i];
            if (direction==0) {
                boolean survivor = true;
                while (!stack.isEmpty()) {
                    int oppFish = stack.pop();
                    if (oppFish> fish) {
                        stack.push(oppFish);
                        survivor=false;
                        break;
                    }
                }
                if (survivor) {
                    survivors++;
                }
            } else {
                stack.push(fish);
            }
        }
        return survivors;
    }

    public static void main(String[] args) {
	    // write your code here
        Fish m = new Fish();
    }
}
