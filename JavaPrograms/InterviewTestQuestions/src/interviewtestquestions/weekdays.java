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
public class weekdays {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
    System.out.println("enter the weekday and vacation");
String weekday=input.nextLine();
String vacation=input.nextLine();

if(weekday.equals(true)&&vacation.equals(true) )
{
    System.out.println("true");
}
else if(weekday.equals('false')&&vacation.equals(false))
        {
            System.out.println("true");
        }
else if(weekday.equals(false)&&vacation.equals(true))
{
    System.out.println("true");
    
}
else
{
    System.out.println("false");
}
    }
    
}
