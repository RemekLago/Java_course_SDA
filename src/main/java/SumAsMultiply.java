public class SumAsMultiply {

    static int skladowa1;
    int skladowa2;
    String skladowa3;

    public static void main(String[] args) {

        int i = 5;
        int j = 3;
        int rezultat = 0;
        int licznik = 0;
        int z = 11111;

        int l = i + z;
        int k = i + skladowa1;

        var a = 1;

        // 5 * 3
        // 5 + 5 + 5

        while (licznik < j) {
            rezultat = rezultat + i;
            licznik = licznik + 1;
        }

        System.out.println("5 * 3 = " + rezultat);

        // 3 + 3 + 3 + 3 + 3

        /*
        to
        jest
        wielolinikowy
        komentarz
         */

        licznik = 0;
        rezultat = 0;

        while (licznik < i) {
            rezultat = rezultat + j;
            licznik = licznik + 1;
        }

        System.out.println("5 * 3 = " + rezultat);
    }

    void method() {
        int i = 1;
        int j = 1;

        // 0 - false
        // 1 - true
        if (!(i > 0)) {
            System.out.println("i jest równe 1");
            j = j + 1;
        }

        boolean b = i > 1;
        if (b)
            System.out.println("i jest równe 1");
        j = j + 1;

        System.out.println(j);

        if (true) {

        }

        /* 1 w java to nie true
        if (1) {

        }
        */
    }

    void method2() {

    }
}
