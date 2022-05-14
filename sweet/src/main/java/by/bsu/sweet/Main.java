package by.bsu.sweet;

import by.bsu.sweet.logic.PresentCalculator;
import by.bsu.sweet.model.ChocalateSweet;
import by.bsu.sweet.model.Present;
import by.bsu.sweet.model.DonutSweet;
import by.bsu.sweet.view.BuyPrinter;

public class Main {
    public static void main(String[] args) {
        Present present =new Present();

        ChocalateSweet chocalateSweet=new ChocalateSweet("Extra Unt",1.0,3.0,"Black");
        DonutSweet donutSweet=new DonutSweet("Strawberry",3,9,"Pink");

        present.add(chocalateSweet);
        present.add(donutSweet);

        BuyPrinter printer=new BuyPrinter();
        printer.print(present);

        PresentCalculator calculator=new PresentCalculator();
        double totalweight=calculator.calculateTotalWeight(present);
        System.out.println("Total weight="+totalweight);

        PresentCalculator pricecalculator=new PresentCalculator();
        double totalPrice=calculator.calculateTotalPrice(present);
        System.out.println("Total Price="+totalPrice);

    }
}
