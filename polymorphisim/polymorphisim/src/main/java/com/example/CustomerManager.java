package com.example;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
        this.logger.log("log mesaji. ");
    }
    public void add(){
        System.out.println("Müşteri Eklendi");
    }
}
