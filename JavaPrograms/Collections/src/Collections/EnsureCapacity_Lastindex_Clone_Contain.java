/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *program name : To find the ensure capacity and last index and clone and Contain  
 * @author harid
 */
import java.util.ArrayList;
import java.util.Comparator;
public class EnsureCapacity_Lastindex_Clone_Contain {
public static void main(String[] args) {
ArrayList<String>s=new ArrayList<>();
s.add("hari");
s.add("dev");
s.add("prabhu");
s.add("hari");
s.ensureCapacity(2);
    System.out.println("ensure capacity"+s);
//last index
    System.out.println(s.lastIndexOf(s));
//clone
System.out.println(s.clone());
//Contain
System.out.println(s.contains("dev"));
//Trim to size
s.trimToSize();
    System.out.println("trim the size"+s.size());
//Sublist
System.out.println("thee sublist is"+s.subList(1, 2));
//sort
s.sort(Comparator.naturalOrder());
    System.out.println(s);
    }
    
}
