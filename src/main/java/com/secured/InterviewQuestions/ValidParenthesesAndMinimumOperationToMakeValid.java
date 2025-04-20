package com.secured.InterviewQuestions;

import java.util.Stack;

public class ValidParenthesesAndMinimumOperationToMakeValid {

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
            } else {
                opr++;
                stack.push(c);
            }
        }
        opr += stack.size() / 2;
        return opr;
    }

    public static int minOperations(String s) {
        int ans = 0;
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '{') {
                balance++;
            } else {
                if (balance == 0) {
                    ans++;
                    balance++;
                } else {
                    balance--;
                }
            }
        }
        if (balance % 2 != 0) {
            return -1;
        }
        return ans + balance / 2;
    }
}
