/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *program name : Synchronize operation 
 * @author harid
 */
import java.util.*;

class Table{
  synchronized  void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            try {
                
                System.out.println(n*i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                
            }
            
        }
    }
}
public class SynhroniseOperation {
public static void main(String[] args) {
Table t=new Table();
Thread t1=new Thread()
    {
       public void run()
       {
      t.printTable(5);
      
       } };
Thread t2=new Thread(){
        public void run()
        {
        t.printTable(10);
        }
};
Thread t3=new Thread(){
    public void run()
    {
     t.printTable(15);
    }
};
t1.start();
t2.start();
t3.start();
    }
    
}
