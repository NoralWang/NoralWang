package bsu.by.geometry.model;

public class Regtangle implements Shape{

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Regtangle(double x1,double y1,double x2,double y2){

        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    @Override
    public double calculateArea() {
        double x=Math.abs(x1-x2);
        double y=Math.abs(y1-y2);
        return x*y;
    }

    @Override
    public double calculatePerimeter() {
        double x=Math.abs(x1-x2);
        double y=Math.abs(y1-y2);

        return 2*(x+y);
    }
}
