package sda.arpjava.solid.lsp;

public class Square extends Rectangle{

    public Square(double side) {
        height = side;
        width = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        setWidth(height);
    }
}