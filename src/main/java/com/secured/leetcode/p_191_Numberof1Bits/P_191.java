package com.secured.leetcode.p_191_Numberof1Bits;

public class P_191 {

    public static int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += n % 2;
            n = n >> 1;
        }
        return result;
    }

}
