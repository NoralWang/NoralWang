package bsu.by.geometry.model;

public class Regtangle implements Shape{

    private double x;
    private double y;

    public Regtangle(double x1,double y1,double x2,double y2){
        x=Math.abs(x1-x2);
        y=Math.abs(y1-y2);
        this.x=x;
        this.y=y;

    }
    @Override
    public double calculateArea() {
        return x*y;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(x+y);
    }
}
