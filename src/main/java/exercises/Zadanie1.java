package exercises;

public class Zadanie1 {

    public static void main(String[] args) {

        // 12345 => 54321
        int number = 12345;
        int revertNumber = 0;

        while (number > 0) {
            revertNumber = revertNumber * 10;
            revertNumber += number % 10;
            number /= 10;
        }

        System.out.println(revertNumber);
    }
}
