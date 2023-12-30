/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatement;

/**
 *program name :  switch operations using symbols
 * @author harid
 */
import java.util.Scanner;
public class SwitchOperationsymbol {
    public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
        System.out.println("enter two numbers");
     int a=ab.nextInt();
     int b=ab.nextInt();
        System.out.println("enter the symbol for\n + addition \n - subtraction \n * multiplication \n / dividion 1 exit");
char c=ab.next().charAt(0);
switch(c)
{
    case '+':
        System.out.println("the sum is"+(a+b));
    break;
    case '-':
        System.out.println("the subtraction is"+(a-b));
        break;
    case '*':
        System.out.println("the multi is"+(a*b));
        break;
    case '/':
        System.out.println("the divi is"+(a/b));
        break;
    default:
        System.out.println("thankyou");    
            
}
}    
}
