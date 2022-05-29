package arrays;

public class ArrayUtils {

    public int calculateMin(int[] table) {
        int result = table[0];

        for (int i = 1; i < table.length; i++) {
            if (table[i] < result) {
                result = table[i];
            }
        }

        return result;
    }

    public int calculateMax(int[] table) {
        int result = table[0];

        for (int i = 1; i < table.length; i++) {
            if (table[i] > result) {
                result = table[i];
            }
        }

        return result;
    }

    public int indexOf(int[] table, int searchValue) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }
}
