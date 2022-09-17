package com.company;

public class FindMin {

    public static void main(String[] args) {

        int [] arr = {254,325,658,151,698,324,218,547,211,111,569};
        System.out.println(min(arr));
    }

    static int min (int[]arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
