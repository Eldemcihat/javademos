package com.example;

public class App 
{
    public static void main( String[] args )
    {
        String mesaj = "bugün hava çok güzel";
        String mesaj2 = "   bugün hava çok sıcak     ";
        System.out.println(mesaj);
        System.out.println(mesaj.length()+" tane elemanı vardır. ");
        System.out.println("5.elemanı "+ mesaj.charAt(4));
        System.out.println(mesaj.indexOf("el"));
        for(String kelime : mesaj.split(" "))
        {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
