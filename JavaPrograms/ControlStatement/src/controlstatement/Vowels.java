/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatement;

/**
 *program name : vowels using if else statement
 * @author harid
 */
import java.util.Scanner;
public class Vowels {
  public static void main(String[] args)
  {
 Scanner ab=new Scanner(System.in);
  System.out.println("enter the character to check");
char c=ab.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
          System.out.println("the given character is a vowels");
else
          System.out.println("the given character is not a vowels");
  }
}
