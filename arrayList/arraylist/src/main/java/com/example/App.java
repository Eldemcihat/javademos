package com.example;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("ankara");

        for(Object i: sayilar){
            System.out.println(i);
        }
    }
}
