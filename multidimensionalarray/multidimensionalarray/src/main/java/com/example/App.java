package com.example;

public class App 
{
    public static void main( String[] args )
    {
     String[][] sehirler = new String[3][3];
     sehirler[0][0]="İstanbul";
     sehirler[0][1]="Tekirdağ";
     sehirler[0][2]="Edirne";
     sehirler[1][0]="Konya";
     sehirler[1][1]="Ankara";
     sehirler[1][2]="Aksaray";
     sehirler[2][0]="Şanlıurfa";
     sehirler[2][1]="Gaziantep";
     sehirler[2][2]="Kahramanmaraş";
    
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(i==0)
            {
                System.out.println(sehirler[i][j]+" - Marmara Bölgesi");
            }
            else if(i==1)
            {
                System.out.println(sehirler[i][j]+" - İç anadolu Bölgesi");
            }
            else
            {
                System.out.println(sehirler[i][j]+" - Güneydoğu anadolu Bölgesi");
            }
        }  
    }
    }
}
