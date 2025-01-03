package com.secured.leetcode.test;

import java.util.Stack;

public class test {

    public static int valid(String s) {

        if (s.length() % 2 != 0) return -1;

        Stack<Character> stack = new Stack<Character>();
        int opr = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{') {
                stack.push(c);
            } else if (c == '}' && (!stack.isEmpty() && stack.peek() == '{')) {
                stack.pop();
            } else
                opr++;

        }
        opr += stack.size();
        return opr;
    }
}
