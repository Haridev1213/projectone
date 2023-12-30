/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashSet;

/**
 *program name : java HAsh Set example
 * @author harid
 */
import java.util.HashSet;
public class JavaHashSet {
public static void main(String[] args) {
String s1="hello";
String s2="hello";
if(s1.equals(s2))
{
    System.out.println("the given strings are equal");
    System.out.println("the hash values are"+s1.hashCode()+"\t"+s2.hashCode());
    
}
String s3="hello";
String s4="welcome";
if(!s3.equals(s4));
{
    System.out.println("the given string are not equal");
    System.out.println("the hash values are"+s3.hashCode()+"\t"+s4.hashCode());
}   
    
}}
