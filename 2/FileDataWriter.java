package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter implements DataWriter {

    private static String OUTPUT_COMMAND = "notepad out.txt";

    public void writeResult(long result) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();

        Runtime runtime = Runtime.getRuntime();
        runtime.exec(OUTPUT_COMMAND);
    }
}
