package com.example;

public class App 
{
    public static void main( String[] args )
    {
        int toplam;
        sayiBul();
        toplam=topla(16,5,15);
        System.out.println(toplam);
        System.out.println(topla(6,8,9));
        
    }
    public static int topla(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static void sayiBul(){
        int dizi[] ={1,9,6,3,4};
        int aranacak=3;
        boolean varMi=false;
        for(int sayi:dizi){
            if(sayi==aranacak)
            {
                varMi=true;
                break;
            }
        }
        if(varMi==true){
            mesajVer("aranan sayı dizide mevcut : "+aranacak);
        }
        else{
            mesajVer("Aranan sayı dizide mevcut değil : "+aranacak);
        }
    } public static void mesajVer(String mesaj){
        System.out.println(mesaj); }
}
