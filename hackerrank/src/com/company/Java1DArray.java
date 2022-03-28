package com.company;

import java.util.Scanner;

public class Java1DArray {

    static void testPrintF() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        for (int i=0; i < 3; i++) {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n",s1,x);
            System.out.println("-----------------------------");
        }
    }
    static void negativeSubArrays() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int currentSum=0;
        int negativeSubArrays=0;
        for (int i=0; i < arr.length; i++) {
            for (int j=i; j < n; j++) {
                for (int k=i; k<=j; k++) {
                    currentSum += arr[k];
                }
                if (currentSum<0) {
                    negativeSubArrays++;
                }
            }
        }
    }

}
