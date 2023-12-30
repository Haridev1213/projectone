/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.LinkedList;

/**
 *Program name : Linked List Operation
 * @author harid
 */
import java.util.LinkedList;
import java.util.*;
public class JavaLinkedList {
    public static void main(String[] args) {
//add operation        
LinkedList<String> list = new LinkedList<>();
LinkedList<String> list1=new LinkedList<>();
list.add("hari");
list.add("dev");
        System.out.println("add operation\t"+list);
//add all operation
list.addAll(list);
        System.out.println("add all operation\t"+list);
//add first operation
list.addFirst("prabhu");
        System.out.println("add first operation\t"+list);
//add last operation
list.addLast("naveen");
        System.out.println("add last operation\t"+list);
// clear operation
list.clear();
        System.out.println("clear operation\t"+list);
//Clone Operation
list.add("dev");
list.add("hari");
list.clone();
        System.out.println("clone\t"+list);
// DescendingIterator Operation
list.descendingIterator();
        System.out.println("descending iterator\t"+list);
//element operation
list.element();
        System.out.println("element\t"+list);
//get operation
        System.out.println("get operation\t"+list.get(0));
//get first operation
System.out.println("get first operation\t"+list.getFirst());
//get last operation
System.out.println("get last operation\t"+list.getLast());
//index of operation string name will be entered in the ()
System.out.println("index operation\t"+list.indexOf("dev"));
//last index of operation
list1.add("madhan");
list1.add("matti");
System.out.println("last index operation"+list1.lastIndexOf("dev"));
//remove operation
list1.remove(1);
System.out.println("remove operation\t"+list1);
//remove first operation
System.out.println("removc first\t"+list1.removeFirst());
//Element index o element will be printed
System.out.println("element operation\t"+list.element());
//offer operation adding a element in the linked list
list.offer("hello");
System.out.println("offer operation\t"+list );
//first offer operation 
list.offerFirst("helo");
System.out.println("first offer operation"+list);   
//peek operation and peek first and peek last

 System.out.println("peek operation\t"+list.peek());
 System.out.println("peek first operation\t"+list.peekFirst());
 System.out.println("peek last operation\t"+list.peekLast());
 //poll operation and poll first and poll last
 System.out.println("poll operation\t"+list.poll());
 System.out.println("poll firstoperation\t"+list.pollFirst());
 System.out.println("poll last operation\t"+list.pollLast());
 
      
}}
