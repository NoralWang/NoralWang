package bsu.by.geometry.model;

public class Triangle implements Shape{

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double perimeter;
    private double area;
    private double a;
    private double b;
    private double c;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;

        double a=Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2));
        double b=Math.sqrt(Math.pow(Math.abs(x1-x3),2)+Math.pow(Math.abs(y1-y3),2));
        double c=Math.sqrt(Math.pow(Math.abs(x3-x2),2)+Math.pow(Math.abs(y3-y2),2));

        this.a=a;
        this.b=b;
        this.c=c;

    }

    @Override
    public double calculateArea() {
        double halen=0;
        halen=(a+b+c)/2;
        area=Math.sqrt(halen*(halen-a)*(halen-b)*(halen-c));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter=a+b+c;
        return perimeter;
    }
}
