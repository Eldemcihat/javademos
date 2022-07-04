package com.example;

public class App 
{
    public static void main( String[] args )
    {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name="klavye";
        product.price=1500;
        productManager.add(product);
    }
}
