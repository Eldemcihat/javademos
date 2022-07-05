package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("ankara");
        sehirler.add("adana");
        sehirler.add("mersin");
        sehirler.add("konya");
        sehirler.add("bursa");
        System.out.println(sehirler);
        Collections.sort(sehirler);
        for(String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}
