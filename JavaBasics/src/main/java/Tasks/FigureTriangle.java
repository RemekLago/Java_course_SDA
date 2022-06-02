package Tasks;

import java.util.Scanner;

public class FigureTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side1: ");
        int side1 = scanner.nextInt();

        if (side1 <= 0) {
            System.out.println("Side1 should be bigger than 0");
            return;
        }

        System.out.println("Please enter side2: ");
        int side2 = scanner.nextInt();

        if (side2 <= 0) {
            System.out.println("Side2 should be bigger than 0");
            return;
        }

        System.out.println("Please enter side3: ");
        int side3 = scanner.nextInt();

        if (side3 <= 0) {
            System.out.println("Side3 should be bigger than 0");
            return;
        }

//        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
//            System.out.println("Side1, 2, 3 should be bigger than 0");
//            return;
//        }

        if ((Math.pow(side1, 2) + Math.pow(side2, 2))  !=  Math.pow(side3, 2)) {
            System.out.println("Triangle is not  .."); }
        else {
            System.out.println("Triangle is ..");
        }

    }
}
