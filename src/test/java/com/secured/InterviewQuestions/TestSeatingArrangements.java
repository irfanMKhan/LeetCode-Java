package com.secured.InterviewQuestions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSeatingArrangements {

    @Test
    void test() {
        System.out.println(SeatingArrangements.arrange(new int[]{5, 6, 10, 8}));
        Assertions.assertEquals(4, SeatingArrangements.arrange(new int[]{5, 6, 10, 8}));
    }

}