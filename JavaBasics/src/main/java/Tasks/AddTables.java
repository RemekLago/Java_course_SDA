package Tasks;

public class AddTables {
    public static void main(String[] args) {

        int[] table1 = {1, 2, 3, 4, 5};
        int[] table2 = {6, 7, 8, 9, 10};
        int[] a = addingTables(table1, table2);
        printingTable(a);
    }

    public static int[] addingTables(int[] table1, int[] table2){
        int[] result = new int[table1.length + table2.length];

        for (int i = 0; i < table1.length; i++){
            result[i] = table1[i];
        }
        for (int i = 0; i < table2.length; i++){
            result[table1.length + i] = table2[i];
        }
        return result;
    }
    public static void printingTable(int[] table){
        for (int i : table ){
            System.out.print(i + " ");
        }
    }
}
