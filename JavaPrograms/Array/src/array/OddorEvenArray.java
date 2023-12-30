/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *program name:to find odd or even in the array
 * @author harid
 */
import java.util.Scanner;
public class OddorEvenArray {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int arr[]=new int[5];
int size=5,i;
System.out.println("enter the elements of the array");
for(i=0;i<size;i++)
{  
arr[i]=input.nextInt();
    }
 for(i=0;i<size;i++)
 {
     if(arr[i]%2==0)
         System.out.println("the given array is even"+arr[i]);
     else
         System.out.println("the given array is odd"+arr[i]);
 }    
    
}
}