package bsu.by.geometry.view;
import bsu.by.geometry.model.Shape;
public class ShapePrinter {
    public void print (Shape shape){
        System.out.println("Figure is " + shape.getClass().getSimpleName());
        System.out.println("Area is " + shape.calculateArea());
        System.out.println("Perimeter is " + shape.calculatePerimeter());

    }
}
