package com.example;

public class App 
{
    public static void main( String[] args )
    {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
        CustomerManager customerManager2 = new CustomerManager(new SqlCustomerDal());
        customerManager2.add();
    }
}
