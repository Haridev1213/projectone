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
public class StringReverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the statement");
        String stat=input.nextLine();
        int length=stat.length();
       // System.out.println(length);
        for(int i=length-1;i>=0;i--)
        {
            System.out.println(stat.charAt(i));
        }
    }
    
}