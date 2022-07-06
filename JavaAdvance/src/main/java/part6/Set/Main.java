package part6.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Figure square1 = new Square(4);
        Figure square2 = new Square(3);
        Figure square3 = new Square(5);
        Figure rectangle1 = new Rectangle(4, 5);
        Figure rectangle2 = new Rectangle(4, 8);
        Figure rectangle3 = new Rectangle(2, 4);

//        Set<Figure> exampleHashSet = new HashSet<Figure>(
//                Set.of(square1,square2, square3, rectangle1, rectangle2,rectangle3));

        Set<Figure> exampleHashSet = new HashSet<>();
        exampleHashSet.add(square1);
        exampleHashSet.add(square2);
        exampleHashSet.add(square3);
        exampleHashSet.add(rectangle1);
        exampleHashSet.add(rectangle2);
        exampleHashSet.add(rectangle3);


        Set<Figure> exampleLinkedHashSet = new LinkedHashSet<Figure>(exampleHashSet);
        Set<Figure> exampleTreeSet = new TreeSet<Figure>(exampleHashSet);

        System.out.println("HashSet: " + exampleHashSet);
        System.out.println("LinkedHashSet: " + exampleLinkedHashSet);
        System.out.println("TreeSet: " + exampleTreeSet);

    }
}
