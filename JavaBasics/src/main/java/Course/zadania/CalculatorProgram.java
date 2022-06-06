package Course.zadania;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number1: ");
        float number1 = scanner.nextFloat();

        System.out.println("Please enter number2: ");
        float number2 = scanner.nextFloat();

        // Calculator calculator = new Calculator();

        // Calculator.KEY

        Calculator.sumNumbers(number1, number2);
        Calculator.subNumbers(number1, number2);
        Calculator.multiNumbers(number1, number2);
        Calculator.divisionNumbers(number1, number2);
    }
}