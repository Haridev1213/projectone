/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionquestiontasks;

/**
 *program name : write a program too check if element value exists in Array list and HashSet
 * @author harid
 */
import java.util.*;
public class QuestionFour {
public static void main(String[] args) {
ArrayList ab=new ArrayList();
HashSet ac=new HashSet();
ab.add(1);
ab.add(2);
ab.add(3);
ac.addAll(ab);
    System.out.println("contains operation\n"+ac.contains(3));
    
    
    }
   
    
}
