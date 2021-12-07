package by.bsu.geomerty.model;

import bsu.geomerty.model.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testArean(){
        Circle circle = new Circle(1,1,1);
        double arean = circle.calculateArean();
        Assert.assertEquals(3.14,arean,0.01);
    }
}
