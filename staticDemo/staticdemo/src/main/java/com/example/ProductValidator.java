package com.example;

public class ProductValidator {
    ProductValidator(){
        System.out.println("Static constructor çalıştı.");
    }
    public static boolean isValid(Product product){
        if(!product.name.isEmpty() && product.price>0){
            return true;
        }
        else{
            return false;
        }
    }
}
