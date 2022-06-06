package trigonometry;

public class Triangle {

    private double base;
    private double height;

    private Triangle() {
        System.out.println("Triangle constructor");
    }

    public Triangle(double base, double height) {
        this();
        System.out.println("Triangle constructor with parameters");
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height, String sayHello) {
        this(base, height);
        System.out.println(sayHello);
    }

    public double calculateArea() {
        return (base * height) / 2;
    }

    public double calculatePerimeter() {
        return 3 * base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
