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
public class Kilometerandmiles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter miles for m or kilometer for k");
        String value=input.nextLine();
        if(value.equals("m"))
        {
                 double miles=10.00;
                 double kilometer=16.09;
                 double resultmil=0.0;
                 double resultkilo=0.0;
                 System.out.println("Miles"+"\t"+"Kilometer"+"\n");
                 int num=1;
                 while(num<=10)
                    {
                    resultmil=resultmil+miles;
                    resultkilo=resultkilo+kilometer;
                    System.out.print(resultmil+"\t"+resultkilo+"\n");
                    num++;
                    }
        }
       else if(value.equals("k"))
        {
                 double miles1=6.21;
                 double kilometer1=10.00;
                 double resultmil1=0.0;
                 double resultkilo1=0.0;
                 System.out.println("Kilometer"+"\t"+"Miles"+"\n");
                 int num1=1;
                 while(num1<=10)
                    {
                    resultmil1=resultmil1+miles1;
                    resultkilo1=resultkilo1+kilometer1;
                    System.out.print(resultkilo1+"\t\t"+resultmil1+"\n");
                    num1++;
                    }
                
        }
    }
}
