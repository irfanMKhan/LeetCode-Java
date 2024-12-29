package com.secured.leetcode.p_53_MaximumSubarray;

import org.junit.jupiter.api.Test;

class Test_P53 {

    @Test
    void test() {
        System.out.println(P_53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) == 6 ? "YES" : "NO");
        System.out.println(P_53.maxSubArray(new int[]{-2, -1}) == -1 ? "YES" : "NO");
    }

}