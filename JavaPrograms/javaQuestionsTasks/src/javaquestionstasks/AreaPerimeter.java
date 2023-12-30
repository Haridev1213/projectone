/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquestionstasks;

/**
 *program name : write a java program to print the area and perimeter of a circle 
 * @author harid
 */
import java.util.Scanner;
public class AreaPerimeter {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("enter the legth and bredth of the circle");
int length=input.nextInt();
int width=input.nextInt();
int area,peri;
area=length*width;
System.out.println("the area of the circle is= "+area);
peri=2*(length+width);
System.out.println("the perimeter of the circle is="+peri);
}    
}
