
package Map;

/**
 *program name : To print a hash map operations
 * @author harid
 */
import java.util.HashMap;
import java.util.*;
public class HashMapExample {
public static void main(String[] args) {
HashMap ab=new HashMap();
//put operation to enter the values
ab.put(1,"hi");
ab.put(2,"helo");
ab.put(3,"vanakam");
    System.out.println(ab);
//To print keys only
Set s=ab.keySet();
    System.out.println("the keys are"+s);  
//To print values only
Collection s1=ab.values();
    System.out.println("the values are"+s1);
//To print a entry set because the iterator cannot print the key and values at the same time so its uses the  entry set operation
Set s2=ab.entrySet();
    System.out.println(s2);
//To print a iterator operation
Iterator i=s2.iterator();
while(i.hasNext())
{
   // System.out.println("itearator operation\t"+i.next());
    Map.Entry j=(Map.Entry)i.next();
//To perform a get and set operation
//get the key value and then checking them is equal to 1
if(j.getKey().equals(1))
//set operration    
j.setValue("hari");
    System.out.println("key\t"+j.getKey());
    System.out.println("value\t"+j.getValue());
}


}
    
    
}
