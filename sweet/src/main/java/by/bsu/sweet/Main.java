package by.bsu.sweet;

import by.bsu.sweet.logic.BuyCalculator;
import by.bsu.sweet.model.ChocalateSweet;
import by.bsu.sweet.model.Division;
import by.bsu.sweet.model.DonutSweet;
import by.bsu.sweet.view.BuyPrinter;

public class Main {
    public static void main(String[] args) {
        Division division=new Division();

        ChocalateSweet chocalateSweet=new ChocalateSweet("Extra Unt",1.0,3.0,"Black");
        DonutSweet donutSweet=new DonutSweet("Strawberry",3,9,"Pink");

        division.add(chocalateSweet);
        division.add(donutSweet);

        BuyPrinter printer=new BuyPrinter();
        printer.print(division);

        BuyCalculator calculator=new BuyCalculator();
        double totalweight=calculator.calculateTotalWeight(division);
        System.out.println("Total weight="+totalweight);

        BuyCalculator pricecalculator=new BuyCalculator();
        double totalPrice=calculator.calculateTotalPrice(division);
        System.out.println("Total Price="+totalPrice);

    }
}
