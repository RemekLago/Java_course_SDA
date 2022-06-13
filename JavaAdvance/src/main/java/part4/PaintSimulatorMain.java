package Part4;

public class PaintSimulatorMain {
    public static void main(String[] args) {


    FigureCircle circle1 = new FigureCircle(10);
    FigureSquare square1 = new FigureSquare(5);
    FigureTrapeze trapeze1 = new FigureTrapeze(1,2,3);

    Figure[] figureTable = {circle1, square1, trapeze1};

    PaintSimulator.needForPaint(figureTable, 10);
    }
}
