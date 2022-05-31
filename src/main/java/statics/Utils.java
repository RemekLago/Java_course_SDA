package statics;

public class Utils {

    private static String description;

    public static int add(int a, int b) {
        System.out.println(description);
        return a + b;
    }

    public void method() {
        System.out.println(description);
    }
}
