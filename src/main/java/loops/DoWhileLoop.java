package loops;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 5;
        int j = 0;

        do {
            System.out.println("j = " + j);
            j = j + 1;
        } while (j < 5);
    }
}
