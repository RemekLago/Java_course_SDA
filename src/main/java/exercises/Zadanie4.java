package exercises;

public class Zadanie4 {
    public static void main(String[] args) {

        int[] table = { 99, -1, 5, 11, 101, 0, 55 };
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
    }
}
