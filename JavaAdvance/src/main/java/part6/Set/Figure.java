package part6.Set;

public abstract class Figure implements Comparable {

    public abstract double areaFigure();

    @Override
    public int compareTo(Object obj) {
        Figure other = (Figure) obj;
        return Double.compare(this.areaFigure(), other.areaFigure());
//        return (int) (this.areaFigure() - other.areaFigure());
    }

    @Override
    public String toString() {
        return "Area: " + areaFigure();
    }
}
