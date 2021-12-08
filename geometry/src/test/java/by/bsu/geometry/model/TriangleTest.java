package by.bsu.geometry.model;

import bsu.by.geometry.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testArea() {
        Triangle triangle=new Triangle(0,0,05,5,5,0);
        double area=triangle.calculateArea();
        Assert.assertEquals(12.5,area,0.01);
    }

    public void testPerimeter() {
        Triangle triangle=new Triangle(0,0,05,5,5,0);
        double area=triangle.calculatePerimeter();
        Assert.assertEquals(12.5,area,0.01);
    }

}
