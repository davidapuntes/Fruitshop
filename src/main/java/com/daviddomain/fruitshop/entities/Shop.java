package com.daviddomain.fruitshop.entities;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Product> availableProducts;

    public Shop() {

    }

    public ArrayList<Product> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(ArrayList<Product> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public String printAvailableProducts() {

        String sep = System.getProperty("line.separator");
        StringBuffer buffer = new StringBuffer();
        buffer.append(sep);

        for (int i = 0; i < this.availableProducts.size(); i++) {
            buffer.append("Product " + this.availableProducts.get(i).getPname() + " Price: "
                    + this.availableProducts.get(i).getPrice() + " Qty: " + this.availableProducts.get(i).getQty()
            );
        }

        return buffer.toString();
    }

    public double getPriceOfAvailableProductByName(String productName) {

        for (int i = 0; i < this.availableProducts.size(); i++) {
            if (this.availableProducts.get(i).getPname().equalsIgnoreCase(productName)) {
                return this.availableProducts.get(i).getPrice();
            }

        }

        return 0;
    }

    public void InitializeStand() {

        Product pear = new Product("Pear", 50, 1.25);
        Product watermelon = new Product("Watermelon", 50, 2.55);
        Product apple = new Product("Apple", 50, 0.75);

        this.availableProducts.add(pear);
        this.availableProducts.add(watermelon);
        this.availableProducts.add(apple);

    }

}
