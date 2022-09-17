package com.company;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int [][] arr ={
                {21,54,98},
                {14,23,58},
                {11,74,83,22},
        };
        int target = 22;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search (int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
}

/*
syntax for max value
static int max (int[][] arr){
int max = Integer.Min_Value; or arr[0][0];
for (int row = 0; row < arr.length; row++){
for (int col = 0; col < arr[row].length; col++){
if (arr[row][col] > max){
max = arr[row][col];
}
}
}
return max;
 */
