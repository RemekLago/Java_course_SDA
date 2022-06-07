package Tasks;

public class ReverseTable {
    public static void main(String[] args) {
        int[] table = {4, 6, 7, 19, 3};
        int[] newTable = new int[table.length];

//        for (int i : table) {}
        for (int i = 0; i < table.length; i++) {
            newTable[i] = table[table.length - 1 - i];
        }
        for (int j : table){
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j : newTable){
            System.out.print(j + " ");
        }

        int[] table1 = {1, 2, 3};
        int[] table2 = {4, 5, 6, 7, 8};
        int[] table3 = new int[table1.length + table2.length];
        for (int i = 0; i < table1.length; i++){
            table3[i] = table1[i];
        }
        for (int i = table2.length; i < (table1.length + table2.length); i++){
            table3[i] = table1[i];
        }
        for (int j : table3){
            System.out.print(j + " ");
        }
    }
}
