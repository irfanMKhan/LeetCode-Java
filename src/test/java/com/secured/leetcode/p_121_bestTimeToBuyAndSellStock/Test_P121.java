package com.secured.leetcode.p_121_bestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

public class Test_P121 {

    @Test
    public void test_TwoSum() {
        int a = P_121.maxProfit(new int[]{1, 2, 3, 4, 5});

        System.out.println(a);

        a = P_121.maxProfit(new int[]{5, 4, 3, 2, 1});

        System.out.println(a);
    }

}
