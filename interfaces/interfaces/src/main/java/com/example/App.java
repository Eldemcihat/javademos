package com.example;

public class App 
{
    public static void main( String[] args )
    {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();                               // parantez içinde kalan kısmı ihtiyacımıza göre değiştirebiliriz.      
    }
}
