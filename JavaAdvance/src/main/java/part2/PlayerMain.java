package part2;

import java.util.Arrays;

public class PlayerMain {
    public static void main(String[] args) {
        Player player1 = new Player("Adam", 1, 5, 10);
        Player player2 = new Player("Ania", 2, 7, 12);
        Player player3 = new Player("Ewa", 3, 8, 15);

        Player[] table = {player1, player2, player3};

        player1.introduce();
        player1.runTime(5);
        player1.runDistance(50);

        run(table);
    }

        public static void run(Player[] tmpTable) {
            System.out.println("Start run ...");
            double distance = 50;
            double[] resultTable = new double[tmpTable.length];
            for (int i=0; i < tmpTable.length; i++) {
                resultTable[i] = tmpTable[i].runTime(distance);
            }
            System.out.println("Result of run ...");
            for (int i=0; i < resultTable.length; i++) {
                System.out.println("Player id " + tmpTable[i].id + " has time " + String.format("%.2f", resultTable[i]));
            }
            Arrays.sort(resultTable);
            System.out.println("The winner is player with time " + resultTable[0]);
        }
}