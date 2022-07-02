package com.example;

public class App 
{
    public static void main( String[] args )
    {
    Product product = new Product();
    product.setId(1);
    product.setName("laptop");
    product.setStockAmount(3);
    product.setPrice(30000);
    System.out.println(product.getId());
    System.out.println(product.getName());


    ProductManager productManager = new ProductManager();
    productManager.Add(product);
    }
}
