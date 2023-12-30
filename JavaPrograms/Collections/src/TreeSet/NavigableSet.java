/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeSet;

import java.util.TreeSet;

/**
 *
 * @author harid
 */import java.util.TreeSet;
public class NavigableSet {
public static void main(String[] args) {
TreeSet ab=new TreeSet(); 
ab.add("vankam");
ab.add("ellam");
ab.add("avan");
ab.add("seyal");
ab.add("zin");
    System.out.println(ab);
//Descening Set 
//System.out.println("Descending Set"+ab.descendingSet());
//headset operation

System.out.println("Headset operaton"+ab.headSet("avan"));
//Subset operation
System.out.println("subset operation"+ab.subSet("avan", true, "vanskam", true));
//tail set operation
System.out.println("tailset operation"+ab.tailSet("seyal"));

    }
   
}

    

