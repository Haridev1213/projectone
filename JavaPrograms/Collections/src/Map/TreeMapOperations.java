/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

/**
 *program name : To print a tree map operations
 * @author harid
 */
import java.util.*;
public class TreeMapOperations {
public static void main(String[] args) {
TreeMap ab=new TreeMap();
//put operation
ab.put(1, "wel");
ab.put(3, "hai");
ab.put(5, "hello");
ab.put(2, "van");
    System.out.println("put operation\t"+ab);
//Ceiling Entry Operation
System.out.println("ceiling entry operation"+ab.ceilingEntry(4));
//Ceiling key Operation
System.out.println("Celing  key operation"+ab.ceilingKey(4));
//void clear operatiion
//ab.clear();
//System.out.println("clear operation"+ab);
//Descending Key Set operations
System.out.println("Navicable set Descending key setoperation\t"+ab.descendingKeySet());
//Descending maps
System.out.println("Descending map Operaation"+ab.descendingMap());
//First entry operation
System.out.println("First entry operations\t"+ab.firstEntry());
//floor entry operation
System.out.println("floor entry operation"+ab.floorEntry(4));
//Head map operation sorted order
System.out.println("head map operations"+ab.headMap(3));
//Head map operation navicable operations
System.out.println("Head map operations using navicable map\t"+ab.headMap(3, true));
//higher entry operation
System.out.println("high entry operations\t"+ab.higherEntry(3));
//higher key operation
System.out.println("higher key operation\t"+ab.higherKey(2));
//key set operation
System.out.println("key set operation\t"+ab.keySet());
//last entry operation
System.out.println("last entry operation\t"+ab.lastEntry());
//lower entry operation
System.out.println("lower entry operation\t "+ab.lowerEntry(2));
//Navicable key set operation
System.out.println("navicable key set operation\t"+ab.navigableKeySet());
//poll first entry operation
System.out.println("poll first entry operation\t"+ab.pollFirstEntry());
ab.put(1, "hari");
//poll last entry operation
System.out.println("poll last entry operaion\t"+ab.pollLastEntry());
ab.put(5, "dev");
//replace operation
ab.replace(2, "vinayak");
    System.out.println("Replace operation\t"+ab);
//Collection value operation
System.out.println("value operation"+ab.values());
//Navicable sub map operation
System.out.println("navicable sub map operation"+ab.subMap(1, true, 3, true));
//Sorted sub map operation
System.out.println("Sorted sub map operation"+ab.subMap(1, 3));
//Sorted tail map
System.out.println("sorted tail map operation\t"+ab.tailMap(3));
//Navicable tail map
System.out.println("Navicable tail map operation"+ab.tailMap(3, true));
//Boolean contains key operation
System.out.println("Boolean conntains key operation\t"+ab.containsKey(4));
//Boolean contains value operation
System.out.println("Boolean contains Value operation\t"+ab.containsValue("vinayak"));
//first key operation
System.out.println("first key operation\t"+ab.firstKey());
//get operation
System.out.println("get operation\t"+ab.get(5));
//last key operation
System.out.println("last key operation\t"+ab.lastKey());
//remove operation
System.out.println("remove operation\t"+ab.remove(3));
//entry set operation
System.out.println("entry set operation\t"+ab.entrySet());



}
   
    
}
