/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daviddomain.fruitshop.boundary;

import com.daviddomain.fruitshop.control.ProductValidator;
import com.daviddomain.fruitshop.entities.Customer;
import com.daviddomain.fruitshop.entities.Order;
import com.daviddomain.fruitshop.entities.Product;
import com.daviddomain.fruitshop.entities.Shop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class ShopEngine {

    public static Customer getCustomerInfoFromUser(Scanner scanner) {

        System.out.print("Enter your name ");
        String customerName = scanner.nextLine();

        System.out.print("Enter your surname ");
        String surname = scanner.nextLine();

        Customer customer = new Customer(customerName, surname);
        return customer;

    }

    public static List<Product> getProductsToOrder(Scanner scanner, Shop shop) {

        //Empty list of orderedProducts
        List<Product> prepareProducts = new ArrayList<Product>();

        //Add first product
        Product product = prepareProduct(scanner, shop);

        if (product == null) {
            return null;
        } else {
            prepareProducts.add(product);
        }

        System.out.print("Do you want yo add a secondProduct?");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            product = prepareProduct(scanner, shop);
            if (product == null) {
                return prepareProducts;

            } else {
                prepareProducts.add(product);
                return prepareProducts;
            }

        } else {
            return prepareProducts;
        }

    }

    public static void prepareOrder(Customer customer, List<Product> products) {
        Order order = new Order(products, customer.getPid());
        System.out.println(order.toString());
    }

    private static Product prepareProduct(Scanner scanner, Shop shop) {
        // Get product name from user.
        System.out.print("Enter product name you wish to buy ");
        String productName = scanner.nextLine();

        // Get product quantity from user.
        System.out.print("Enter product quantity you wish to buy ");
        int productQuantity = scanner.nextInt();

        if (!ProductValidator.productAndQuantityAvailable(shop.getAvailableProducts(), productName, productQuantity)) {
            System.out.println("This quantity of product is not available at the store");
            return null;
        } else {
            Product product = new Product(productName, productQuantity, shop.getPriceOfAvailableProductByName(productName));
            return product;
        }
    }
}
