package com.company;

public class Main {


    public static void main(String[] args) {

        int[] nums = {4, 5, 3, 6, 36, 325, 8, 9, 7, 21, 54, 69, 32, 47, 51, 28, 97, 66, 69};
        int target = 87;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
            return -1;
    }
}
