package bsu.by.geometry;
import bsu.by.geometry.model.Regtangle;
import bsu.by.geometry.model.Triangle;
import  bsu.by.geometry.view.ShapePrinter;
import  bsu.by.geometry.model.Circle;
public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(1,1,1);
        ShapePrinter printer=new ShapePrinter();
        printer.print(circle);

        Triangle triangle=new Triangle(0,0,5,5,5,0);
        printer.print(triangle);

        Regtangle regtangle=new Regtangle(0,0,5,5);
        printer.print(regtangle);

    }


}
