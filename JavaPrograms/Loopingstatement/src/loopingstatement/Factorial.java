/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : Factorial
 * @author harid
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
 Scanner ab=new Scanner(System.in);
 int i,fact=1;
        System.out.println("enter the  factorial number");
        int a=ab.nextInt(); 
for(i=1;i<=a;i++)        
{
    fact=fact*i;
}
        System.out.println("the factorial is "+fact);
    }
    
    
}
