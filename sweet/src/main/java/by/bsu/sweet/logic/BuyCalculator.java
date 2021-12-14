package by.bsu.sweet.logic;

import by.bsu.sweet.model.AbstractSweet;
import by.bsu.sweet.model.Division;

import java.util.List;

public class BuyCalculator {
    public double calculateTotalWeight(Division division){
        List<AbstractSweet> sweets=division.getSweets();
        double totalWeight=0;
        for (AbstractSweet sweet:sweets) {
            totalWeight = totalWeight + sweet.getWeight();
        }
        return totalWeight;
    }

    public double calculateTotalPrice(Division division){
        List<AbstractSweet> sweets=division.getSweets();
        double totalPrice=0;
        for (AbstractSweet sweet:sweets) {
            totalPrice=totalPrice+sweet.getPrice()*sweet.getWeight();
        }
        return totalPrice;
    }

}
