/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workspace;

/**
 *
 * @author harid
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Insertion {
    
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the name");
    String name = input.nextLine();
    System.out.println("enter the phone no");
    String phoneno=input.nextLine();
    System.out.println("enter the age");
    int age=input.nextInt();
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/workshop","root","");
        PreparedStatement pst=con.prepareStatement("insert into studentdetails values(?,?,?)");
        pst.setString(1,name);
        pst.setString(2, phoneno);
        pst.setInt(3, age);
        pst.executeUpdate();
        System.out.println("The details are updated to the Database");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Insertion.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Insertion.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    }    
}
