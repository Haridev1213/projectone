/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

/**
 *program name : Hash table operations
 * @author harid
 */
import java.util.*;

public class HashTableOperations {
    public static void main(String[] args) {
 Hashtable ab=new Hashtable(); 
 ab.put(1, "well");
 ab.put(2, "good");
 ab.put(5, "happie");
 ab.put(3, "sad");
 //put operation
 System.out.println("put operation"+ab);
 //put all operation
 Hashtable ac=new Hashtable();
 ac.put(4, "spidy");
 ac.putAll(ab);
 System.out.println("put all operation\t"+ac);   
 //clear operation
 ac.clear();
        System.out.println("clear operations \t"+ac);
// clone operation
Hashtable ad=(Hashtable)ab.clone();
        System.out.println("clone operation\t"+ad);
//element operation
System.out.println("element operation\t"+ab.elements());
//entry set operation
System.out.println("entry set operation\t"+ab.entrySet());
//replace operation
System.out.println("replace operation\t"+ab.replace(5, "car"));
        System.out.println(ab);
 //boolean equals operation
        System.out.println("boolean equals operation\t"+ab.equals(ad));
 //get operation
        System.out.println("get operation \t"+ab.get(2));
 //hashcode operation
        System.out.println("hash code operation"+ab.hashCode());
 //keys operation
        System.out.println("keys operation\t"+ab.keys());
 //keyset operation
        System.out.println("keyset operationn\t"+ab.keySet());
 //merge operation
  //      System.out.println("merge operration\t"+ab.merge(ab, ad));
//putif abscent operation
ab.putIfAbsent(6, "hello");
        System.out.println("putif abscent operation"+ab);
//boolean remove operation
System.out.println("boolean remove operation\t"+ab.remove(6, "hello"));
//boolean replace operation
System.out.println("boolean replace operation\t"+ab.replace(ab, ad, "hari"));
//string operation
System.out.println("string operation"+ab.toString());
//collection values operation
System.out.println("collection value operation"+ab.values());
//boolean contains 
System.out.println("boolean contains"+ab.contains(1));
        System.out.println("boolean contains key"+ab.containsKey(1));
        System.out.println("boolean contains value"+ab.containsValue("happie"));
//get operation
System.out.println("get operation"+ab.get(3));
//remove operation
System.out.println("remove operation"+ab.remove(1));
//size of operation
System.out.println("size of operation"+ab.size());
}
    
}
