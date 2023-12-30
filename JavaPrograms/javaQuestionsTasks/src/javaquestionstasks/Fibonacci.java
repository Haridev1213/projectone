/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquestionstasks;

/**
 *program name: Write a simple java which print a fibonacci series
 * @author harid
 */
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
int num=input.nextInt();
int num1=0,num2=1,num3,num4;
System.out.println(num2);
for(num3=2;num3<num;num3++)
{
    num4=num1+num2;
    System.out.println(num4);
    num1=num2;
    num2=num4;
}    
}
}
