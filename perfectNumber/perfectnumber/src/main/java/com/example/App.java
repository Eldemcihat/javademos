package com.example;

public class App 
{
    public static void main( String[] args )
    {

        int number=7;
        int temp=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                temp+=i;
            }
        }
        if(number==temp)
        {
            System.out.println(number + " mukemmel sayidir.");
        }
        else{
            System.out.println(number + " mukemmel sayi değildir.");
        }
    }
}
