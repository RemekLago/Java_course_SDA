package Course.zadania;

public class TabliczkaMnozenia {
    public static void main(String[] args) {
        useDoWhile();
    }

    private static void useFor() {
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                if (i > 1) {
                    System.out.print(" ");
                }
                System.out.print(i * j);
            }
            System.out.println();
        }
    }

    private static void useWhile() {
        int i = 1;
        int j = 1;

        while (j <= 10) {
            while (i <= 10) {
                if (i > 1) {
                    System.out.print(" ");
                }
                System.out.print(i * j);
                i++;
            }
            System.out.println();
            j++;
            i = 1;
        }
    }

    private static void useDoWhile() {
        int i = 1;
        int j = 1;

        do {
            do {
                if (i > 1) {
                    System.out.print(" ");
                }
                System.out.print(i * j);
                i++;
            } while (i <= 10);
            System.out.println();
            j++;
            i = 1;
        } while (j <= 10);
    }
}
