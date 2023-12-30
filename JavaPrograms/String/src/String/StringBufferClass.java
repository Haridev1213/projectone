/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *program name : string buffer
 * @author harid
 */
public class StringBufferClass {
public static void main(String[] args) {
//String buffer Append operation
StringBuffer s=new StringBuffer("hari");
s.append("dev");
    System.out.println(s);
// String Buffer insert string method
s.insert(2,"ded");
    System.out.println(s);
//STRING BUFFER REPLACE:
s.replace(1, 2,"prabhu");
    System.out.println(s);
//STRING BUFFER DELETE
s.delete(0,12);
    System.out.println(s);
//String Buffer  Reverse    
s.reverse();
    System.out.println(s);
 //String Buffer capacity() Method:
 StringBuffer s1=new StringBuffer();
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
