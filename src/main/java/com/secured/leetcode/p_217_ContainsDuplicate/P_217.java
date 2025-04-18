package com.secured.leetcode.p_217_ContainsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P_217 {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate_withoutSet(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}
