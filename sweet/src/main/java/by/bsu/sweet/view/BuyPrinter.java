package by.bsu.sweet.view;

import by.bsu.sweet.model.AbstractSweet;
import by.bsu.sweet.model.Division;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class BuyPrinter {
    public void print(Division division){

        List<AbstractSweet> sweets=division.getSweets();

        for (AbstractSweet sweet:sweets) {
            System.out.println("Name="+sweet.getName());
            System.out.println("Weight="+sweet.getWeight());
            System.out.println("Price="+sweet.getPrice()*sweet.getWeight());
        }

    }
}
