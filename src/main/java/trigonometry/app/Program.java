package trigonometry.app;

import trigonometry.Circle;
import trigonometry.Rectangle;
import trigonometry.Square;
import trigonometry.Triangle;

public class Program {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setBase(1);
        triangle.setHeight(2);

        System.out.println("Pole trójkąta: "
                + triangle.calculateArea());

        System.out.println("Obwód trójkąta: "
                + triangle.calculatePerimeter());

        Square square = new Square();
        square.setSide(3);

        System.out.println("Pole kwadratu: "
                + square.calculateArea());

        System.out.println("Obwód kwadratu: "
                + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setFirstSideLength(2);
        rectangle.setSecondSideLength(8);

        System.out.println("Pole prostokąta: "
                + rectangle.calculateArea());

        System.out.println("Obwód prostokąta: "
                + rectangle.calculatePerimeter());

        Circle circle = new Circle();
        circle.setRadius(7);

        System.out.println("Pole okręgu: "
                + circle.calculateArea());

        System.out.println("Obwód okręgu: "
                + circle.calculatePerimeter());
    }
}
