package com.secured.leetcode.p_20_ValidParentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test_P20 {

    @Test
    public void solve() {
        Assertions.assertFalse(P_20.isValid("{}["));
        Assertions.assertTrue(P_20.isValid("()[]{{()}}[]"));
    }

}