package Tasks;

public class Loops {
    public static void main(String[] args) {

        Loops loop = new Loops();
        loop.Loop1();

        int j = 0;
        while (j <= 10 ) {
            int y = j * 3;
            System.out.println(j + ": y = " + y);
            j++;
        }
        int k = 0;
        do {
            int y = k * 3;
            System.out.println(k + ": y = " + y);
            k++;
        } while (k <= 10 );
    }
    public void Loop1() {
        for (int i = 0; i <= 10; i++) {
            int y = i * 3;
            System.out.println(i + ": y = " + y);
        }
    }
}
