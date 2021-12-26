package by.bsu.sweet.logic;

import by.bsu.sweet.model.AbstractSweet;
import by.bsu.sweet.model.Present;

import java.util.List;

public class PresentCalculator {
    public double calculateTotalWeight(Present present){
        List<AbstractSweet> sweets= present.getSweets();
        double totalWeight=0;
        for (AbstractSweet sweet:sweets) {
            totalWeight = totalWeight + sweet.getWeight();
        }
        return totalWeight;
    }

    public double calculateTotalPrice(Present present){
        List<AbstractSweet> sweets= present.getSweets();
        double totalPrice=0;
        for (AbstractSweet sweet:sweets) {
            totalPrice=totalPrice+sweet.getPrice()*sweet.getWeight();
        }
        return totalPrice;
    }

}
