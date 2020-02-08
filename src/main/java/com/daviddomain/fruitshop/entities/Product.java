package com.daviddomain.fruitshop.entities;

public class Product implements java.io.Serializable {

    private static int count = 0;
    private int pid;
    private String pname;
    private int qty;
    private double price;

    public Product() {
    }

    public Product(String pname, int qty, double price) {
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        setPid(++count);

    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPid() {
        return (this.pid);
    }

    public String getPname() {
        return (this.pname);
    }

    public int getQty() {
        return (this.qty);
    }

    public double getPrice() {
        return (this.price);
    }

    @Override
    public String toString() {
        return "Product{" + "pname=" + pname + ", qty=" + qty + ", price=" + price + '}';
    }

}
