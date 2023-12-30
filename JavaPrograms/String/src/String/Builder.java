/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *Program name : String Builder
 * @author harid
 */
public class Builder {
public static void main(String[] args) {
//String Builder append method:
StringBuilder s = new StringBuilder("hari");
System.out.println(s.append("dev"));
//String Builder insert a string to the current string
s.insert(1, "hello");
    System.out.println(s);
//String Builder replace a current string    
s.replace(1, 9, "ari");
    System.out.println(s);
// String Builder delete a current string
s.delete(0, 4);
    System.out.println(s);
//String Buffer Reverse a current string
s.reverse();
    System.out.println(s);
//String Builder capacity() Method:
 StringBuilder s1=new StringBuilder();
    System.out.println(s1.capacity());
    s1.append("hari");
    System.out.println(s1.capacity());
s1.append("hari is a good boy");
    System.out.println(s1.capacity());
//String Buffer ensure capacity () method:
StringBuilder s2=new StringBuilder();
s2.append("hari");
    System.out.println(s2.capacity());
 s2.append("hari is good boy");
    System.out.println(s2.capacity());
 s2.ensureCapacity(10);
    System.out.println(s2.capacity());
 s2.ensureCapacity(50);
    System.out.println(s2.capacity());
    
    
    
    
    }
 }
