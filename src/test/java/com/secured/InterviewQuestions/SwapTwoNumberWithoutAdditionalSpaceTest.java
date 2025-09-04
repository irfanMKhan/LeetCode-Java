package com.secured.InterviewQuestions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTwoNumberWithoutAdditionalSpaceTest {

    @Test
    void test() {
        int[] abc = SwapTwoNumberWithoutAdditionalSpace.swap(new int[]{5, 6});
        System.out.println(abc[0]);
        System.out.println(abc[1]);
    }

}