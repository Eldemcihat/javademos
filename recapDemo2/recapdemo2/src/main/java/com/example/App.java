package com.example;

import java.security.Provider.Service;

public class App 
{
    public static void main( String[] args )
    {
        double temp=0;
        double[] sayilar = {1.2,15.4,65.7,8.4};
        double max=sayilar[0];
        for(double number : sayilar){
           if(max<number)
           {
            max = number;
           }
            temp+=number;
        }
    System.out.println("en büyük : "+max);
    System.out.println("toplamları : "+temp);
    }          
}

