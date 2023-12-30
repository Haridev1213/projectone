/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *program name : Exception Handling operations
 * @author harid
 */
import java.util.Scanner;

public class UncheckedExceptionDemo{
public static void main(String[] args) {
 Scanner ab=new Scanner(System.in);
    System.out.println("enter the a and b values");
    int a=ab.nextInt();
    int b=ab.nextInt();  
    
    
    try{
    int div=a/b;
    System.out.println("divide is"+div);
    int arr[]=null;
        System.out.println(arr[1]);
    }
    catch(ArithmeticException ae)
            {
                System.out.println("b is not equal to zero ");        
                         
            
            }
    catch(NullPointerException ae )
    {
        System.out.println("there is no element in the array");
    }
    finally{
        System.out.println("end of the program");
    }
    

}    
}
