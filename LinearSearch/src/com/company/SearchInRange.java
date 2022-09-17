package com.company;

public class SearchInRange {

    public static void main(String[] args) {

        int[] nums = {4, 5, 3, 6, 36, 325, 8, 9, 7, 21, 54, 69, 32, 47, 51, 28, 97, 66, 69};
        int target = 9;
        System.out.println(LinearSearch(nums,target,5,11));
    }

    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
