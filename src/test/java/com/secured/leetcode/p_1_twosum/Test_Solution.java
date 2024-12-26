package com.secured.leetcode.p_1_twosum;

import org.junit.jupiter.api.Test;

public class Test_Solution {

    @Test
    public void test_TwoSum() {
        int[] a = Solution.twoSum(new int[]{1, 2, 3, 4, 5}, 6);
        for (int b : a) {
            System.out.println(b);
        }
    }

}
