package Course.zadania;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class ZgadnijLiczbe {

    public static void main(String[] args) {

        System.out.println("Jaką liczbę sobie pomyślałem?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int liczba = random.nextInt(10);

        int i = -1;
        int licznik = 1;

        while (i != liczba) {
            System.out.println("Zgadnij liczbę");
            i = scanner.nextInt();
            if (i == liczba) {
                System.out.printf("Brawo, odgadłeś liczbę za %d razem\n", licznik);
            } else if (i > liczba) {
                System.out.println("Twoja liczba jest za duża");
            } else {
                System.out.println("Twoja liczba jest za mała");
            }
            licznik++;
        }
    }
}
