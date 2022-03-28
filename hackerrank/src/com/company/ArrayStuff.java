package com.company;

import java.util.*;

public class ArrayStuff {
    public static final <T> ArrayList<T> removeDuplicates(ArrayList<T> in){
        ArrayList<T> out = new ArrayList<T>();
        for(T t : in)
            if(!out.contains(t))
                out.add(t);
        return out;
    }
    public static int[] removeDuplicate(int[] array) {
        int[] tempArray = new int[array.length];
        int j = 0;
        int arrLength = array.length;
        for (int i : array) {
            if (!isExists(tempArray, i)) {
                tempArray[j++] = i;

                tempArray = Arrays.copyOf(tempArray, arrLength--);
            }
        }
        return tempArray;
    }

    public static boolean isExists(int[] array, int num) {
        if (array == null)
            return false;
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
    static int[] removeDuplicates(int[] arr) {
        //Quick with JDK8
        //Arrays.stream(arr).distinct().toArray();



        int length = arr.length;
        Set<Integer> finalList = new HashSet<>();
        for (int i=0; i < length; i++) {
            //if (!finalList.contains(arr[length])){
                finalList.add(arr[i]);
            //}
        }
        Iterator it = finalList.iterator();
        while (it.hasNext()) {
            System.out.println(" "+it.next());
        }


        int [] array = { 10, 20, 30, 10, 45, 30 };
        int [] newArray = removeDuplicate(array);


        Arrays.sort(arr);

        return array;
    }
}
