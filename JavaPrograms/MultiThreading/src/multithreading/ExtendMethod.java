/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *program name : Thread operation using void run instead of class and extends
 * @author harid
 */
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
    class Characterone extends Thread{
    public void run() 
    {
        for(int i=0;i<5;i++)
        {
            try {
                System.out.println("hello");
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Character.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    class Numberone extends Thread{
   public void run() {
          for(int j=0;j<5;j++)
          {
              System.out.println(j);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException ex) {
                  Logger.getLogger(Number.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
                }
    }


    public class ExtendMethod{
public static void main(String[] args) throws InterruptedException {
        Characterone ab=new Characterone();
        Numberone ad =new Numberone();
 ab.start();
 ad.start();
//is alive operation
if(ab.isAlive())
{
    System.out.println("still running ");
}
//Join operation of the statement is commpleting
ab.join();
    System.out.println("ending");

    }
    
}

