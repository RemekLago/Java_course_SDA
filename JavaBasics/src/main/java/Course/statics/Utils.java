package statics;

public class Utils {

    private static String description;

    private String value;

    public Utils(String value) {
        this.value = value;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public void method() {
        add(1, 2);
        System.out.println(description);
    }
}
