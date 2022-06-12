package Part4;

public class FigureSquare extends Figure{
    private double side;

    public FigureSquare(double side){
        this.side = side;
    }

    @Override
    public double areaFigure() {
        return side * side;
    }

}
