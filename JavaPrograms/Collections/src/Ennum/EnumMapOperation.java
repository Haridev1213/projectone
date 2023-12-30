/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ennum;

/**
 *program name : Enum map Operation
 * @author harid
 */
import java.util.*;
enum Details
{
    AGE,ID,PHONENO,STANDARD
}
public class EnumMapOperation {
public static void main(String[] args) {
EnumMap<Details,Integer>ab=new EnumMap<>(Details.class);
ab.put(Details.AGE, 18);
ab.put(Details.ID, 123);
ab.put(Details.PHONENO, 99765);
ab.put(Details.STANDARD, 12);
    System.out.println("put operation"+ab);
//contains key operation
System.out.println("contain key operation"+ab.containsKey(Details.ID));
//clone operation
EnumMap<Details,Integer>bc=new EnumMap<>(Details.class);
bc.put(Details.STANDARD, 4);
bc=ab.clone();
    System.out.println("clone operations"+bc);
//contains value operation
System.out.println("contains value operation"+ab.containsValue(18));
//entry set operation
System.out.println("entry set operation"+ab.entrySet());
//equals operation
System.out.println("equals operation"+ab.equals(bc));
//get operation
System.out.println("get operation"+ab.get(Details.AGE));
//hash code operation
System.out.println("hash code operation"+ab.hashCode());
//key set operation
System.out.println("key set operation"+ab.keySet());
//size()operation
System.out.println("size()operation"+ab.size());
//value () operation
System.out.println("value() operation"+ab.values());
//put all operation
ab.putAll(bc);
System.out.println("put all operation"+ab);
//remove operation
bc.remove(Details.STANDARD);
System.out.println("remove operation"+bc);
    System.out.println("ab "+ab);


//


}
   
    
}
