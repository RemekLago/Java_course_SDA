package Tasks;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number1: ");
        float number1 = scanner.nextFloat();

        System.out.println("Please enter number2: ");
        float number2 = scanner.nextFloat();

        sumNumbers(number1, number2);
        subNumbers(number1, number2);
        multiNumbers(number1, number2);
        divisionNumbers(number1, number2);
    }

    public static float sumNumbers(float x, float y) {
        float result = x + y;
        System.out.printf("Sum: %.2f", result);
        return result;
    }
    public static float subNumbers(float x, float y) {
        float result = x - y;
        System.out.printf("Subtract: %.2f", result);
        return result;
    }
    public static float multiNumbers(float x, float y) {
        float result = x * y;
        System.out.printf("Multiply: %.2f", result);
        return result;
    }
    public static float divisionNumbers(float x, float y) {
        if (y != 0) {
            float result = x / y;
            System.out.printf("Division: %.2f", result);
        return result; }
        else {
                System.out.println("Error, division by zero");
                return 0;
            }
        }
    }




