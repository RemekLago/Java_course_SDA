package exercises;

import arrays.ArrayUtils;

public class Zadanie2 {

    public static void main(String[] args) {

        // znalezienie indeksu w tablicy,
        // gdzie znajduje się szukana wartość
        int[] table = { 1, 4, 5, 9, 12, 99 };
        // [1, 4, 5, 9, 12, 99]
        // table[0] = 1

        // -1 oznacza, że nie znaleziono indeksu
        int index = -1;
        int searchValue = 2;

        for (int i = 0; i < table.length; i++) {
            if (table[i] == searchValue) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            System.out.println("Nie znaleziono liczby " + searchValue);
        } else {
            System.out.println(
                    "Szukana wartość znajduje się pod indeksem = " + index);
        }

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


        ArrayUtils arrayUtils = new ArrayUtils();
        int indexOf = arrayUtils.indexOf(table, 2);

        if (indexOf < 0) {
            System.out.println("Nie znaleziono");
        } else {
            System.out.println("Znaleziono indeks = " + indexOf);
        }
    }
}
