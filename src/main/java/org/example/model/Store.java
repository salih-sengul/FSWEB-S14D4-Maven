package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate = new Chocolate("Sütlü çikolata",30,"süt tadında enfes çikolata","eti sütlü çikolata");

        ProductForSale coke = new Coke("zero",40,"şekersiz kola",true);

        ProductForSale bread = new Bread("kepekli",15,"beyaz ekmekten sağlıklı",200);

        ProductForSale[] products = {chocolate,coke,bread};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}