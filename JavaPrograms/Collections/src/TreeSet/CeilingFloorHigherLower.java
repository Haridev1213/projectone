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
 */
import java.util.TreeSet;
public class CeilingFloorHigherLower {
public static void main(String[] args) {
TreeSet ab=new TreeSet();
ab.add(5);
ab.add(8);
ab.add(3);
ab.add(10);
ab.add(6);
System.out.println(ab);
//ceiling print the highest and equal to the element
System.out.println("Ceiling operation\t"+ab.ceiling(3));
//floor print the lowest and equal element
System.out.println("floor Operation\t"+ab.floor(5));
//Higher print the nerest and higher element
System.out.println("Higher operation\t"+ab.higher(3));
//lower print the nerest and lowest element
System.out.println("lower Operation\t"+ab.lower(5));

}
}