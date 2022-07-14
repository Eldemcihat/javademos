package com.example.springintro;

public class CustomerDal implements ICustomerDal{
    String connectionString;
    public String getConnectionString() {
        return connectionString;
    }
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    @Override
    public void add() {
        System.out.println(this.connectionString);
        System.out.println("oracle eklendi.");        
    }
    
}
