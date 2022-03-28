package com.company;

public class LeftRotationOfArray {

    //1,2,3,4,5 rotate by 2 = 3,4,5,1,2
    static int[] leftRotateArray(int[] arr, int rotateAmount) {
        int arraySize = arr.length;
        int[] newArray = new int[arraySize];
        int i=0;
        int rotateIndex=rotateAmount;
        while (rotateIndex < arraySize) {
            newArray[i]=arr[rotateIndex];
            rotateIndex++;
            i++;
        }
        rotateIndex=0;
        while (rotateIndex < rotateAmount) {
            newArray[i]=arr[rotateIndex];
            i++;
            rotateIndex++;
        }
        return newArray;
    }
}
