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
public class Multiplicationtables {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		System.out.println("enter the tablesnumber and limit");
		int tablesnumber=input.nextInt();
		int limit=input.nextInt();
		for(int number=1;number<=limit;number++)
		{
                    System.out.print("\t\n");
			for(int number1=1;number1<=tablesnumber;number1++)
			{
				int number3=number1*number;
                                System.out.print("\t");
				System.out.print(number3);
                                System.out.print("\t");
                               
			}	
		
			
		}	
		
    }
    
}
