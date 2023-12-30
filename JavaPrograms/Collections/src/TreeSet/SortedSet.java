/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeSet;

/**
 *
 * @author harid
 */
import java.util.TreeSet;
public class SortedSet {
public static void main(String[] args) {
TreeSet ab=new TreeSet();
ab.add("vankam");
ab.add("ellam");
ab.add("avan");
ab.add("seyal");
ab.add("zin");
    System.out.println(ab);
    //headset operation
    System.out.println("headset operation"+ab.headSet("seyal"));   
    //subset
    System.out.println("subset operation"+ab.subSet("ellam", "zin"));
    //tailset
    System.out.println("tailset operation"+ab.tailSet("seyal"));
    
   }
   
    
}
