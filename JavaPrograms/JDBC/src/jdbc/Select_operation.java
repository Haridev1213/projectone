/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Program name : Select the details from the sql and retrieve the details from the netbeans
 * @author harid
 */

public class Select_operation {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/dbms","root","");
            Statement st=con.createStatement();
            String sql="Select *from student_details";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                String id=String.valueOf(rs.getInt("Id"));
                String name=rs.getString("Name");
                String phoneno=rs.getString("PhoneNo");
                String Age=rs.getString("Age");
                //String details[]={id,name,phoneno,Age};
                System.out.println(id+"\t"+name+"\t\t"+phoneno+"\t"+Age);    
            }
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Select_operation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Select_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
    
    
}
