package bsu.geomerty.view;

import bsu.geomerty.model.Shape;

public class ShapePrint {

    public void  print(Shape shape){
        System.out.println("Figure is " + shape.getClass().getSimpleName());
        System.out.println("Arean is " + shape.calculateArean());
        System.out.println("Perimeter is " + shape.calculatePerimeter());
    }

}
