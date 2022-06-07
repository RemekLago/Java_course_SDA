package Tasks;

public class Loops2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                if (i*j <= 9) {
                    System.out.print("  " + (j*i)); }
                else {
                System.out.print(" " + (j*i));}
            }
            System.out.print("\n");
        }
    }
}
