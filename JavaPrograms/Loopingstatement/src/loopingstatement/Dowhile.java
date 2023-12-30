/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name: do while factorial
 * @author harid
 */
import java.util.Scanner;
public class Dowhile {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter the factoril number");
int a=input.nextInt();
int fact=1,i=1;
do
{
  fact=fact*a;
a--;
}while(a>i);  
    System.out.println(fact);
}
}
