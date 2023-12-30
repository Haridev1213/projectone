/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name : Array user giving input and the display in the for each loop
 * @author harid
 */
import java.util.Scanner;
public class ForEachLoopUserInput {
public static void main(String[] args) {
int arr[]=new int[5];
System.out.println("enter the size of an array");
Scanner input=new Scanner(System.in);
int size=input.nextInt();
for(int i=0;i<size;i++)
{
    System.out.println("enter the elements in the arraay");
   arr[i]=input.nextInt();    
}    
    for(int j:arr)
    {
        System.out.println(); 
        
    }
}}
