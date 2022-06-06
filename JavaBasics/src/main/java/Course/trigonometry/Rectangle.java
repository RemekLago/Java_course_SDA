package trigonometry;

public class Rectangle {

    private double firstSideLength;
    private double secondSideLength;

    public Rectangle(double firstSideLength, double secondSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public double calculateArea() {
        return firstSideLength * secondSideLength;
    }

    public double calculatePerimeter() {
        return 2 * firstSideLength + 2 * secondSideLength;
    }

    public void setFirstSideLength(double firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public void setSecondSideLength(double secondSideLength) {
        this.secondSideLength = secondSideLength;
    }
}
