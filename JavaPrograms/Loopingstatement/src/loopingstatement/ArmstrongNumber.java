/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : To find a Armstrong number
 * @author harid
 */
import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
int num=input.nextInt();
int num1,rem,cube,sum=0;
num1=num;
while(num>0)
{
    cube=1;
    rem=num%10;
    for(int i=1;i<=num;i++)
    {
        cube=rem*rem*rem;
    }  
    sum=sum+cube;
    num=num/10;
    }
    System.out.println(sum);
if(sum==num1)
        System.out.println("the given number is a armstrong number");
else
        System.out.println("the given number is not a armstrong number");
}
}