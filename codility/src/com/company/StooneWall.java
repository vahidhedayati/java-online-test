package com.company;

import java.util.Stack;

public class StooneWall {

    public int stoneWall(int[] A) {
        int blockCount=0;
        Stack<Integer> stack = new Stack<>();
        for (int a:A) {
            while (!stack.isEmpty() && stack.peek() > a) {
                stack.pop();
            }
            if (!stack.isEmpty() && stack.peek() == a) {
                //do nothing
            } else {
                stack.push(a);
                blockCount++;
            }
        }
        return blockCount;
    }

    public static void main(String[] args) {
	    // write your code here
        StooneWall m = new StooneWall();


    }
}
