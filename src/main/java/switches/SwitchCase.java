package switches;

public class SwitchCase {
    public static void main(String[] args) {
        int testVal = 12;
        switch (testVal) {
            case 0:
                System.out.println("wartość 0");
                break;
            case 1:
                System.out.println("wartość 1");
                break;
            case 10:
                System.out.println("wartość 10");
                break;
            case 11:
                System.out.println("wartość 11");
                break;
            default:
                System.out.println("coś innego");
                break;
            case 12:
                // * (why?)
                System.out.println("wartość 12");
                break;
        }

        if (testVal == 0) {
            System.out.println("wartość 0");
        } else if (testVal == 1) {
            System.out.println("wartość 1");
        } else if (testVal == 10) {
            System.out.println("wartość 10");
        } else if (testVal == 11) {
            System.out.println("wartość 11");
        } else {
            System.out.println("coś innego");
        }
    }
}
