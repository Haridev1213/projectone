/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetInterface;

/**
 *program name : remove duplicate from linked list using linked hash set
 * @author harid
 */
import java.util.LinkedList;
import java.util.LinkedHashSet;
public class RemoveDuplicate {
public static void main(String[] args) {
LinkedList<String> ab=new LinkedList<>();
ab.add("hi");
ab.add("hello");
ab.add("welcome");
ab.add("hi");
    System.out.println(ab);
LinkedHashSet ac=new LinkedHashSet(ab);
    System.out.println(ac);
    
    }
    
}
