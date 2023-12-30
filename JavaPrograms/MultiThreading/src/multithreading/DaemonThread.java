/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *program name : Daemon Thread Operation
 * @author harid
 */
public class DaemonThread extends Thread {
 public void run()
 {
     if(Thread.currentThread().isDaemon())
     {
         System.out.println("Daemon Thread Works");
     }
  else
     {
         System.out.println("user Thread works ");
         
     }
 }
    public static void main(String[] args) {
        DaemonThread t=new DaemonThread();
        DaemonThread t1=new DaemonThread();
        DaemonThread t2=new DaemonThread();
        t.setDaemon(true);
        t.start();
        t1.start();
        t2.start();
    }
}
