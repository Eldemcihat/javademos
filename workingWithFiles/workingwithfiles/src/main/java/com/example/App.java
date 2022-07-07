package com.example;

import java.io.File;
import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
      createFile();
    }
    public static void createFile(){
        File file = new File("C:\\javademos\\javademos\\files\\students.txt");
        try {
         if( file.createNewFile()){
             System.out.println("dosya oluşturuldu.");
         }else{
             System.out.println("dosya zaten mevcut");
         }
        
     } catch (IOException e) {
         e.printStackTrace();
     }
    }
}
