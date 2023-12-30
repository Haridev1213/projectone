/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *program name : to find a queue operations
 * @author harid
 */
import java.util.PriorityQueue;
public class QueueOperations {
public static void main(String[] args) {
PriorityQueue <Integer> ab=new PriorityQueue<>();
ab.add(1);
ab.add(7);
ab.add(5);
ab.add(10);
ab.add(8);
//offer operations
/*ab.offer(3);
    System.out.println(ab);
// remove operation
ab.remove(3);
    System.out.println(ab);
 //element operation
    System.out.println("poll operation\t"+ab.poll());
 //element operation
    System.out.println("element operation\t"+ab.element());
  */
//peek operation
System.out.println("peek operation"+ab.peek());
    
    
    }
    
    
}
