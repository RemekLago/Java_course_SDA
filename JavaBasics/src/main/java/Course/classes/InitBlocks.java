package classes;

public class InitBlocks {
    {
        System.out.println("Init block");
        int a = 1 + 2;
        double b = Math.pow(2, 2);
    }

    public InitBlocks() {
        System.out.println("InitBlock constructor");
    }

    public InitBlocks(String sayHello) {
        System.out.println("InitBlock constructor says " + sayHello);
    }
}
