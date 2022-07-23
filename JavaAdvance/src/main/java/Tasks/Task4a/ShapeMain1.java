package Tasks.Task4a;

import Tasks.Task3a.Circle;

public class ShapeMain1 {
    public static void main(String[] args) {

    Circle1 circle1 = new Circle1(5, "red", false);
    Rectangle1 rectangle1 = new Rectangle1(4,5, "yellow", false);
    Square1 square1 = new Square1(2,2, "blue", true);

        System.out.println(circle1.toString());
        System.out.println(rectangle1.toString());
        System.out.println(square1.toString());
    }
}
