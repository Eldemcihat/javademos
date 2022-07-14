package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class MssqlCustomerDal implements ICustomerDal{
    
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
    }
    
}
