package arguments;

public class KlasyOslonowe {
    public static void main(String[] args) {

        Integer a = 5;
        int b = 5;

        a = b;
        b = a;

        System.out.println(Integer.toBinaryString(5));

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
