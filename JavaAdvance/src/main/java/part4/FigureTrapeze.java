package Part4;

public class FigureTrapeze extends Figure{
    double side1;
    double side2;
    double height;

    public FigureTrapeze(double side1, double side2, double height){
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double areaFigure() {
        return (side1 * side2 * height) / 2;
    }
}
