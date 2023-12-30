/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author harid
 */
public class Methods {
public static void main(String[] args) {
String s="wel come man free";
String s2="Hello";
String s3="HELLO";
    System.out.println(s.charAt(6));//return char
    System.out.println(s.substring(6));//Begin index
    System.out.println(s.substring(8,10));//Begin and end index
    System.out.println(s.contains("r"));//Boolean contain
    System.out.println(s.equals(s2));//Boolean equal 
    System.out.println(s2.isEmpty());//Boolean empty
    System.out.println(s3.isEmpty());//Boolean empty
    System.out.println(s2.concat("world"));//string concatenation or string joining
    System.out.println(s.replace('e', 'a'));//String Replace or Character replace
    String arr[]=s.split(" ");//string split
    for(String s4:arr)
    {
        System.out.println(s4);
       
    }
    System.out.println(s2.toLowerCase());//String Lowercase
    System.out.println(s.toUpperCase());//String Uppercase
    System.out.println(s.indexOf("m"));//index location of a character
    System.out.println(s2.equalsIgnoreCase(s3));//strring ignore equals
    System.out.println(s2.equals(s3));//string equqals
    }
    
}
