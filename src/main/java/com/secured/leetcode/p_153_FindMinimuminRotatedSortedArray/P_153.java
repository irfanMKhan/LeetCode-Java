package com.secured.leetcode.p_153_FindMinimuminRotatedSortedArray;

public class P_153 {

    public static int findMin(int[] nums) {
        int size = nums.length;
        int left = 0, right = size - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right])
                right = mid;
            else
                left = mid + 1;
        }
        return nums[left];
    }

}
