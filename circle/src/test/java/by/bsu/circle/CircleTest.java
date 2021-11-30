package by.bsu.circle;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testArea(){
    Circle circle=new Circle(0,0,1);
    double area= circle.getArea();
        Assert.assertEquals(3.14,area,0.01);
    }
}
