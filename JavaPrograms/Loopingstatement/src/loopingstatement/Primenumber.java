/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : to find a prime number
 * @author harid
 */
import java.util.Scanner;
public class Primenumber {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
int num=input.nextInt();
int num1=2;
while(num1<num)
{
 if(num%num1==0)
 {    
     System.out.println("the given number is not a plindrome");
 break;
 }
 num1++;
if(num==num1)
        System.out.println("the given number is  a prime number");  

}}}
