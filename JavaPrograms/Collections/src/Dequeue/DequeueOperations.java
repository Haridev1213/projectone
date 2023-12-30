/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dequeue;

/**
 *program name : perform a dequeue operation
 * @author harid
 */
import java.util.ArrayDeque;
public class DequeueOperations {
public static void main(String[] args) {
ArrayDeque<Integer> ab=new ArrayDeque<>();
ArrayDeque<Integer> bc=new ArrayDeque<>();
// Add Operation
ab.add(5);
ab.add(10);
ab.add(4);
ab.add(8);
    System.out.println(ab);
//Add all Operation
bc.add(1);
bc.add(3);
bc.add(3);
bc.addAll(ab);
    System.out.println(bc);
//Offer operation
bc.offer(3);
System.out.println("offer operation"+bc);
//offer first operation
bc.offerFirst(10);
System.out.println(bc);
//remove operation
bc.remove(3);
    System.out.println(bc);
//poll operaton
bc.poll();
    System.out.println(bc);
//  element operation

System.out.println("element operation\t"+bc.element());
// peek operation
System.out.println("peek operation\t"+bc.peek());
    System.out.println(bc); 
    
    }
    
}
