/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : palindrome
 * @author harid
 */
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
    System.out.println("enter the number");
int num=input.nextInt();
int num1,num3,num2=0;
num3=num;
while(num>0)
{
  num1=num%10;
    num2=(num2*10)+num1;
    num=num/10;
}
    System.out.println(num2);
if(num2==num3)
        System.out.println("the given number ia a palindrome");
else
        System.out.println("the given number is not a palindrome");
}
}
