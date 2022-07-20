package Tasks.Task3a;

public class Circle extends Shape{
    final double PI = 3.14;
    double radius;

    public Circle() {
        this.radius = 1;
        this.color = "unknown";
        this.isFilled = false;
    }

    public Circle(double radius, String color, boolean isFilled) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * PI;
    }
    public double getPerimeter(){
        return 2 * radius * PI;
    }
    @Override
    public String toString(){
        return "Circle with radius = " + this.radius + " which is a subclass off class Shape";
    }
}
