package com.company;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        int left_to_right = 0;
        int right_to_left = 0;

        int rows = arr.length;
        int columns = arr[0].length;

        int i = 0;
        int j = 0;
        int k = 0;
        //right to left
        int l = arr.length-1;

        while (i < rows && j < columns && k < rows && l >=0) {
            right_to_left += arr[i][j];
            left_to_right += arr[k][l];
            System.out.println(arr[i][j]+"<>"+ arr[k][l]);
            i++;
            j++;
            k++;
            l--;
        }

        System.out.println("ltr@: "+left_to_right);
        System.out.println("rtl@: "+right_to_left);
        return Math.abs(left_to_right - right_to_left);
    }

    public static  void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=9;
        arr[2][1]=8;
        arr[2][2]=9;

    }
}
