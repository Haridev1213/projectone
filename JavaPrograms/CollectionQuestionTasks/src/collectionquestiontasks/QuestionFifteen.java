/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionquestiontasks;

/**
 *program name : 15 write a program to sort a Array list using comparator
 * @author harid
 */
import java.util.*;
public class QuestionFifteen {
public static void main(String[] args) {
ArrayList ab=new ArrayList();
ab.add(3);
ab.add(1);
ab.add(7);
ab.add(2);
ab.sort(Comparator.naturalOrder());
    System.out.println("Ascending order"+ab);
    }
}
