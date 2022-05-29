package varargs;

public class Varargs {

    public void method1(int[] ints) {

    }

    // varargs
    public void method2(int... ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
