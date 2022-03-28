package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortExamples {

    //Also check out MinAbsoluteValueArray

    public static void main(String[] args)
    {
        int temp;
//initializing an array
        int a[]={12,5,56,-2,32,2,-26,9,43,94,-78};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
//accessing element of the array
        for (int i = 0; i <=a.length - 1; i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main2(String[] args)
    {
        String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
// sorts array[] in descending order
        Arrays.sort(strarray, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " + Arrays.toString(strarray));
    }


    public static void main3(String[] args)
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.println(a[i]);
        }
        System.out.print(a[n - 1]);
    }


    public static void sortSubArray(String[] args) {
//defining an array
        int[] a = {12, 90, 34, 2, 45, 3, 22, 18, 5, 78};
// sorts subarray form index 2 to 7
        Arrays.sort(a, 2, 7);
//prints array using the for loop
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

}
