package varargs;

public class VarargsProgram {

    public static void main(String[] args) {
        Varargs varargs = new Varargs();

        int[] ints = {1, 2, 3, 4, 5};
        varargs.method1(ints);
//        varargs.method1(1, 2, 3, 4, 5);
//        varargs.method1();

        varargs.method2(ints);
        varargs.method2(1, 2, 3, 4, 5);
        varargs.method2();
    }
}
