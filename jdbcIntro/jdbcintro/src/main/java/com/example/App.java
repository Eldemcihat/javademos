package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App
{   
    static String userName="root";
    static String password="12345";
    static String dbUrl="jdbc:mysql://localhost:3306/world";
    public static void main( String[] args )
    {
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("bağlantı kuruldu");
        } catch (SQLException e) {            
            e.printStackTrace();
        }finally{
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
