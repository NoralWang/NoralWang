package bsu.by.geometry.model;

public class Circle  implements Shape {
    private double x;
    private double y;
    private double radius;

    public Circle(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public  double calculateArea(){
        return Math.PI*radius*radius;
    }

    public double calculatePerimeter(){
        return 2*radius*Math.PI;
    }
}
