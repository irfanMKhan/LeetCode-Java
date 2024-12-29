package com.secured.leetcode.p_1_twosum;

import org.junit.jupiter.api.Test;

public class Test_P1 {

    @Test
    public void test_TwoSum() {
        int[] a = P_1.twoSum(new int[]{1, 2, 3, 4, 5}, 6);
        for (int b : a) {
            System.out.println(b);
        }
    }

}
