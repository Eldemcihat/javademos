package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MssqlCustomerDal implements ICustomerDal{
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
       System.out.println("mssql veritabanı");
       System.out.println("Connection String Length: "+ connectionString.length());
    }  
}
