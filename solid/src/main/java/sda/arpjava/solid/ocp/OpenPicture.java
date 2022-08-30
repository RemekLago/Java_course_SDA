package sda.arpjava.solid.ocp;

import java.util.ArrayList;
import java.util.List;
//Ta klasa jest otwarta na rozszerzenia, jest zgodna z Open/Close Principle
public class OpenPicture {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void draw(){
        for(Shape shape: shapes){
            shape.draw();
        }
    }
}
