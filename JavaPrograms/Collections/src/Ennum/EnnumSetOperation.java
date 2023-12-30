/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ennum;

/**
 *program name : ennum set operation 
 * @author harid
 */
import java.util.EnumSet;
enum Student
{
    STANDARD,AGE,GRADE,SUBJECT
}

public class EnnumSetOperation {
    public static void main(String[] args) {
        EnumSet<Student>set1,set2,set3,set4,set5,set6,set7;//initialization set
      //ennum set off operation  
        EnumSet<Student> enumSet1 = EnumSet.of(Student.STANDARD,Student.AGE);
        System.out.println("ennum set of operation"+enumSet1);
     //all of operatoion
     EnumSet<Student> enumset2=EnumSet.allOf(Student.class);
        System.out.println("all of operation"+enumset2);
     //copy of operation
     EnumSet<Student> enumset3=EnumSet.copyOf(enumSet1);
        System.out.println("copy of operation"+enumset3);
     //none off operation
     EnumSet<Student> enumset4=EnumSet.noneOf(Student.class);
        System.out.println("none of operation"+enumset4);
     //range of operation
     EnumSet<Student> enumset5=EnumSet.range(Student.STANDARD,Student.GRADE );
        System.out.println("range of operation"+enumset5);
     //complement of operation
     EnumSet<Student> enumset6=EnumSet.complementOf(enumset4);
        System.out.println("complement operation"+enumset6);
     
    }
    }
   
    

