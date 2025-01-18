package com.secured.leetcode.p_15_ThreeSum;

import java.util.*;

public class P_15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return new ArrayList<>(result);
    }


    public static List<List<Integer>> threeSumApproach2(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> op = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int current_sum = nums[left] + nums[right];
                if (current_sum == target) {

                    op.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (current_sum < target)
                    left++;
                else
                    right--;

            }
        }
        return op;
    }

}
