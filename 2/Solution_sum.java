package com.company;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.logging.*;


/**
 * Дано: n - количество чисел в массиве
 *		ar - массив чисел
 * 		1 <= n <= 10
 *		0 <= ar[i] <= 10e10
 *		Вычислить сумму чисел.
 * Пример:
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 *
 * @autor Кристина Желтова, БПАЗ17-01
 * @version 3.0
 */
public class Main {

    private static DataReader dataReader = new ConsoleDataReader();
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Input data reading");

        long[] arrayToSum = dataReader.getInputData();
        long result = startComputation(arrayToSum);
        writeResult(result);
        return;
    }

    private static long startComputation(long[] arrayToSum) {
        logger.log(Level.INFO, "Computation starts...");

        Solver solver = new Solver();
        solver.setArrayToSum(arrayToSum);

        try {
            solver.computeArraySum();
            logger.log(Level.INFO, "Computation has ended!");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Computation exception: ", e);
        }
        return solver.getResult();
    }

    private static void writeResult(long result) {
        DataWriter dataWriter = new FileDataWriter(); // Запись в файл.
        //DataWriter dataWriter = new ConsoleDataWriter(); // Запись в консоль.

        logger.log(Level.INFO, "Writing result");
        try {
            dataWriter.writeResult(result);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Writing exception: ", e);
        }
    }
}



