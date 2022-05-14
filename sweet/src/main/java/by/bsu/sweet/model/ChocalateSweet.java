package by.bsu.sweet.model;

public class ChocalateSweet extends AbstractSweet{
    private String chocolateType;

    public ChocalateSweet(String name, double weight, double price, String chocolateType) {
        super(name, weight, price);
        this.chocolateType = chocolateType;
    }


    public String getChocolateType() {
        return chocolateType;
    }
}
