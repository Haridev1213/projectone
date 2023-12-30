/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *program name: all methods of odd and even factorial multiplication table terinary operator
 * @author harid
 */
import java.util.Scanner;
public class Alltypeofmethods {
public static void main(String[] args) {
int result;
String result1;
    oddoreven();
    result=factorial();
    System.out.println(result);
    Scanner cd=new Scanner(System.in);
    System.out.println("enter the table");
    int num2=cd.nextInt();
    table(num2);
    System.out.println("enter the year to check leap year");
    int num3=cd.nextInt();
    result1=terinary(num3);
    System.out.println(result1);
    }
           
public static void oddoreven()   
{
  Scanner input=new Scanner(System.in);
    System.out.println("enter the number to check odd or even");
  int num=input.nextInt();
  if(num%2==0)
        System.out.println("the given number is even");
  else
        System.out.println("the given number is odd");
}
public static int factorial()
{
   Scanner ab=new Scanner(System.in);
    System.out.println("enter the number for factorial");
   int num1=ab.nextInt();
   int fact=1;
   for(int i=1;i<=num1;i++)
   {
      fact=fact*i;
   } 
    System.out.println("the factorial is");
    return fact;
}
public static void table(int num2)
{
for(int i=1;i<=10;i++)
{
  int multi;
multi=i*num2;
    System.out.println(multi);
}   
}
public static String terinary(int num3)
{
 String result=(num3%4==0)?"the given year is a leap year":"the given year is not a leap year"; 
 return result;
}        
}
