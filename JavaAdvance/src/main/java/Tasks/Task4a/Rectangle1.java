package Tasks.Task4a;

public class Rectangle1 extends Shape1 {
    private double width;
    private double length;

    @Override
    public double getArea1(){
        return width * length;
    }

    @Override
    public double getPerimeter1(){
        return 2 * width + 2 * length;
    }

    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle1(double width, double length, String color, boolean isFilled) {
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

    @Override
    public String toString() {
        return "Rectangle with width = " +this.width+ " and length = "
                + this.length + " which is a subclass off Shape";
    }
}
