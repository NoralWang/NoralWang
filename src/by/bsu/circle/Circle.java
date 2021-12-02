package by.bsu.circle;

import org.junit.Assert;
import org.junit.Test;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public double getArea(){

        return Math.PI*radius*radius;
    }

}
