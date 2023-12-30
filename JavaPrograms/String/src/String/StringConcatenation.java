/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *program name : to print a string concatenation to two string
 * @author harid
 */
public class StringConcatenation {
public static void main(String[] args) {
//string concatenation by +(string concate)operator:
String s="hari"+"dev";
    System.out.println(s);
String s1=50+30+"hari"+40+40;
    System.out.println(s1);
 //String concate by concate() method:
    System.out.println(s.concat(s1));
    }
    
}
