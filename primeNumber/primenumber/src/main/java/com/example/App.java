package com.example;

public class App 
{
    public static void main( String[] args )
    {
        int sayi=11;
        boolean isPrime=true;
        for(int i=2;i<sayi;i++)
        {
            if(sayi%i == 0)
            {
                System.out.println("Sayi asal değildir");
                isPrime=false;
                break;
            }
        }
        if(isPrime==true)
        {   
            System.out.println("Sayi asal sayidir.");
        }

    }
}
