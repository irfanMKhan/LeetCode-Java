package com.secured.leetcode.p_15_ThreeSum;

import org.junit.jupiter.api.Test;

class Test_P15 {

    @Test
    void checkThreeSum() {
        System.out.println(P_15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

        System.out.println(P_15.threeSumApproach2(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}