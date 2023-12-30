/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *program name :Annonmus operations
 * @author harid
 */
class num extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(1050);
            } catch (InterruptedException ex) {
                
            }
        }
        
    }
}
public class Annonmus {
public static void main(String[] args) {
Runnable ab=()->//Runnable or Lamba expression
        {
    //public void run() and run() must be public
            for(int j=1;j<=5;j++)
            {
                try {
                    System.out.println("updating");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Annonmus.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };        
num n=new num();
Thread a=new Thread(ab);
a.start();
n.start();


    }
 
}
