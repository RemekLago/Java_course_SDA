package sda.arpjava.solid.ocp;

import java.util.ArrayList;
import java.util.List;
//Ta klasa narusza zasadę Open/Close bo
//dodanie nowej klasy dziedziczącej po Shape
//wymaga zmodyfikowania metody draw w Picture
public class Picture {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void draw(){
        //kod ignoruje metodę draw w klasie Shape
        //i klasa narusza zasadę Open/Close
        for(Shape shape: shapes){
            if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                shape.draw();
            }
            if (shape instanceof Circle){
                Circle rectangle = (Circle) shape;
                shape.draw();
            }
            //trzeba dodać kolejny if dla klasy Line
        }
    }
}