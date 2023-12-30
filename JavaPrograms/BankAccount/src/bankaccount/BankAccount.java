/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *program name : Hierachical inheritance  in bank account
 * @author harid
 */
import java.util.Scanner;
class BankAccount {
Scanner ab=new Scanner(System.in);
void Input()
{
    System.out.println("Enter the account number");
    long accno=ab.nextLong();
    System.out.println("enter rhe pin");
    int pin=ab.nextInt();
    if(accno==12345678&&pin==1234)
    {
        System.out.println("Processing your bank details");   
    }
    else
    {
        System.out.println("The account number or password is wrong");
    }
    System.out.println("press 1 for checking balance\npress 2 for withdraw\npress 3 for deposit");
    int a=ab.nextInt();
    if(a==1&&a==2&&a==3)
    {
        System.out.println("processing");     
    }
    else
    {
        System.out.println("wrong selection");
    }
}    
}
