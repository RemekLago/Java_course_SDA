package arguments;

public class Operators {

    public static void main(String[] args) {
        int i = 0;
        System.out.println(i++); // 0 i++ => i = i + 1;
        System.out.println(i); // 1

        System.out.println(++i); // 2
        System.out.println(i); // 2

        System.out.println(i--); // 2 i-- => i = i - 1;
        System.out.println(i); // 1

        System.out.println(--i); // 0
        System.out.println(i); // 0

        int k = 123;
        i += k; // i = i + 1;
        i -= 1; // i = i - 1;
        i *= 1; // i = i * 1;
        i /= 1; // i = i / 1;
        i %= 1; // i = i % 1;
    }
}
