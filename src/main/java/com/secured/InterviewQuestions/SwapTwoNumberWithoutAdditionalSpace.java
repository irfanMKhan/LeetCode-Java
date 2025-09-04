package com.secured.InterviewQuestions;

public class SwapTwoNumberWithoutAdditionalSpace {

    public static int[] swap(int[] twoNum){
        twoNum[0] = twoNum[0] + twoNum[1];
        twoNum[1] = twoNum[0] - twoNum[1];
        twoNum[0] = twoNum[0] - twoNum[1];
        return twoNum;
    }
}
