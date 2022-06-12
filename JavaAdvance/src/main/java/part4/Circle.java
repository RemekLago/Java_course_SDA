package Part4;

public class Circle {

    protected final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public final double areaCircle(){
        return PI * radius * radius;
    }

    public final double areaCircle(int argument){
        return PI * radius * radius * argument;
    }

    public int getRadius() {
        return radius;
    }
}
