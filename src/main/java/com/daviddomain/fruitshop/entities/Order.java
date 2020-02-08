package com.daviddomain.fruitshop.entities;

import java.util.List;

public class Order implements java.io.Serializable {

    private static int count = 0;
    private int pid;
    private List<Product> products;
    private int customerId;
    private int totalOrderPrice;

    public Order(List<Product> products, int customerId) {
        this.products = products;
        this.customerId = customerId;
        setPid(++count);

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTotalOrderPrice() {
        totalOrderPrice = calculateOrderPrice();
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(int totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    private int calculateOrderPrice() {
        int calculatedPrince = 0;

        if (this.products != null && this.products.size() > 0) {
            for (int i = 0; i < this.products.size(); i++) {
                calculatedPrince += this.products.get(i).getPrice();
            }
            return calculatedPrince;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Order{" + "products=" + products + ", customerId=" + customerId + ", totalOrderPrice=" + totalOrderPrice + '}';
    }

}
