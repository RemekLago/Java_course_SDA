public class IfCheck {

    public static void main(String[] args) {

        int i = 5;
        if (i < 5) {
            System.out.println("i jest mniejsze niż 5");
        } else {
            System.out.println("i nie jest mniejsze niż 5");
        }

        i = 3;
        if (i == 1) {
            System.out.println("i jest równe 1");
            i = 5;
        } else if (i == 2) {
            System.out.println("i jest równe 2");
        } else if (i == 3) {
            System.out.println("i jest równe 3");
        } else {
            System.out.println("i jest większe niż 3");
        }

        System.out.println("KONIEC");
    }
}
