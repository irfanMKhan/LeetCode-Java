package com.secured.leetcode.p_217_ContainsDuplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test_P217 {

    @Test
    void containsDuplicate() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(P_217.containsDuplicate(arr));
    }

    @Test
    void containsDuplicate_withoutSet() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        System.out.println(P_217.containsDuplicate_withoutSet(arr));
        Assertions.assertTrue(P_217.containsDuplicate_withoutSet(arr));
    }
}