
package multithreading;

/**
 *program  name : MultiThreading example Delay  concept using Try Catch Method
 * @author harid
 */
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Character{
    void lett() 
    {
        for(int i=0;i<5;i++)
        {
            try {
                System.out.println("hello");
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Character.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    class Number{
        void num() {
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

public class Calculat{
public static void main(String[] args) {
        Character ab=new Character();
        Number ad =new Number();
 ab.lett();
 ad.num();
        
        
    }
    
}
