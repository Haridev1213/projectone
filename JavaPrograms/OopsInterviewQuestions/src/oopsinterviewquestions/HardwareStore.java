/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopsinterviewquestions;

import java.util.Scanner;

/**
 *
 * @author harid
 */
public class HardwareStore{
	
 public static void main(String[] args)
 {
	Scanner input=new Scanner(System.in);
	System.out.println("enter the part number");
	String panum=input.nextLine();
    System.out.println("enter the part Description");
	String padesc=input.nextLine();
    System.out.println("enter the quantity");
	int quantit=input.nextInt();
    System.out.println("enter the price");
    double pric=input.nextDouble();  
    Invoice obj=new Invoice(panum,padesc,quantit,pric);
    System.out.println(obj.getInvoiceAmount());
    
}    
}
