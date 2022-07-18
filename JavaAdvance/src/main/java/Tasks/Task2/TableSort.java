package Tasks.Task2;

import java.util.Scanner;

public class TableSort {

    //* convert table of strings given by user to table of int
    public static int[] userTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of table[]");
        int tableSize = scanner.nextInt();

        System.out.println("Please enter " + tableSize + " numbers to fill in table[] use ',' to separate numbers");
        String numbersToTable = scanner.nextLine();
        System.out.println(numbersToTable);

        String[] tableStrings = numbersToTable.split(",");
        int[] tableNumbers = new int[tableStrings .length];
        for (int j=0; j < tableStrings .length; j++){
            tableNumbers[j] = Integer.valueOf(tableStrings [j]);
            System.out.println(tableStrings [j]);
        }
        return tableNumbers;
    }

    //* sorting table of int by bubble sorting
    public static int[] bubbleSort(int[] table){
        for (int i=0; i < table.length; i++){
            for (int j=i+1; j < table.length; j++){
                if (table[i] > table[j]){
                    int tmp = table[i];
                    table[i] = table[j];
                    table[j] = tmp;
                }
            }
        }
        for (int j:table){
        System.out.print(j + " ");}
        return table;
    }
}
