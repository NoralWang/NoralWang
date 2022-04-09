package by.bsu.geometry.model;

import bsu.by.geometry.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testAreaPostive() {
        Triangle triangle=new Triangle(0,0,05,5,5,0);
        double area=triangle.calculateArea();
        Assert.assertEquals(12.5,area,0.01);
    }

    @Test
    public void testAreaNegative() {
        Triangle triangle=new Triangle(0,0,05,5,5,0);
        double area=triangle.calculateArea();
        Assert.assertNotEquals(-12.5,area,0.01);
    }

    @Test
    public void testPerimeterPostive() {
        Triangle triangle=new Triangle(0,0,05,5,5,0);
        double perimeter=triangle.calculatePerimeter();
        Assert.assertEquals(17.07,perimeter,0.01);
    }

    @Test
    public void testPerimeterNegative() {
        Triangle triangle=new Triangle(0,0,05,5,5,0);
        double perimeter=triangle.calculatePerimeter();
        Assert.assertNotEquals(-12.0,perimeter,0.01);
    }

}
