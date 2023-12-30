/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingstatement;

/**
 *program name : for loop multiplication
 * @author harid
 */
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
        System.out.println("enter the table");
    int a=ab.nextInt();
    int i,b;
    for(i=1;i<=10;i++)
    {
        b=i*a;
        System.out.println(b);
    }
    }
  
    
}
