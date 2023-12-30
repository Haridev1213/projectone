/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author harid
 */import java.util.Scanner;
 class Deposit extends Balance extends BankAccount 
{
Scanner ab=new Scanner(System.in);
void dep(int be)
{
    bal();
System.out.println("enter the  deposit amount");    
int a=ab.nextInt();
int de;
de=be+a;
    System.out.println("the available amount is"+de);
} 
}
