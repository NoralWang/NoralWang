package by.bsu.sweet.model;

public class DonutSweet extends AbstractSweet{
    private String color;

    public DonutSweet(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
