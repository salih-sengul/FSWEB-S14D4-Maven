package org.example.model;

public class Coke extends ProductForSale{
    private boolean siseMi;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean siseMi) {
        super(type, price, description);
        this.siseMi = siseMi;
    }

    public boolean isSiseMi() {
        return siseMi;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke{" +
                "siseMi='" + siseMi + '\'' +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}');
    }
}
