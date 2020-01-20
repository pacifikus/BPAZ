import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     	/*
	* Два кенгуру Кеша и Игорь начинают прыгать одновременно, но с разных стартовых позиций: х1 и х2.
	* И имеют разную длину прыжков: v1 и v2.
	* Прыгают в одном направлении. Определить смогут ли они оказаться в
	* одной точке в один момент времении. Если да, то вывести YES, иначе NO.
	* 0 <= x1 <= x2 <= 10000
	* 1 <= v1 <= 10e4
	* 1 <= v2 <= 10e4
	*
	* Пример: 0 3 4 2. Ответ: YES
	*/

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

