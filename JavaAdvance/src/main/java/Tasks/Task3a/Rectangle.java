package Tasks.Task3a;

public class Rectangle extends Shape{
    private double width;
    private double length;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean isFilled) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle with width = " +this.width+ " and length = "
                + this.length + " which is a subclass off ";
    }
}
