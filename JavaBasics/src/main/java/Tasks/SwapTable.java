package Tasks;

public class SwapTable {
    public static void main(String[] args) {
        int[] table = {54, 26, 93, 17, 77, 31, 44, 55, 20};

        for (int i = 1; i < table.length; i++) {
            for (int j = i; j >= 0; j--){
            if (table[i] < table[i - j]) {
                swap(table, i, i - j);
                }
            }
        }

            for (int j : table){
                System.out.print(j + " ");
        }
    }

    private static void swap(int[] tab, int index1, int index2){
        int tmp = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = tmp;
    }
}