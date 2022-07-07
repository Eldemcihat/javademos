package com.example;

public class ProductManager {

        ProductValidator productValidator = new ProductValidator();
        public void add(Product product){
            if(ProductValidator.isValid(product)){
                System.out.println("ürün eklendi");
            }
            else{
                System.out.println("ürün gerekli özelliklere sahip değil.");
            }
        }
}
