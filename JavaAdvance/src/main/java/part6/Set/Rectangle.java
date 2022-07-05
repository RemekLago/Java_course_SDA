package part6.Set;

import java.util.Objects;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double areaFigure() {
        return side1 * side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.side1, side1) == 0 && Double.compare(rectangle.side2, side2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2);
    }
}
