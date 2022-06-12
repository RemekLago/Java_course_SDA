package Part4;

public class FigureCircle extends Figure{
    protected final double PI = 3.14;
    private double radius;

    public FigureCircle(double radius){
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return radius * radius * PI;
    }
}
