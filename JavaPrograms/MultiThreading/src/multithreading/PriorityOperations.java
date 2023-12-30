/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *program name : Priority Operations
 * @author harid
 */
class num1 extends Thread
{
     public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(3050);
            } catch (InterruptedException ex) {
                
            }
        }
        
    }
}
public class PriorityOperations {
public static void main(String[] args) {

    Runnable ab=()->//Runnable or Lamba expression
        {
    //public void run() and run() must be public
            for(int j=1;j<=5;j++)
            {
                try {
                    System.out.println("updating");
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Annonmus.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };        
num1 n=new num1();
Thread a=new Thread(ab);
a.setName("pongal");
    System.out.println(a.getName());
    a.setPriority(10);
//a.setPriority(Thread.MAX_PRIORITY);
    System.out.println(a.getPriority());
    a.start();
    n.start();

    }
   
}
