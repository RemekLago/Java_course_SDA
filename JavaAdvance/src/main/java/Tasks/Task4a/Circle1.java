package Tasks.Task4a;

public class Circle1 extends Shape1 {
    final double PI = 3.14;
    double radius;

    @Override
    public double getArea1(){
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter1(){
        return  radius * PI * 2;
    }

    public Circle1() {
        this.radius = 1;
        this.color = "unknown";
        this.isFilled = false;
    }

    public Circle1(double radius, String color, boolean isFilled) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString(){
        return "Circle with radius = " + this.radius + " which is a subclass off class Shape";
    }
}
