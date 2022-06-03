package loops;

public class ForLoop {

    public static void main(String[] args) {

        int i = 5;

        for (int j = 0; j < i; j = j + 1) {
            System.out.println("j = " + j);
        }

        for (int j = 0; j < i; j++) {
            System.out.println("j = " + j);
        }
    }
}
