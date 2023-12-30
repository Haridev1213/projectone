/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatement;

/**
 *program name : nested if statement
 * @author harid
 */
import java.util.Scanner;
public class Nestedif {
public static void main(String[] args) {
Scanner ab=new Scanner(System.in);
    System.out.println("enter the input of a and b"); 
    int a=ab.nextInt();
    int b=ab.nextInt();
    if(a>b)
        System.out.println("a is greater");
    if(b>a)
        System.out.println("b is greater");
    else
        System.out.println("a and b are equal");
    }
}
