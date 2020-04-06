package com.company;

import java.io.*;
import java.util.*;

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
 * @version 2.0
 */
public class Main {

    private static DataReader dataReader = new ConsoleDataReader();

    public static void main(String[] args) throws IOException {

        long[] arrayToSum = dataReader.getInputData();

        Solver solver = new Solver();
        solver.setArrayToSum(arrayToSum);
        solver.computeArraySum();
        long result = solver.getResult();

        DataWriter dataWriter = new FileDataWriter(); // Запись в файл.
        //DataWriter dataWriter = new ConsoleDataWriter(); // Запись в консоль.
        dataWriter.writeResult(result);
        return;
    }
}



