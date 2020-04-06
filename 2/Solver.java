package com.company;

import java.util.Arrays;
import java.util.concurrent.*;

public class Solver {

    private final String FILE_TO_OUTPUT = "out.txt";

    private long[] arrayToSum;
    private volatile long result;


    public long getResult() {
        return result;
    }

    public void setArrayToSum(long[] arrayToSum) {
        this.arrayToSum = arrayToSum;
    }

    public void computeArraySum() throws ExecutionException, InterruptedException {
        result = computeArraySumParallel();
    }

    public long computeArraySumParallel() throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Long> res = es.submit(() -> Arrays.stream(arrayToSum).sum());
        return res.get();
    }
}
