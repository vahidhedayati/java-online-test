package com.company;

import java.util.List;

public class HourGlassSum {


    public static int hourglassSumO(List<List<Integer>> arr) {
        int result = 0;
        if(arr == null || arr.size() == 0){
            return result;
        }
        int rows = arr.size();
        int columns = 0;
        int count = 0;
        int totalMax = -9*7;
        for(int i = 0; i < rows - 2; i++){
            count++;
            int max = arr.get(i).get(columns) + arr.get(i).get(columns+1) + arr.get(i).get(columns+2)
                    + arr.get(i+1).get(columns+1)
                    + arr.get(i+2).get(columns) + arr.get(i+2).get(columns+1) + arr.get(i+2).get(columns+2);
            totalMax = Math.max(totalMax, max);
            if(count == rows - 2){
                count = 0;
                i = -1;
                columns++;
            }
            if(columns >= rows - 2){
                break;
            }
        }
        result = totalMax;
        return result;
    }


    static int hourGlassSum(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;

        int maxHourGlassSum=-64; //Integer.MIN_VALUE
        for (int i=0;  i < rows-2; i++) {
            for (int j=0; j < columns-2; j++) {
                int currentHourGlassSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                        arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                maxHourGlassSum=Math.max(maxHourGlassSum,currentHourGlassSum);
            }
        }
        return maxHourGlassSum;
    }
}
