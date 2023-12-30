/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquestionstasks;

/**
 *program name : write a program that prompts the user to input a positive integer and with these integer multiplication table
 * @author harid
 */
import java.util.Scanner;
public class MultiplicationTable {
public static void main(String[] args) {
    
Scanner input=new Scanner(System.in);
System.out.println("enter the multiplication table");
int a=input.nextInt();
int b=1;
for(int i=1;i<=10;i++)
{
   b=i*a;
    System.out.println(b);
}    

    }
    
}
