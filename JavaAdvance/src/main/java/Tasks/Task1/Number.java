package Tasks.Task1;

import java.util.Scanner;

public class Number {
    protected int number;

    public static int userNumber() {
        System.out.println("Please enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static String[] splittingNumber(int numberIn) {
//        String[] numberOut = (numberIn + "").split("");
        String[] numberOut = Integer.toString(numberIn).split("");
        return numberOut;
    }

    public static String[] changingNumber(String[] numberIn2) {
        String[] numberOut2 = new String[numberIn2.length];
        int i = 0;
        while (i < numberIn2.length) {
            numberOut2[numberIn2.length - 1 - i] = numberIn2[i];
            i++;
        }
        return numberOut2;
    }

    public static String finalNumber(String[] tableIn) {
        String newNumber = "";
        for (int i = 0; i < tableIn.length; i++) {
            newNumber += tableIn[i];
        }
        System.out.println("Reverse number: " + newNumber);
        return newNumber;
    }
}


