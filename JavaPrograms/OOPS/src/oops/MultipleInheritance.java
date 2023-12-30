/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *program name : Multiple inheritance
 * @author harid
 */
import java.util.Scanner;
class MultipleInheritance {
 Scanner input=new Scanner(System.in);
 void area()
 {
System.out.println("enter the length and bredth"); 
 int length=input.nextInt();
 int height=input.nextInt();
 }
    
    
}

class circle 
{
    Scanner ab=new Scanner(System.in);
    void radius()
    {
        System.out.println("enter the radius");
        int radius=ab.nextInt();
        
    }
}
//class Display extends Circle extends MultipleInheritance
//{
//void dis()
//{

//}
//}