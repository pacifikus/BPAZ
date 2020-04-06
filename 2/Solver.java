package com.company;

import java.util.Arrays;

public class Solver {

    private final String FILE_TO_OUTPUT = "out.txt";

    private long[] arrayToSum;
    private long result;


    public long getResult() {
        return result;
    }

    public void setArrayToSum(long[] arrayToSum) {
        this.arrayToSum = arrayToSum;
    }

    public void computeArraySum() { result = Arrays.stream(arrayToSum).sum(); }
}
