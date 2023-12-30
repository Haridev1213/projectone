/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.LinkedList;

/**
 *program name : push and pop operation
 * @author harid
 */
import java.util.LinkedList;
public class PUshPop {
public static void main(String[] args) {
LinkedList<String> list=new LinkedList<>();
list.add("hi");
list.add("welcomr");
list.add("spdy");
//push operationn: add the string in the first array index of 0
list.push("good");
System.out.println(list);
// pop operation : remove the string in the array index of 0
list.pop();
    System.out.println(list);
    }
    
    
}
