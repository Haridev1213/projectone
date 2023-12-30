/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : nested for star program
 * @author harid
 */
import java.util.Scanner;
public class Nestedfor {
public static void main(String[] args) {
Scanner inpu=new Scanner(System.in);
System.out.println("enter the number of stars");
int  stars=inpu.nextInt();
int i,j;
for(i=0;i<stars;i++)
{
    
    for(j=0;j<i;j++)
    {     System.out.print("*");
}
    System.out.print("\n");
    }
    
}
}