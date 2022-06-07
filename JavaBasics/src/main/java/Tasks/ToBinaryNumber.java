package Tasks;

import java.util.Random;

public class ToBinaryNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        ToBinary(number);

    }

    public static void ToBinary(int x) {
        String result = "";
        while (x != 0) {
            int binaryNumber = x % 2;
            System.out.println("binaryNumber: " + binaryNumber);
            x = x / 2;
            System.out.println("x: " + x);
            result = binaryNumber + result;
            System.out.println("String: " + result);

        }
    }
}
