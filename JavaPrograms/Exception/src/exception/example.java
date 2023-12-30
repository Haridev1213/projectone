/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author harid
 */
import java.util.*;
import java.lang.ArithmeticException;
public class example {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try
        {
        int c=a/b;
        System.out.println(c);
    }
    catch(ArithmeticException e){
        
        System.out.println("b is zero program cannot be runnable");
    }
        finally 
        {
           System.out.println("end");
      }
    
    }
}
