package part2;

public class FractionMain {
    public static void main(String[] args) {
        Fraction a = new Fraction (1, 2);
        Fraction b = new Fraction (4, 9);
        System.out.println(a);

        a.multiplication(b);
        System.out.println(a);
        a.division(1, 2);
        System.out.println(a);
        a.addition(1, 2);
        System.out.println(a);
        a.subtraction(1, 2);
        System.out.println(a);
    }
}
