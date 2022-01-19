package by.bsu.sweet.logic;

import by.bsu.sweet.model.AbstractSweet;
import by.bsu.sweet.model.ChocalateSweet;
import by.bsu.sweet.model.DonutSweet;
import by.bsu.sweet.model.Present;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PresentCalculatorTest {

    @Test
    public void testWeightPostive() {
        PresentCalculator presentCalculator=new PresentCalculator();
        Present present = new Present();

        ChocalateSweet chocalateSweet=new ChocalateSweet("Extra Unt",1.0,3.0,"Black");
        DonutSweet donutSweet=new DonutSweet("Strawberry",3,9,"Pink");
        present.add(chocalateSweet);
        present.add(donutSweet);
        double weight=presentCalculator.calculateTotalWeight(present);
        Assert.assertEquals(4.0,weight,0.01);
    }

    @Test
    public void testWeightNegative() {
        PresentCalculator presentCalculator=new PresentCalculator();
        Present present = new Present();
        ChocalateSweet chocalateSweet=new ChocalateSweet("Extra Unt",1.0,3.0,"Black");
        DonutSweet donutSweet=new DonutSweet("Strawberry",3,9,"Pink");
        present.add(chocalateSweet);
        present.add(donutSweet);
        double weight=presentCalculator.calculateTotalWeight(present);
        Assert.assertNotEquals(-1.0,weight,0.01);
    }

    @Test
    public void testPricePostive() {
        PresentCalculator presentCalculator=new PresentCalculator();
        Present present = new Present();
        ChocalateSweet chocalateSweet=new ChocalateSweet("Extra Unt",1.0,3.0,"Black");
        DonutSweet donutSweet=new DonutSweet("Strawberry",3,9,"Pink");
        present.add(chocalateSweet);
        present.add(donutSweet);
        double price=presentCalculator.calculateTotalPrice(present);
        Assert.assertEquals(30,price,0.01);
    }

    @Test
    public void testPriceNegative() {
        PresentCalculator presentCalculator=new PresentCalculator();
        Present present = new Present();
        ChocalateSweet chocalateSweet=new ChocalateSweet("Extra Unt",1.0,3.0,"Black");
        DonutSweet donutSweet=new DonutSweet("Strawberry",3,9,"Pink");
        present.add(chocalateSweet);
        present.add(donutSweet);
        double price=presentCalculator.calculateTotalPrice(present);
        Assert.assertNotEquals(-3.0,price,0.01);
    }
}
