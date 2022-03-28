package com.company;

public class DoubleValueKeyFound {

    static int calculateTotal(int[] arr, int key) {

        for (int i=0; i < arr.length; i++) {
            if (arr[i]==key) {
                key *= key;
            }
        }
        return key;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,11,12,8};
        int key = 2;
        System.out.println(calculateTotal(arr,key));
    }
}
