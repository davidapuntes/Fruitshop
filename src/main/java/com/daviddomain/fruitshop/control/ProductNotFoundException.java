
package com.daviddomain.fruitshop.control;


public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(){}
    

    public ProductNotFoundException(String msg){
     super(msg);
}
}