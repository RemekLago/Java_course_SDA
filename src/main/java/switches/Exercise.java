package switches;

public class Exercise {
    public static void main(String[] args) {
        int number = 165735;

        switch (number % 2) {
            case 0:
                System.out.println("Liczba jest parzysta");
                break;
            case 1:
                System.out.println("Liczba jest nieparzysta");
                break;
        }
    }
}
