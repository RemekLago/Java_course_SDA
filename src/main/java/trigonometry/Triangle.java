package trigonometry;

public class Triangle {

    private double base;
    private double height;

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
