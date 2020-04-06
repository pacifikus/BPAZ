package com.company;

import java.io.IOException;

public class ConsoleDataWriter implements DataWriter {

    public void writeResult(long result) throws IOException {
        System.out.println(result);
    }
}
