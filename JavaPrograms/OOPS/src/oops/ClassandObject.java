/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *program name : To create a class and object and Single level Inheritance 
 * @author harid
 */
import java.util.Scanner;
 class Person {


  String name; 
  int age;
  int marks;
  int id; 
 }
class Student extends Person
{
 void dis()
 {
   Scanner input = new Scanner(System.in);
   String name=input.nextLine();
   int age=input.nextInt();
   int marks=input.nextInt();
   int id=input.nextInt();
     System.out.println("the name is"+name+"the age is"+age+"the mark is"+marks+"the id is"+id);
   
 }   
}
     
   




