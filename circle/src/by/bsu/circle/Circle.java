package by.bsu.circle;

public class Circle {
    private double x;
    private double y;
    private double radius;

    Circle(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public double getArea(){

        return Math.PI*radius*radius;
    }
}
