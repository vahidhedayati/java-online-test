package com.company;

public class MaxNonOverlappingSegments {


    public int maxNonOverlappingSegments(int[] A, int[] B) {
        int currentPosition = -1;
        int segmentCounter = 0;
        for (int i=0; i <A.length; i++) {
            if (A[i] > currentPosition) {
                currentPosition = B[i];
                segmentCounter++;
            }
        }
        return segmentCounter;
    }
    public static void main(String[] args) {
	    // write your code here
        MaxNonOverlappingSegments m = new MaxNonOverlappingSegments();

        System.out.println(m.maxNonOverlappingSegments( new int[] {1,3,7,9,9},new int[] {5,6,8,9,10}));
    }
}
