package sda.arpjava.solid.lsp;

public class BorderedRectangle extends Rectangle{
    protected double stroke;

    public BorderedRectangle(double width, double height) {
        super(width, height);
    }

    public BorderedRectangle(double width, double height, double stroke) {
        super(width, height);
        this.stroke = stroke;
    }
}
