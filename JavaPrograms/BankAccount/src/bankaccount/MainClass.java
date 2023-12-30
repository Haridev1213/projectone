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
public class MainClass {
public static void main(String[] args) {
Deposit obj=new Deposit();
Withdraw obj1=new Withdraw();
Balance obj2=new Balance();
BankAccount obj3=new BankAccount();
obj3.Input();
obj.dep(0);
obj1.wd(0);

    
    }
    
    
}
