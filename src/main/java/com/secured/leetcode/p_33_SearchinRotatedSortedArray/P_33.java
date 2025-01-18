package com.secured.leetcode.p_33_SearchinRotatedSortedArray;

public class P_33 {

    public static int search(int[] nums, int target) {
        int size = nums.length;
        int left = 0;
        int right = size - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }

}
