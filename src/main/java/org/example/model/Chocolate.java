package org.example.model;

public class Chocolate extends ProductForSale{

    private String name;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, String name) {
        super(type, price, description);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate{" +
                "name='" + name + '\'' +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}');
    }
}
