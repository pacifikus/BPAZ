import java.io.*;
import java.math.*;
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
 * @version 1.0
 */
public class Solution {
    private static String LINE_SEPARATOR = "(\r\n|[\n\r\u2028\u2029\u0085])?";

    public static void main(String[] args)
            throws IOException
    {
        long[] arrayToSum = getInputData();
        long result = getArraySum(arrayToSum);
        writeResultToFile(result);
        openResultFile();
        return;
    }

    private static long[] getInputData() {
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

    static long getArraySum(long[] arrayToSum) {
        return Arrays.stream(arrayToSum).sum();
    }

    private static void writeResultToFile(long result) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
    }

    private static void openResultFile() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("notepad out.txt");
    }
}
