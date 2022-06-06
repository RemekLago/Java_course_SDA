package Course.zadania;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        System.out.println("Podaj dwie liczby, dla których przeprowadzone zostaną operacje matematyczne");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        float liczba1 = scanner.nextFloat();

        System.out.println("Podaj drugą liczbę:");
        float liczba2 = scanner.nextFloat();

        System.out.printf("%.2f + %.2f = %.2f", liczba1, liczba2, liczba1 + liczba2);
        System.out.println();

        System.out.printf("%.2f - %.2f = %.2f", liczba1, liczba2, liczba1 - liczba2);
        System.out.println();

        System.out.printf("%.2f * %.2f = %.2f", liczba1, liczba2, liczba1 * liczba2);
        System.out.println();

        System.out.printf("%.2f / %.2f = %.2f", liczba1, liczba2, liczba1 / liczba2);
        System.out.println();
    }
}
