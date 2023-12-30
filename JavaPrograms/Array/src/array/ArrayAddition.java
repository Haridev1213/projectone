/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name: sum of all the elements in the single dimensional array
 * @author harid
 */
import java.util.Scanner;
public class ArrayAddition {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int arr[]=new int[5];
int size=5,i;
    System.out.println("enter the elements in the array");
for(i=0;i<size;i++)
{
  arr[i]=input.nextInt();  
}   
int sum=0;
        
for(i=0;i<size;i++)
{
    sum=sum+arr[i];
}     
    System.out.println("the sum of the array is"+sum);    
    
    }
}
