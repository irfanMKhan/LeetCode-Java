package com.secured.leetcode.p_1_twosum;

import java.util.HashMap;
import java.util.Map;

public class P_1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static int[] twoSum_withoutHashmap(int[] nums, int target) {

        for (int i = 1; nums.length > i; i++) {
            for (int j = i; nums.length > j; j++) {
                if (target == nums[j - i] + nums[j])
                    return new int[]{j - i, j};
            }
        }
        return new int[]{};
    }
}
