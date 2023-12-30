/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : fibonacci series
 * @author harid
 */
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
Scanner ab = new Scanner(System.in);
System.out.println("enter the fibonacci number");
int a=ab.nextInt();
int b=0,c=1,d,e;
    System.out.println(b);
    System.out.println(c);
    for(d=2;d<=a;d++)
    {
        e=b+c;
        System.out.println(e);
        b=c;
        b=e;
    }
        
    }
 
}
