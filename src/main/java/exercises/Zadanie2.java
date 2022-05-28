package exercises;

public class Zadanie2 {

    public static void main(String[] args) {

        int[] table = { 1, 4, 5, 9, 12, 99 };

        int index = -1;
        int searchValue = 9;

        for (int i = 0; i < table.length; i++) {
            if (table[i] == searchValue) {
                index = i;
                break;
            }
        }

        System.out.println(
                "Szukana wartość znajduje się pod indeksem = " + index);

        int i = 0;
        for (int element : table) {
            if (element == searchValue) {
                index = i;
                break;
            }
            i++;
        }

        System.out.println(
                "Szukana wartość znajduje się pod indeksem = " + index);

        i = 0;
        while (i < table.length) {
            if (table[i] == searchValue) {
                index = i;
                break;
            }
            i++;
        }

        System.out.println(
                "Szukana wartość znajduje się pod indeksem = " + index);

        i = 0;
        do {
            if (table[i] == searchValue) {
                index = i;
                break;
            }
            i++;
        } while (i < table.length);

        System.out.println(
                "Szukana wartość znajduje się pod indeksem = " + index);
    }
}
