/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetInterface;

/**
 *program name : java hashset operations
 * @author harid
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
public class JavaHashSet {
public static void main(String[] args) {
HashSet ab=new HashSet();
LinkedHashSet ac=new LinkedHashSet();
ab.add(10);
ab.add(30);
ab.add(35);
ab.add(50);
ab.add(35);
    System.out.println(ab);
//linked hashset operations it makes them to ascending order
ac.add(10);
ac.add(30);
ac.add(35);
ac.add(50);
ac.add(35);
    System.out.println(ac);
    }
    
    
}
