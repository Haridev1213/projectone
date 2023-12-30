/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatement;

/**
 *program name : switch statement addition operation
 * @author harid
 */import java.util.Scanner;
public class switchoperation {
     public static void main(String[] args) {
         Scanner ab=new Scanner(System.in);
         System.out.println("enter the two number");
         int a=ab.nextInt();
         int b=ab.nextInt();
        System.out.println("enter the number\n 1 addition \n 2 subtraction \n 3 multiplication \n 4 division \n 5  exit");
        int c=ab.nextInt();
        switch(c) 
        {
            case 1:
                System.out.println("the sum is\t"+(a+b));
                break;
            case 2:
                System.out.println("the subtraction is\t"+(a-b));
                break;
            case 3:
                System.out.println("the multiplcation is"+(a*b));
                break;
            case 4:
                System.out.println("the division is"+(a/b));
                break;
            default:
                System.out.println("thakyou");
        }
    }
 
}
