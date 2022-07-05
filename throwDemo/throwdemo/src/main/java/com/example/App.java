package com.example;

public class App 
{
    public static void main( String[] args )
    {
        AccountManager accountManager = new AccountManager();
        System.out.println("Bakiyeniz : "+accountManager.getBalance());
        accountManager.deposit(150);
        System.out.println("Bakiyeniz : "+accountManager.getBalance());
        try {
            accountManager.withdraw(200);
        } catch (BalanceInsufficentException e) {
            e.printStackTrace();
        }
    }
}
