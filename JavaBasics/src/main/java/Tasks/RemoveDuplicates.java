package Tasks;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] table1 = {10, 22, 10, 20, 11, 22, 22, 7, 10, 40, 40};
//        int[] table1 = {10, 10, 10, 10, 10, 10};
        removingDuplicates(table1);

    }
    public static int[] removingDuplicates(int[] table){
        int duplicates = 0;
        for (int i = 0; i < table.length -1 - duplicates; i++){
                for (int j = table.length - 1 - i; j > i; j--){
                    if (table[i] == table[j]){
                        swap(table, j, table.length - 1 - duplicates);
                        duplicates += 1;
                        System.out.println(duplicates);
                    }
                }
            for (int k : table){
                System.out.print(k + " ");
                }
            System.out.println();
        }
        int[] result = new int[table.length - duplicates ];
        for (int i = 0; i < (table.length - duplicates); i++){
            result[i] = table[i];
        }
        for (int a : result){
            System.out.print(a + " ");
        }
        return result;
    }

    private static void swap(int[] tab, int index1, int index2){
        int tmp = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = tmp;
    }
}
