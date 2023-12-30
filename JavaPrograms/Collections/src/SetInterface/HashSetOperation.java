/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetInterface;

/**
 *program name : Hashset Operation
 * @author harid
 */
import java.util.HashSet;
import java.util.Iterator;
public class HashSetOperation {
public static void main(String[] args) {
HashSet ab=new HashSet();
//add operation
ab.add("hari");
ab.add("dev");
ab.add("world");
    System.out.println("add operation\t"+ab);
//clear operation
//ab.clear();
//System.out.println(ab);
//clone Operaation
ab.clone();
    System.out.println("clone operation\t"+ab);
//contains operation
System.out.println("contains operation\t"+ab.contains("ha"));
//empty operaation
System.out.println("empty operation\t"+ab.isEmpty());
//Iterator Operation
Iterator ac=ab.iterator();
while(ac.hasNext())
{
    System.out.println("iterator operation\t"+ac.next());
    
}
//Size () operation
System.out.println("size()operation\t"+ab.size());
//remove operation

System.out.println("remove operation\t"+ab.remove("world"));


    }
    
    
}
