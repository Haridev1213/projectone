/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservation;

/**
 *program name : Bus ticket booking concept
 * @author harid
 */import java.util.Scanner;
 class BusReservation {
int busno[]=new int[3];
int capacity[]=new int[3];
void bus()
{
busno[0]=10;busno[1]=13;
busno[2]=15;
    System.out.println("select  the bus");   
    System.out.println("the bus no is "+busno[0]+"  Ac"+":trueTotal capacity "+3);
    System.out.println("the bus no is "+busno[1]+"  Ac"+":trueTotal capacity "+4);
    System.out.println("the bus no is "+busno[2]+"  Ac"+":trueTotal capacity "+3);
      
      
    }
    }
class Booking extends BusReservation
{
 Scanner input=new Scanner(System.in);
 void book()
 {   
     bus();
     System.out.println("enter 1 for booking and 2 for exit");
     int a=input.nextInt();
     if(a==1)
     {
     System.out.println("enter the passenger name");
     input.nextLine();
    String passengername=input.nextLine();
     System.out.println("enter the Bus no");
    int busno=input.nextInt();
    if(busno==10||busno==13||busno==15)
    {
     System.out.println("enter the dob");
    int dob=input.nextInt();
        System.out.println("your booking is confirmed");
        System.out.println("enter 1 for booking 2 for exit");
}
    else 
    {
        System.out.println("the enter bus no is wrong");
    }
    
}
     else
     {
         System.out.println("thankyou");
     }
} 
}

