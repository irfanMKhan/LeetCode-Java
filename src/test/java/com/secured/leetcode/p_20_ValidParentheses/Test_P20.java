package com.secured.leetcode.p_20_ValidParentheses;

import org.junit.jupiter.api.Test;

public class Test_P20 {

    @Test
    public void solve() {
        String input = "()[]{{()}}}";
        System.out.println(P_20.isValid(input));
    }

}