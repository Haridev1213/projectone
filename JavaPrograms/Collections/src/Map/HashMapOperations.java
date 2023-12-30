
package Map;

/**
 *Program name : To print a HashMapOperations
 * @author harid
 */
import java.util.*;
public class HashMapOperations {
public static void main(String[] args) {
HashMap ab= new HashMap();
HashMap bc= new HashMap();
//put operation
ab.put(1, "hoi");
ab.put(2, "hoi");
ab.put(3, "hoi");
//clear operation
//ab.clear();
System.out.println("clear operation"+ab);
// clone operation
ab.clone();
System.out.println("clone operation"+ab);
//Boolean is empty operation
System.out.println("Empty operation"+ab.isEmpty());
//Set Entry Set Operation
ab.entrySet();
    System.out.println("entry set operation"+ab);
//key set operation
System.out.println("key set operation"+ab.keySet());
//void put all operation
bc.put(5, "hoa");
ab.putAll(bc);
    System.out.println("putall operation"+ab);
//putifabscent operation
ab.putIfAbsent(4, "hi");
    System.out.println("putifabscentoperation\t"+ab);
//remove operation
System.out.println("remove operation\t"+ab.remove(bc));
//remove operation boolean
System.out.println("remove operation boolean\t"+ab.remove(1, "hoi"));
//boolean contain key
System.out.println("boolean contain key\t"+ab.containsKey(3));
//boolean contain value
System.out.println("boolean contain value\t"+ab.containsValue("hoi"));
//boolean equals operation
System.out.println("booleaan equal operation\t"+ab.equals(bc));
//void for each operation
//ab.forEach(1);
//System.out.println("void for each operation"+);
//get operation
System.out.println("get operation\t"+ab.get(3));
//get or default operation
System.out.println("get or default operation"+ab.getOrDefault(4,"h0i"));
//boolean is empty operation
System.out.println("boolean is empty operation\t"+ab.isEmpty());
//int size operation
System.out.println("int size operation\t"+ab.size());
//replace operation
ab.replace(2, "hello");
System.out.println("replace operation"+ab);
//boolean replace operation
System.out.println("boolean replace operation"+ab.replace(2, "hello", "raj"));
//void replace all operationn
//ab.replaceAll(4);
//System.out.println("void replace all operation"+);
//collection values
System.out.println("collection value operation\t"+ ab.values());
}
    
}
