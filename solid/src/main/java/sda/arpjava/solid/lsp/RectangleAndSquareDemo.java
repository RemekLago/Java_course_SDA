package sda.arpjava.solid.lsp;

public class RectangleAndSquareDemo {
    public static void main(String[] args) {
        Rectangle square = new Square(5);
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(5);

        square.setHeight(7);
        square.setWidth(4);
        System.out.println("Wysokość kwadratu: " + square.getHeight());
        System.out.println("Szerokość kwadratu: " + square.getWidth());

    }
}
