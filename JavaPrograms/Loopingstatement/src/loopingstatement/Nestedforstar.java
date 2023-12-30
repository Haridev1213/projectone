/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : to print a star in sequence
 * @author harid
 */
import java.util.Scanner;
public class Nestedforstar {
public static void main(String[] args) {
Scanner inpu=new Scanner(System.in);
System.out.println("enter the no of stars");
int row=inpu.nextInt();
int i,j,space;
for(i=1;i<=row;i++)
{
    for(space=i;space<=row;space++)
    {
        System.out.print(" ");
        
    }
    for(j=1;j<=(i*2)-1;j++)
    {
        System.out.print("*");
        
    }
    System.out.print("\n");
}
}
}