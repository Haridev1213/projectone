/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatement;

/**
 *
 * program name : nested if using age
 */
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
Scanner ab=new Scanner(System.in);
        System.out.println("enter the age");
 int a=ab.nextInt();
 if(a>0&&a<5)
            System.out.println("the enterd age is baby");
if(a>=5&&a<10)
            System.out.println("the enterd age is child");
if(a>=10&&a<25)
            System.out.println("the entered age is boy or girl");
if(a>=25&&a<90)
            System.out.println("the enterd age is uncle or anty");
        
    }
    
                  
}
