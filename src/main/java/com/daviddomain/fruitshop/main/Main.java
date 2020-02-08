package com.daviddomain.fruitshop.main;

import com.daviddomain.fruitshop.boundary.ShopEngine;
import com.daviddomain.fruitshop.entities.Customer;
import com.daviddomain.fruitshop.entities.Product;
import com.daviddomain.fruitshop.entities.Shop;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Shop shop = null;

    public static void main(String[] args) {

        shop = new Shop();
        ShopEngine shopEngine = new ShopEngine();
        shop.InitializeStand();
        shop.printAvailableProducts();

        Scanner console = new Scanner(System.in);

        Customer customer = shopEngine.getCustomerInfoFromUser(console);
        List<Product> products = shopEngine.getProductsToOrder(console, shop);

        if (products == null) {
            System.out.println("Be careful with what you choose...");
        } else {
            shopEngine.prepareOrder(customer, products);
        }
    }

}
