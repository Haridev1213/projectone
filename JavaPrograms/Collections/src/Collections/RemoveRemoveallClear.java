/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *program name : to find a array list to remove removeall removeif clear operations
 * @author harid
 */
import java.util.ArrayList;
        
public class RemoveRemoveallClear {
public static void main(String[] args) {
ArrayList<String>language=new ArrayList<>();
language.add("c");
language.add("c++");
language.add("java");
language.add("python");
//Remove the element in the index address
language.remove(3);
    System.out.println(language);
//remove all  the elemnts in the index given
ArrayList<String>language1=new ArrayList<>();
language1.add("c++");
        
language.removeAll(language1);
    System.out.println(language);
  
 // clear the elements in the idex given   
language.clear();
    System.out.println(language);
}
   
    
    
}
