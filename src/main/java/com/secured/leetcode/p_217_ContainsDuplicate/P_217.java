package com.secured.leetcode.p_217_ContainsDuplicate;

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
}
