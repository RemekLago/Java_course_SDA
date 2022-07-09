package part7;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (value) -> {
            {
                if (value < 2) {
                    return false;
                }
                for (int i = 2; i <= value / 2; i++) {
                    if (value % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };



    checkTest(predicate, 101);

}

    static void checkTest(Predicate<Integer> predicate, int valueToTest) {
        System.out.println(predicate.test(valueToTest));
    }

}
