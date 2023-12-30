/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : nested while strong number
 * @author harid
 */
import java.util.Scanner;
public class Nestedwhile {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter the  number ");
int num=input.nextInt();
int num1,num2,fact,num3 = 0;
num1=num;
while(num>0)
{
    fact=1;
    num2=num%10;
  for(int i=1;i<=num2;i++)  
  {  fact=fact*i; 
}
    num3=num3+fact;
    num=num/10;
    }
    System.out.println(num3);
if(num1==num3)
        System.out.println("the given number is a strong number");
else
        System.out.println("the given number is not a strong number");
}
}