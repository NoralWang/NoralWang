package by.bsu.sweet.logic;

import by.bsu.sweet.model.ChocalateSweet;
import by.bsu.sweet.model.DonutSweet;
import org.junit.Assert;
import org.junit.Test;

public class BuyCalculator {
    @Test
    public void testWeightPostive() {
        ChocalateSweet chocalateSweet=new ChocalateSweet("black chocalate",1.0,3.0,"black");
        double weight=chocalateSweet.getWeight();
        Assert.assertEquals(1.0,weight,0.01);
    }

    @Test
    public void testWeightNegative() {
        ChocalateSweet chocalateSweet=new ChocalateSweet("black chocalate",1.0,3.0,"black");
        double weight=chocalateSweet.getWeight();
        Assert.assertNotEquals(-1.0,weight,0.01);
    }

    public void testPricePostive() {
        ChocalateSweet chocalateSweet=new ChocalateSweet("black chocalate",1.0,3.0,"black");
        double price=chocalateSweet.getPrice();
        Assert.assertEquals(3.0,price,0.01);
    }

    @Test
    public void testPriceNegative() {
        ChocalateSweet chocalateSweet=new ChocalateSweet("black chocalate",1.0,3.0,"black");
        double price=chocalateSweet.getPrice();
        Assert.assertNotEquals(3.0,price,0.01);
    }

    @Test
    public void testWeight1Postive() {
        DonutSweet donutSweet=new DonutSweet("Strawberry",3.0,9.0,"Pink");
        double weight=donutSweet.getWeight();
        Assert.assertEquals(3.0,weight,0.01);
    }

    @Test
    public void testWeight1Negative() {
        DonutSweet donutSweet=new DonutSweet("Strawberry",3.0,9.0,"Pink");
        double weight=donutSweet.getWeight();
        Assert.assertNotEquals(-1.0,weight,0.01);
    }

    public void testPrice1Postive() {
        DonutSweet donutSweet=new DonutSweet("Strawberry",3.0,9.0,"Pink");
        double price=donutSweet.getPrice();
        Assert.assertEquals(27.0,price,0.01);
    }

    @Test
    public void testPrice1Negative() {
        DonutSweet donutSweet=new DonutSweet("Strawberry",3.0,9.0,"Pink");
        double price=donutSweet.getPrice();
        Assert.assertNotEquals(-3.0,price,0.01);
    }
}
