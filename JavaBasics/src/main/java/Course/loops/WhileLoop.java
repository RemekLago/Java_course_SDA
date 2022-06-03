package loops;

public class WhileLoop {

    public static void main(String[] args) {

        int i = 5;
        int j = 0;

        System.out.println("start of while loop");

        while (j < i) {
            System.out.println("j = " + j);
            j = j + 1;
        }

        System.out.println("end of while loop");
    }
}
