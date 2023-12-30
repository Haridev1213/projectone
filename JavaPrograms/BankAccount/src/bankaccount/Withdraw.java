/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author harid
 */
import java.util.Scanner;
 class Withdraw {
   Scanner ab=new Scanner(System.in);
   void wd(int be)
   {
       System.out.println("enter the withdraw amount");
       int a=ab.nextInt();
       Balance bale=new Balance();
      
        int rb;
        rb=be-a;
       System.out.println("Remaining balance is"+rb);
       
       
   }


}
