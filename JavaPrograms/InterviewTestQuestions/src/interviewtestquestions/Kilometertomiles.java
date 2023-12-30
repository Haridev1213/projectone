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
public class Kilometertomiles {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the kilometer");
        double kilometer=input.nextDouble();
        double result=0.0;
        double miles=0.621371;
        for(double i=1.0;i<=kilometer;i++)
        {
            result=result+miles;
        }
        System.out.println(result);
    }
    
}
