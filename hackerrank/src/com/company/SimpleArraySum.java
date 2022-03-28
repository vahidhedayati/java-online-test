package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SimpleArraySum {

    static int simpleArraySum(int[] arr) {
        int arr_sum=0;
        for (int i=0; i < arr.length; i++) {
            arr_sum += arr[i];
        }
        return arr_sum;
    }

    static int simpleArraySum(List<Integer> ar ) {
        int arr_sum=0;
        for (int i=0; i < ar.size(); i++) {
            arr_sum += ar.get(i);
        }
        return arr_sum;
    }

    static void main(String[] args) {
            int[] arr = {1,2,3};
            System.out.println((simpleArraySum(arr)));

            List<Integer> ar = new ArrayList<Integer>();
            List<Integer> llist=new LinkedList<Integer>();
            List<Integer> stack=new Stack<Integer>();
            ar.add(1);
            ar.add(2);
            ar.add(3);
            System.out.println((simpleArraySum(ar)));
    }
}
