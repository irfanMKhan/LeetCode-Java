package com.secured.InterviewQuestions;

import com.secured.InterviewQuestions.ValidParenthesesAndMinimumOperationToMakeValid;
import org.junit.jupiter.api.Test;

class TestValidParenthesesAndMinimumOperationToMakeValid {

    @Test
    void test() {
        System.out.println(ValidParenthesesAndMinimumOperationToMakeValid.valid("{}"));
        System.out.println(ValidParenthesesAndMinimumOperationToMakeValid.valid("{}{{"));
        System.out.println(ValidParenthesesAndMinimumOperationToMakeValid.valid("}{}{"));
    }

    @Test
    void test2() {
        System.out.println(ValidParenthesesAndMinimumOperationToMakeValid.minOperations("{}"));
        System.out.println(ValidParenthesesAndMinimumOperationToMakeValid.minOperations("{}{{"));
        System.out.println(ValidParenthesesAndMinimumOperationToMakeValid.minOperations("}{}{"));
    }

}