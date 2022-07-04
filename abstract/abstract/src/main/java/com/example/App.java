package com.example;

public class App 
{
    public static void main( String[] args )
    {
      CustomerManager customerManager = new CustomerManager();
      customerManager.dataBaseManager= new SqlServerDatabaseManager();
      customerManager.getCustomer();


    }
}
