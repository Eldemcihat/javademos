package com.example;

public class App 
{
    public static void main( String[] args )
    {      
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new TarimKrediManager());  //AskerKrediManager değil de diğer managerleri kullandığımızda da sorun çıkarmayacaktır.     
    }
}
