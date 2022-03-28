package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinAbsoluteValueArray {

    public static Integer[] toConvertInteger(int[] ids) {

        Integer[] newArray = new Integer[ids.length];
        for (int i = 0; i < ids.length; i++) {
            newArray[i] = Integer.valueOf(ids[i]);
        }
        return newArray;
    }
    public static Integer[] toConvertInteger2(int[] ids) {
        //int[] aint = {1,2,3,4,5,6,7,8,9,10};
        Integer[] aInt = new Integer[ids.length];
        Arrays.setAll(aInt, i -> ids[i]);
        return aInt;
    }
    public static int[] toint(Integer[] WrapperArray) {

        int[] newArray = new int[WrapperArray.length];
        for (int i = 0; i < WrapperArray.length; i++) {
            newArray[i] = WrapperArray[i].intValue();
        }
        return newArray;
    }


    static Integer minAbsoluteValue(int[] arr) {
        int min_absolute_difference = Integer.MAX_VALUE;
        //For strings
        //Arrays.sort(arr, Collections.reverseOrder());

        //for ints
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        Integer[] array = new Integer[] { 1, 24, 4, 4, 345 };
        Arrays.sort(array,comparator);
        System.out.println("Array sorted in reverse  ="+Arrays.toString(array));
        Arrays.sort(arr);
        System.out.println("Array sorted ="+Arrays.toString(arr));
       // arr = toint(array);
        for (int i=0; i < arr.length-1; i++) {

            int current_absolute_diff = Math.abs(arr[i] - arr[i+1]);
            System.out.println("current_absolute_diff between "+arr[i]+" &"+arr[i+1]+" = "+current_absolute_diff);

            min_absolute_difference = Math.min(current_absolute_diff,min_absolute_difference);
            System.out.println("Min absolute difference =  "+min_absolute_difference);
        }
        return min_absolute_difference;
    }

    static void main(String[] args) {
        int[] arr = {1,5,7,9,11};


    }
}
