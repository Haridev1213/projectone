/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *program name : Multiple Thread Runnable Operations
 * @author harid
 */
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Demo1 extends Demo2 implements Runnable  {
   public void run()
   {
       for(int i=0;i<5;i++)
       {
           try {
               System.out.println("hello");
               Thread.sleep(2000);
           } catch (InterruptedException ex) {
               Logger.getLogger(Demo1.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }
        }
class Demo2 extends Thread {
    public void run()
    {
        for(int j=0;j<5;j++)
        {
            try {
                System.out.println(j);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Demo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}       
public class Runnable_OPerations {
    public static void main(String[] args) throws InterruptedException {
        Runnable ab=new Demo1();
        Demo2 ac=new Demo2();
        Thread ad=new Thread(ab);
        ad.start();
        ac.start();     
        ad.join();
        System.out.println("ending");
    }
}
