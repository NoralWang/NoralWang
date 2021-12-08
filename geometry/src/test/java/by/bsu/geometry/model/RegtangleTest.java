package by.bsu.geometry.model;

import bsu.by.geometry.model.Regtangle;
import bsu.by.geometry.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class RegtangleTest {
    @Test
    public void testArea() {
        Regtangle regtangle=new Regtangle(0,0,05,5);
        double area=regtangle.calculateArea();
        Assert.assertEquals(25,area,0.01);
    }

    public void testPerimeter() {
        Regtangle regtangle=new Regtangle(0,0,05,5);
        double area=regtangle.calculatePerimeter();
        Assert.assertEquals(20,area,0.01);
    }
}
