package exercises;

import arrays.ArrayUtils;
import arrays.*;

public class Zadanie4 {
    public static void main(String[] args) {

        int[] table = { 99, 1, 5, -1, 101, 10, 55 };
        // [99] [1, 5, 11, 101, 10, 55]
        // min i max
        int min = table[0];
        int max = table[0];

        for (int i = 1; i < table.length; i++) {
            if (table[i] > max) {
                max = table[i];
            }

            if (table[i] < min) {
                min = table[i];
            }
        }

        System.out.println(
                "Wartość minimalna to " +
                        min +
                        " a wartość maksymalna to "
                        + max);

        ArrayUtils arrayUtils = new ArrayUtils();
        min = arrayUtils.calculateMin(table);
        max = arrayUtils.calculateMax(table);

        System.out.println(
                "Wartość minimalna to " +
                        min +
                        " a wartość maksymalna to "
                        + max);
    }
}
