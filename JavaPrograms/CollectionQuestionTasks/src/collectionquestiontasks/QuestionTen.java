/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionquestiontasks;

/**
 *program name :10 Write a program to sort Array List in descending order
 * @author harid
 */
import java.util.*;
public class QuestionTen {
public static void main(String[] args) {
ArrayList ab=new ArrayList();
ab.add(5);
ab.add(10);
ab.add(2);
ab.add(3);
ab.sort(Comparator.reverseOrder());
    System.out.println("reverse order\t"+ab);

    
    
    }
 
}
