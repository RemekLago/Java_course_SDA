package part6.Lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class GameLotto {

    public static Set<Integer> playGame() {
        Set<Integer> userNumbers = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter " + (6 - i) + " numbers in range [1-49]: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
//            if (number >= 1 && number <= 49) {
            if (number >= 1 && number <= 49 && (!userNumbers.contains(number))) {
                userNumbers.add(number);
                System.out.println(userNumbers);
            } else {
                System.out.println("Enter correct number in range [1-49]");
                i--;
            }
        }
        return userNumbers;
    }

    private static Set<Integer> randomNumbers() {
        ;
        Set<Integer> systemNumbers = new HashSet<>();
        Random generator = new Random();

        for (int i = 0; i < 6; i++) {
            systemNumbers.add(generator.nextInt(50));
        }
        return systemNumbers;
    }

    public static int returnResult(Set set1, Set set2) {
        int counter = 0;
        for (Object i : set1) {
            for (Object j : set2) {
                if (i == j) {
                    counter++;
                }
            }
            return counter;
        }
        return counter;
    }

    public static void printingResult() {
        Set setUser = playGame();
        Set setRandom = randomNumbers();
        int counter = returnResult(setUser, setRandom);

        System.out.println("Users numbers: " + setUser);
        System.out.println("System numbers: " + setRandom);
        System.out.println("You guessed: " + counter + " numbers");
    }
}

