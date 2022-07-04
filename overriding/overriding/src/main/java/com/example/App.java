package com.example;

public class App 
{
    public static void main( String[] args )
    {
        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]
        {new TarimKrediManager(),new OgrenciKrediManager()};
        for(BaseKrediManager baseKrediManager:baseKrediManagers){
            System.out.println(baseKrediManager.hesapla(1000));
        }
    }
}
