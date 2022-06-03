package exercises;

import java.util.Arrays;

public class Zadanie3 {

    public static void main(String[] args) {

        // [1, 3, 5, 8, 9, 11]
        // kopia

        int[] table = { 1, 3, 5, 8, 9, 11 };
        int[] tableCopy = new int[table.length];

        for (int i = 0; i < table.length; i++) {
            tableCopy[i] = table[i];
        }

        System.out.println(Arrays.toString(tableCopy));
    }
}
