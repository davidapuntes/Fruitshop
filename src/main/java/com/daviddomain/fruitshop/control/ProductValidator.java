/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daviddomain.fruitshop.control;

import com.daviddomain.fruitshop.entities.Product;
import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class ProductValidator {

    public static boolean productAndQuantityAvailable(ArrayList<Product> availableProducts, String productName, int quantityToPurchase) {

        boolean quantityAvailable = false;

        for (int i = 0; i < availableProducts.size(); i++) {

            if (availableProducts.get(i).getPname().equalsIgnoreCase(productName)
                    && availableProducts.get(i).getQty() > quantityToPurchase) {

            }

            {
                return true;
            }
        }

        return quantityAvailable;
    }

}
