package bsu.geomerty;

import bsu.geomerty.model.Circle;
import bsu.geomerty.model.Rectangle;
import bsu.geomerty.model.Triangle;
import bsu.geomerty.view.ShapePrint;

public class Main {
    public static void main(String[] args) {
        ShapePrint printer = new ShapePrint();

        Circle circle = new Circle(1,2,3);
        printer.print(circle);

        Rectangle rectangle = new Rectangle();
        printer.print(rectangle);

        Triangle triangle = new Triangle();
        printer.print(triangle);

    }
}
