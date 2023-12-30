/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *project name: function without argument without return type 
 * @author harid
 */
import java.util.Scanner;
public class Functions {
public static void sum()
{
int num3;
Scanner input=new Scanner(System.in);
    System.out.println("enter the 2 numbers");
int num1=input.nextInt();
int num2=input.nextInt();
num3=num1+num2;
System.out.println("the sum is "+num3);
} 
public static void main(String[] args) {    
sum();
}
}


