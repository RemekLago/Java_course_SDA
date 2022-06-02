package classes.copies;

public class BasicTypesMethods {
    public void increment(int a) {
        a++;
        System.out.println("BasicTypesMethods-increment: " + a);
    }

    public int increment2(int a) {
        a++;
        System.out.println("BasicTypesMethods-increment: " + a);
        return a;
    }
}
