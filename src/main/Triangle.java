package main;

public class Triangle {

    private double x;
    private double y;
    private double radius;

    public Triangle(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getArea(){

        return x*y*(1/2);
    }
}
