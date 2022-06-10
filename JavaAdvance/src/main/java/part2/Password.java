package part2;

import java.util.Random;
import java.util.Scanner;

public class Password {
    private int randomNumber;
    private int userNumber;

    public static int RandomNumber() {
        Random random = new Random();
        int number = random.nextInt(0, 11);
        return number;
    }

    public static int UserNumber(){
        System.out.println("Please enter your number. It should be number from [0-10]");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void isNumberQuessed(int randomNumber){
        for (int i = 0; i < 5; i++){
            int userNumber = UserNumber();
            if (userNumber == randomNumber) {
                System.out.println("You win, your number " + userNumber + " is correct");
                break;
            } else if (userNumber != randomNumber && i < 4) {
                System.out.println("Try again, your number " + userNumber + " is not correct");
                System.out.println("You still have " + (5 - 1 - i) + " tries");
            } else if (userNumber != randomNumber && i == 4) {
                System.out.println("Your number " + userNumber + " is not correct");
                System.out.println("It Was your last chance and you lost");
                System.out.println("The number you were looking for was " + randomNumber);
            }
        }
    }

}
