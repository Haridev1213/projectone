/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewtestquestions;

/**
 *
 * @author harid
 */
import java.util.Scanner;
public class PoundstoKM {
   public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   System.out.println("enter m for miles and k for kilometer and p for pounds");
   String selection=input.nextLine();
    switch(selection)
   {
	case "m":
	System.out.println("enter the miles");
        double miles=input.nextDouble();
        double result=0.0;
        double kilometer=1.609;
        for(double i=1.0;i<=miles;i++)
        {
            result=result+kilometer;
        }
        System.out.println("Kilometer="+result);
        break;	
        case "k":
        System.out.println("enter the kilometer");
        kilometer=input.nextDouble();
        result=0.0;
        miles=0.621371;
        for(double i=1.0;i<=kilometer;i++)
        {
            result=result+miles;
        }
        System.out.println("Miles="+result);
        break;
	case "p":
	System.out.println("enter the pound");
	double pound=input.nextDouble();
        double kilogram=0.453592;
        result=0;
        for(double i=1.0;i<=pound;i++)
        {
            result=result+kilogram;
        }
            System.out.println("Kilogram="+result);
	 break;
        default:
            System.out.println("wrong selection");
   }	   
	

}
    
}
