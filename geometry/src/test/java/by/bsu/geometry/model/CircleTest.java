package by.bsu.geometry.model;

import bsu.by.geometry.model.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testArea() {
        Circle circle=new Circle(1,1,1);
        double area=circle.calculateArea();
        Assert.assertEquals(3.14,area,0.01);
    }
}
