package Tasks.Task4a;

import Tasks.Task3a.Circle;

public class ShapeMain {
    public static void main(String[] args) {



    Tasks.Task3a.Circle circle1 = new Circle(5, "red", false);
    Rectangle rectangle1 = new Rectangle(4,5, "yellow", false);
    Square square1 = new Square(2,2, "blue", true);

        System.out.println(circle1.toString());
        System.out.println(rectangle1.toString());
        System.out.println(square1.toString());
    }
}
