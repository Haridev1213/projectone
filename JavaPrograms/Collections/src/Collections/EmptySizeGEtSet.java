/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *program name : To find a string empty,string Size,get,set
 * @author harid
 */
import java.util.ArrayList;
import java.util.List;

public class EmptySizeGEtSet {
public static void main(String[] args) {
List<String>tpc=new ArrayList<>();
//check the array list is empty
System.out.println(tpc.isEmpty());
//check the Array list size
tpc.add("google");
tpc.add("apple");
tpc.add("facebook");
tpc.add("Amazon");
tpc.add("tesla");
System.out.println(tpc.size());
//Retriew or Get the elements at a given index    
System.out.println("first company\t"+tpc.get(0));
System.out.println("second company"+tpc.get(1));
System.out.println("last company"+tpc.get(tpc.size()-1));
//set or modify the elements in a given index
tpc.set(3, "Tcs");
    System.out.println(tpc);
    
    }
    
}
