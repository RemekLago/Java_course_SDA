package Tasks.Task1;

import java.util.Scanner;

public class Number2 {
//    public static void main(String[] args) {

    public static void reverseNumber(){
        int num = 0;
        int reverseNum = 0;
        System.out.println("Input your number and press enter:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
            System.out.println("Reverse of input number is: " + reverseNum);
        }
    }
}
