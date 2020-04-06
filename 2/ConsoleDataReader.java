package com.company;

import java.util.Scanner;

public class ConsoleDataReader implements DataReader {

    private final String LINE_SEPARATOR = "(\r\n|[\n\r\u2028\u2029\u0085])?";

    public long[] getInputData() {
        Scanner scanner = new Scanner(System.in);
        int arCount = scanner.nextInt();
        scanner.skip(LINE_SEPARATOR);

        long[] arrayToSum = new long[arCount];

        String[] inputItems = scanner.nextLine().split(" ");
        scanner.close();

        for (int i = 0; i < arCount; i++) {
            arrayToSum[i] = Long.parseLong(inputItems[i]);
        }
        return arrayToSum;
    }
}
