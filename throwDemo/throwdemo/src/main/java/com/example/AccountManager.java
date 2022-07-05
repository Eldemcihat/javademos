package com.example;

public class AccountManager {
    private double balance;

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount) throws BalanceInsufficentException{
        if(balance-amount>0){
            balance-=amount; 
        }
        else{
           throw new BalanceInsufficentException("bakiye yetersiz. ");
        }
       

    }

}
