/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *program name : Insert the details to the mysql 
 * @author harid
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Insertion_Operation {
public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("enter your name");
    String name=ab.nextLine();
    System.out.println("Enter your mobile number");
 String phoneno=ab.nextLine();
    System.out.println("Enter your Age");
    String age=ab.nextLine();
    System.out.println("enter your Id");
    int Id=ab.nextInt();
    
    System.out.println("your Details Are Added");
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/dbms","root","");
       // Statement st=con.createStatement();
        PreparedStatement pst=con.prepareStatement("insert into student_details values(?,?,?,?)");
        pst.setInt(1,Id);
        pst.setString(2, name);
        pst.setString(3, age);
        pst.setString(4, phoneno);
        pst.executeUpdate();
    con.close();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Insertion_Operation.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Insertion_Operation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    }
   
    
}
