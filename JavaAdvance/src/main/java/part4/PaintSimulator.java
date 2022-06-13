package Part4;

public class PaintSimulator {

    public static double needForPaint(Figure[] figureTable, double sizePaintContainer){
        double neededLitresOfPaint = 0;
        for (int i=0; i < figureTable.length; i++){
            neededLitresOfPaint += figureTable[i].areaFigure();
            System.out.println("Figure " + i + "area is " + String.format("%.2f", neededLitresOfPaint));
        }
        double numberOfPaintContainers = neededLitresOfPaint / sizePaintContainer;
        System.out.println(String.format("%.2f", numberOfPaintContainers));

        if (numberOfPaintContainers > (int) numberOfPaintContainers) {
            numberOfPaintContainers = ((int) numberOfPaintContainers) + 1;
        }
        System.out.println("Litres of paint: " + String.format("%.2f", numberOfPaintContainers));
        return numberOfPaintContainers;
    }

}
