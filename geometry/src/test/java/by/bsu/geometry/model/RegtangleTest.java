package by.bsu.geometry.model;

import bsu.by.geometry.model.Regtangle;
import bsu.by.geometry.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class RegtangleTest {
    @Test
    public void testAreaPostive() {

        Regtangle regtangle=new Regtangle(0,0,05,5);
        double area=regtangle.calculateArea();
        Assert.assertEquals(25,area,0.01);
    }

    @Test
    public void testAreaNegative() {

        Regtangle regtangle=new Regtangle(0,0,05,5);
        double area=regtangle.calculateArea();
        Assert.assertNotEquals(-25,area,0.01);
    }

    @Test
    public void testPerimeterPostive() {

        Regtangle regtangle=new Regtangle(0,0,05,5);
        double Perimter=regtangle.calculatePerimeter();
        Assert.assertEquals(20,Perimter,0.01);
    }

    @Test
    public void testPerimeterNegative() {

        Regtangle regtangle=new Regtangle(0,0,05,5);
        double Perimter=regtangle.calculatePerimeter();
        Assert.assertNotEquals(-20,Perimter,0.01);
    }
}
