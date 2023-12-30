/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *program name: all type of methods
 * @author harid
 */
import java.util.Scanner;
public class Methods4types {

    public static void sum()
 {
     Scanner input=new Scanner(System.in);
     System.out.println("enter the 2 numbers");
     int a=input.nextInt();
     int b=input.nextInt();
     System.out.println("the sum is"+(a+b));
 }
 public static int sub()
 {
    Scanner ab=new Scanner(System.in);
     System.out.println("enter the two numbers for sub");
    int c=ab.nextInt();
    int d=ab.nextInt();
    int e;
    e=c-d;
     System.out.println("the sub is");
    return e;
 }
 public static void multi(int num1,int num2)
 {
    
     System.out.println("the multi is"+(num1*num2));
 }
 public static int divi(int num5,int num6)
 {
     int y;
     y=num5/num6;
     System.out.println("the division is ");
     return y;
 }
    public static void main(String[] args) {
    int result,result1;
        sum();
        result=sub();
        System.out.println(result);
     Scanner cd=new Scanner(System.in);
     System.out.println("enter the  2 numbers for multi");
     int num1=cd.nextInt();
     int num2=cd.nextInt();
     multi(num1,num2);
     System.out.println("enter the 2 number for division");
     int num5=cd.nextInt();
     int num6=cd.nextInt();
     result1=divi(num5,num6);
        System.out.println(result1);
 }
}
    