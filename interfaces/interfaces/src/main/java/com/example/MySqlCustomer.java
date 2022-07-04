package com.example;

public class MySqlCustomer implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("My sql eklendi. ");        
    }
    
}
