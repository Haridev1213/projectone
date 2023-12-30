/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hari;

/**
 *
 * @author harid
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Hari {
    public static void main(String[] args) {
    //Scanner dn=new Scanner(System.in);
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hari","root","");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from employeedetails");
        System.out.println("Id Name  Gender age");
       while(rs.next())
        
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" ");
        
        con.close();
    }
    
catch(Exception e)
{
    System.out.println("error");
}
  
    
}
}