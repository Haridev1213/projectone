/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionquestiontasks;

/**
 *Program name : 3.write a program to iterator the HashSet
 * @author harid
 */
import java.util.*;
public class QuestionThree {
public static void main(String[] args) {
HashSet ab=new HashSet();
ab.add(1);
ab.add(2);
ab.add(3);
ab.add(4);
ab.add(5);
    System.out.println("the hash set is "+ab);
 Iterator i=ab.iterator();
 while(i.hasNext())
 {
     System.out.println("iterator operation is"+i.next());
       
 }    
    }
  
}
