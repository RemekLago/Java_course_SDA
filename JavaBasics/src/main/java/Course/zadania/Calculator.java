package Course.zadania;

public class Calculator {

    public static final String KEY = "JakiśKluczBramy";

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
            return result;
        } else {
            System.out.println("Error, division by zero");
            return 0;
        }
    }
}
