/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atm_Machine;

/**
 *
 * @author harid
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main_page {
  public static void login()
  {
      System.out.println("welcome to bank of india\n"+"press 1 for admin login \t"+"press 2 for user login");  
 Scanner ab=new Scanner(System.in);
int a=ab.nextInt();
if(a==1)
{
    System.out.println("admin login");
    Admin();
} 
if(a==2)
{
    System.out.println("user login");
    user();
}
  }
public static void Admin()
{
    System.out.println("Enter the Admin Id");
    Scanner ac=new Scanner(System.in);
    String adminname=ac.nextLine();
    System.out.println("Enter the Password");
    String Pass=ac.nextLine();
    if(adminname.equals("admin")&&Pass.equals("12345"))
    {
        System.out.println("Press 1 for Creating User Account\n"+"press 2 for view particular account\n"+"Press 3 for View all Account\n"+"press 4 for Update Account\n"+"Press 5 for Delete Account\n" +"press 6 for Exit"); 
    int input=ac.nextInt();
   switch(input)
   {
       case 1:
        AccountCreation(); 
        break;
       case 2:
         ParticularAccount();
         break;
       case 3:
           viewallacount();
           break;
       case 4:
           updateAccount();
           break;
       case 5:
           DeleteAccount();
           break;
       case 6:
           login();
           break;
       default:
           System.out.println("Wrong selection");
           
   }
    
    }
}   
public static void AccountCreation()      
{
    
    Scanner acr =new Scanner(System.in);
    System.out.println("enter the user name");
    String name=acr.nextLine();
    System.out.println("enter the phone number");
    String phoneno=acr.nextLine();
    System.out.println("enter the address");
    String address=acr.nextLine();
    System.out.println("enter the deposit amount");
    int amount=acr.nextInt();
    System.out.println("enter the Account number");
    int Acccno=acr.nextInt();
    System.out.println("enter the pin");
    int pin=acr.nextInt();
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
          PreparedStatement pst=con.prepareStatement("insert into Userdb values(?,?,?,?,?,?)");
          pst.setInt(1, Acccno);
          pst.setString(2, name);
          pst.setString(3, phoneno);
          pst.setInt(4, pin);
          pst.setString(5, address);
          pst.setInt(6, amount);
          pst.executeUpdate();
          pst.close();
          System.out.println("The Details are added\n");
          System.out.println("press 1 for Create new Account\n"+"press 2 for main menu");
         
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
     int choice=acr.nextInt();
          switch(choice)
                  {
              case 1:
                  AccountCreation();
                  break;
              case 2:
                  Admin();
                  break;
              default:
                  System.out.println("wrong selection");
                  
                  
                  }
      
}
public static void ParticularAccount()
{
    Scanner pa=new Scanner(System.in);
    System.out.println("enter the account number");
    int accno=pa.nextInt();
    
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select *from userdb");
          while(rs.next())
          {
     if(rs.getInt(1)==accno)
     {
         System.out.println(rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));   
     }
 }     
      rs.close();
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("press 1 for to view particular account\t"+"press 2 for Admin menu");
      int input=pa.nextInt();
      switch(input)
      {
          case 1:
              ParticularAccount();
              break;
          case 2:
              Admin();
              break;
          default:
              System.out.println("wrong selection");
              
      }
    
}
public static void viewallacount()
{
    Scanner va=new Scanner(System.in);
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select *from userdb");
          while(rs.next())
          {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t\t\t\t"+rs.getString(6));  
         }
          
          rs.close();
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("press 1 for view all account menu\t"+"press 2 for admin login");
      int input =va.nextInt();
      switch(input)
      {
          case 1:
              viewallacount();
              break;
          case 2:
              Admin();
              break;
          default:
              System.out.println("Wrong selection");
      }
      
      
}
public static void updateAccount()
{
    Scanner ua=new Scanner(System.in);
    
    System.out.println("Enter the name");
    String name=ua.nextLine();
   /* System.out.println("Enter the phone no");
    String phnno=ua.nextLine();
    System.out.println("Enter the pin no");
    String pin=ua.nextLine();
    System.out.println("Enter the Address");
    String Address=ua.nextLine();
    System.out.println("enter the balance amount");
    String balance=ua.nextLine();*/
    System.out.println("enter the account no");
    int accno=ua.nextInt();
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
          
         PreparedStatement pst=con.prepareStatement("update userdb set Name=? where AccountNo=?");
         
         pst.setString(1, name);
         pst.setInt(2, accno);
         pst.executeUpdate();
          System.out.println("updated to the list");
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println("press 1 for update menu"+"press 2 for admin menu");
int input=ua.nextInt();
switch(input)
{
    case 1:
        updateAccount();
        break;
    case 2:
        Admin();
        break;
    default:
         System.out.println("Wrong selection");
}

}
public static void DeleteAccount()
{
    Scanner da=new Scanner(System.in);
    System.out.println("Enter the account number");
    int accno=da.nextInt();
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
          PreparedStatement pst=con.prepareStatement("delete from userdb where AccountNo=? ");
          pst.setInt(1,accno);
          pst.executeUpdate();
          System.out.println("The selected account no was deleted"); 
 pst.close();
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
    System.out.println("press 1 for delete account\t"+"press 2 for admin menu");  
int input=da.nextInt();
switch(input)
        {
    case 1:
        DeleteAccount();
        break;
    case 2:
        Admin();
        break;
    default:
         System.out.println("Wrong selection");
        }


}
public static void user()
{
    Scanner us=new Scanner(System.in);
    System.out.println("press 1 for check Balance\n"+"press 2 for Withdraw\n"+"press 3 for Deposit\n"+"press 4 for pin change\n"+"press 5 for exit");
int input=us.nextInt();
switch(input)
{
    case 1:
        balance();
        break;
    case 2:
        withdraw();
        break;
    case 3:
        deposit();
        break;
    case 4:    
        pinchange();
        break;
    case 5:
        login();
        break;
    default :
        System.out.println("wrong selection");
}


}
public static void balance()
{
    Scanner b=new Scanner(System.in);
    System.out.println("enter the accouunt no");
    int accno=b.nextInt();
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select *from userdb");
          while(rs.next())
          {
              if(rs.getInt(1)==accno)
              {
              System.out.println(rs.getInt(6));
          }
          }
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
 user();
}
public static void withdraw()
{
    Scanner w=new Scanner(System.in);
    System.out.println("enter the account number");
    int accno=w.nextInt();
    System.out.println("enter thr pin");
    int pin=w.nextInt();
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select *from userdb");
          while(rs.next())
          {
              if(rs.getInt(1)==accno&&rs.getInt(4)==pin)
              {
                 int acountno=rs.getInt(1);
                int balance=rs.getInt(6);
                int pinsql =rs.getInt(4);
                  System.out.println(acountno+"\t"+balance);
                  System.out.println("enter the withdraw amount");
                  int wat=w.nextInt();
                  int wba=balance-wat;
                  System.out.println("Remaining Balance ="+wba);
                  PreparedStatement pst =con.prepareStatement("update userdb set Balance=? where AccountNo=?");
                  pst.setInt(1,wba);
                  pst.setInt(2,acountno );
                  pst.executeUpdate();
             }
          }
         
          
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
    user();
}
public static void deposit()
{
    Scanner d=new Scanner(System.in);
    System.out.println("enter the account number");
    int accno=d.nextInt();
    System.out.println("enter thr pin");
    int pin=d.nextInt();
    
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select *from userdb");
          while(rs.next())
          {
              if(rs.getInt(1)==accno&&rs.getInt(4)==pin)
              {
              int acountno=rs.getInt(1);
                int balance=rs.getInt(6);
                int pinsql =rs.getInt(4);
                  System.out.println("Account no="+acountno+"\t"+"Balance="+balance);
                  System.out.println("enter the Deposit amount");
                  int wat=d.nextInt();
                  int wba=balance+wat;
                  System.out.println("Remaining Balance ="+wba);
                  PreparedStatement pst =con.prepareStatement("update userdb set Balance=? where AccountNo=?");
                  pst.setInt(1,wba);
                  pst.setInt(2,acountno );
                  pst.executeUpdate();
          }            
          } 
           
      }catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
      user();
}
public static void pinchange()
{
    Scanner p=new Scanner(System.in);
    System.out.println("enter the account number");
    int accno=p.nextInt();
    System.out.println("enter the pin");
    int pinch=p.nextInt();
      try {
          Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/atm_concept","root","");
           PreparedStatement pst=con.prepareStatement("update userdb set pin=? where AccountNo=?");
           pst.setInt(1, pinch);
           pst.setInt(2,accno);
           pst.executeUpdate();
           System.out.println("updated");
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
      }
}

public static void main(String[] args) {   
     login();
    }
    
}
