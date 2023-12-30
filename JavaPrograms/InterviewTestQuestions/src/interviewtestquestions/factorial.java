/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewtestquestions;

import java.util.Scanner;

/**
 *
 * @author harid
 */
public class factorial {
    public static void main(String[] args)
   {
	   Scanner input=new Scanner(System.in);
	   System.out.println("enter the factorial number");
	   int  number=input.nextInt();
	   check(number);
   }   
	public static int check(int number)
	{  // System.out.println(number);
		if(number==1)
		{
			//System.out.println(number);
			return 1;
		}
        else
        {
			int result=number*check(number-1);
                        System.out.println(result);
			return 0;
                        
		}	
	}	 
    
    
    
}
