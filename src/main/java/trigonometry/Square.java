package trigonometry;

public class Square {

    private double side;

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
