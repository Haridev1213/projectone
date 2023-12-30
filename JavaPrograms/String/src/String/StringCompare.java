/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *program name : To compare a two string
 * @author harid
 */
public class StringCompare {
public static void main(String[] args) {
//string compare of equal() method
String s1="haris";
String s2="hari";
String s3=new String("dev");
String s4="hari";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
//string compare by == operrator 
System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s1==s4);
//string compare by compare to() methods:
System.out.println(s1.compareTo(s2));
    }
    
}
