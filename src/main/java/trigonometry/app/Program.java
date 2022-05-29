package trigonometry.app;

import trigonometry.Circle;
import trigonometry.Rectangle;
import trigonometry.Square;
import trigonometry.Triangle;

public class Program {

    public static void main(String[] args) {
        Triangle triangle
                = new Triangle(1, 2, "Hello, World!");

        System.out.println("Pole trójkąta: "
                + triangle.calculateArea());

        System.out.println("Obwód trójkąta: "
                + triangle.calculatePerimeter());

        triangle.setBase(1);
        triangle.setHeight(2);

        System.out.println("Pole trójkąta: "
                + triangle.calculateArea());

        System.out.println("Obwód trójkąta: "
                + triangle.calculatePerimeter());

        Square square = new Square(3);
//        square.setSide(3);

        System.out.println("Pole kwadratu: "
                + square.calculateArea());

        System.out.println("Obwód kwadratu: "
                + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle(2, 8);
//        rectangle.setFirstSideLength(2);
//        rectangle.setSecondSideLength(8);

        System.out.println("Pole prostokąta: "
                + rectangle.calculateArea());

        System.out.println("Obwód prostokąta: "
                + rectangle.calculatePerimeter());

        Circle circle = new Circle(7);
//        circle.setRadius(7);

        System.out.println("Pole okręgu: "
                + circle.calculateArea());

        System.out.println("Obwód okręgu: "
                + circle.calculatePerimeter());

        System.out.print("A");
        System.out.print("B\n");
        System.out.print("C");
        System.out.printf("Obwód okręgu: %.4f\n", circle.calculatePerimeter());
    }
}
