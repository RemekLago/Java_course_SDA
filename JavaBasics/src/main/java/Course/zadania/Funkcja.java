package Course.zadania;

public class Funkcja {

    public static void main(String[] args) {
        funkcjaDoWhile();
    }

    private static void funkcjaFor() {
        System.out.println("y = 3x");
        for (int x = 0; x <= 10; x++) {
            System.out.printf("%d: y = %d\n", x, oblicz(x));
        }
    }

    private static void funkcjaWhile() {
        System.out.println("y = 3x");
        int x = 0;
        while (x <= 10) {
            System.out.printf("%d: y = %d\n", x, oblicz(x));
            x++;
        }
    }

    private static void funkcjaDoWhile() {
        System.out.println("y = 3x");
        int x = 0;
        do {
            System.out.printf("%d: y = %d\n", x, oblicz(x));
            x++;
        } while (x <= 10);
    }

    private static int oblicz(int i) {
        return 3 * i;
    }
}
