package zadania;

import java.util.Scanner;

public class TrojkatProstokatnyProgram {
    public static void main(String[] args) {
        System.out.println("Podaj wartości długości boków");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok");
        int bok1 = scanner.nextInt();

//        if (bok1 <= 0) {
//            System.out.printf("Niepoprawna wartość %d", bok1);
//        return;
//        }

        System.out.println("Podaj drugi bok");
        int bok2 = scanner.nextInt();

//        if (bok2 <= 0) {
//            System.out.printf("Niepoprawna wartość %d", bok2);
//        return;
//        }

        System.out.println("Podaj trzeci bok");
        int bok3 = scanner.nextInt();

//        if (bok3 <= 0) {
//            System.out.printf("Niepoprawna wartość %d", bok3);
//        return;
//        }

        if (bok1 <= 0 || bok2 <= 0 || bok3 <= 0) {
            System.out.println("Długość boku powinna być większa niż 0");
            return;
        }

        if (Math.pow(bok1, 2) + Math.pow(bok2, 2) != Math.pow(bok3, 2)) {
            System.out.printf("Trójkąt o bokach %d, %d, %d nie jest prostokątny", bok1, bok2, bok3);
        } else {
            System.out.printf("Trójkąt o bokach %d, %d, %d jest prostokątny", bok1, bok2, bok3);
        }
    }
}
