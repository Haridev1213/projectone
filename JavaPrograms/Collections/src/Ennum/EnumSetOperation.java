/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ennum;

/**
 *program name : Enum set operation
 * @author harid
 */
import java.util.*;
enum Students{
   GRADE,AGE,SUBJECT,STANDARD
}
public class EnumSetOperation {
public static void main(String[] args) {
EnumSet<Students>ab1,ab2,ab3,ab4,ab5,ab6;
//set all operation
ab1=EnumSet.allOf(Students.class);
    System.out.println("set all operation"+ab1);
//clone operation
ab2=EnumSet.copyOf(ab1);
    System.out.println("clone operation"+ab2);
//none of operation
ab3=EnumSet.noneOf(Students.class);
    System.out.println("none of operation"+ab3);
//complement operation
ab4=EnumSet.complementOf(ab3);
    System.out.println("complement operation"+ab4);
//range operation
ab5=EnumSet.range(Students.GRADE, Students.SUBJECT);
    System.out.println("range operation"+ab5);
//set of operation
ab6=EnumSet.of(Students.AGE,Students.GRADE);
    System.out.println("set of operation"+ab6);
    }
  
    
    
}
