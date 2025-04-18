package com.secured.leetcode.p_1_twosum;

import org.junit.jupiter.api.Test;

class Test_P1 {

    @Test
    public void test_TwoSum() {
        int[] a = P_1.twoSum(new int[]{1, 2, 3, 4, 5}, 6);
        for (int b : a) {
            System.out.println(b);
        }
    }

    @Test
    public void test_TwoSum_withoutHashmap() {
        int[] a = P_1.twoSum_withoutHashmap(new int[]{1, 2, 3, 4, 5}, 6);
        for (int b : a) {
            System.out.println(b);
        }
    }

}
