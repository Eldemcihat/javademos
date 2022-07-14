package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
public class App
{       
    public static void main( String[] args ) throws SQLException
    {
        Connection connection=null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement=null;
        try {
            connection = helper.getConnection();
            statement = connection.prepareStatement("insert into city(Name,CountryCode,District,Population) values('Düzce','TUR','Düzce','50000')");
            int result =  statement.executeUpdate();
            System.out.println(result);

        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }finally{           
            statement.close();
            connection.close();

        }
    }

    public static void selectDemo() throws SQLException{
        Connection connection=null;
        DbHelper helper = new DbHelper();
        java.sql.Statement statement=null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT code,name,region,Continent FROM world.country");
            // while(resultSet.next()){
            //     System.out.println(resultSet.getString("name"));
            //     System.out.print("-");
            //     System.out.println(resultSet.getString("region"));
            //     System.out.print("-");
            //     System.out.println(resultSet.getString("code"));
            //     System.out.println("");
            // }
            ArrayList<Country> countries = new ArrayList<>();             
            
            while(resultSet.next()){
                 countries.add(new Country(
                     resultSet.getString("name"),
                     resultSet.getString("region"),
                     resultSet.getString("code")));
             }System.out.println(countries.size());
                    
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }finally{           
            connection.close();           
        }
    }
}
