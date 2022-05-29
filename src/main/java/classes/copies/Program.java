package classes.copies;

public class Program {
    public static void main(String[] args) {
        BasicTypesMethods basicTypesMethods
                = new BasicTypesMethods();

        int a = 10;
        System.out.println("Program a = " + a);
        basicTypesMethods.increment(a);
        System.out.println("Program a = " + a);

        a = basicTypesMethods.increment2(a);
        System.out.println("Program a = " + a);

        // pies
        PiesMethods piesMethods = new PiesMethods();

        Pies burek = new Pies();
        burek.name = "burek";
        System.out.println(burek.name);

        piesMethods.changeReference(burek);
        System.out.println(burek.name);

        piesMethods.changeName(burek);
        System.out.println(burek.name);
    }
}
