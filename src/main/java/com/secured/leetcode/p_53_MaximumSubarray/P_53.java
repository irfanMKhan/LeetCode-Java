package com.secured.leetcode.p_53_MaximumSubarray;

public class P_53 {
    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
