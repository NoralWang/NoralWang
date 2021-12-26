package by.bsu.sweet.logic;

import by.bsu.sweet.model.AbstractSweet;
import by.bsu.sweet.model.ChocalateSweet;
import by.bsu.sweet.model.DonutSweet;
import by.bsu.sweet.model.Present;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PresentCalculatorTest {
    Present present = null;
    @Test
    public void testWeightPostive() {
        PresentCalculator presentCalculator=new PresentCalculator();

        List<AbstractSweet> sweets= present.getSweets();
        double weight=presentCalculator.calculateTotalWeight(present);
        Assert.assertEquals(1.0,weight,0.01);
    }

    @Test
    public void testWeightNegative() {
        PresentCalculator presentCalculator=new PresentCalculator();
        List<AbstractSweet> sweets= present.getSweets();
        double weight=presentCalculator.calculateTotalWeight(present);
        Assert.assertNotEquals(-1.0,weight,0.01);
    }

    public void testPricePostive() {
        PresentCalculator presentCalculator=new PresentCalculator();
        List<AbstractSweet> sweets= present.getSweets();
        double price=presentCalculator.calculateTotalPrice(present);
        Assert.assertEquals(3.0,price,0.01);
    }

    @Test
    public void testPriceNegative() {
        PresentCalculator presentCalculator=new PresentCalculator();
        List<AbstractSweet> sweets= present.getSweets();
        double price=presentCalculator.calculateTotalPrice(present);
        Assert.assertNotEquals(3.0,price,0.01);
    }

}
