package org.example.model;

public class Bread extends ProductForSale{

    private int gr;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, int gr) {
        super(type, price, description);
        this.gr = gr;
    }

    public int getGr() {
        return gr;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread{" +
                "gr='" + gr + '\'' +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}');
    }
}
