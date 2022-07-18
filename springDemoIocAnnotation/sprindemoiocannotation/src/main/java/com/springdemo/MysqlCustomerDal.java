package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MysqlCustomerDal implements ICustomerDal{
    @Value("${database.connectionString}")
    String connectionString;
    
    public String getConnectionString() {
        return connectionString;
    }
    public void setConnectionString(String connectionString){
        this.connectionString = connectionString;
    }
    @Override
    public void add() {      
        System.out.println("mysql veritabanı");
        System.out.println("Connection String Length : "+ connectionString.length());
    }
}