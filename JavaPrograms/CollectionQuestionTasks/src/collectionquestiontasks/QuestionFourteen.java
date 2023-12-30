/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionquestiontasks;

/**
 *program name : write a program to iterate TreeMap in java
 * @author harid
 */
import java.util.*;
public class QuestionFourteen {
public static void main(String[] args) {
TreeMap ab=new TreeMap();
ab.put(1, "hi");
ab.put(2,"hello");
ab.put(3, "hi");
    System.out.println(ab);
    Set s=ab.keySet();
    Collection c=ab.values();
    
    Iterator i=s.iterator();
    System.out.println("keys");
    while(i.hasNext())
    {
        System.out.println(i.next());
       
    }
    Iterator j=c.iterator();
    System.out.println("values");
    while(j.hasNext())
    {
        System.out.println(j.next());
    }
    }
    
}
