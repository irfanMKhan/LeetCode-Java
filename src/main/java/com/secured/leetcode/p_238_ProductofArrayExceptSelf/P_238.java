package com.secured.leetcode.p_238_ProductofArrayExceptSelf;

import java.util.Arrays;

public class P_238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = suffix * res[i];
            suffix *= nums[i];
        }
        return res;
    }
}
